package study.blaife.example.dynamicrevise;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.PackageElement;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import javax.tools.JavaFileObject;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Set;

/**
 * AbstractProcessor 处理
 *
 * @author: magd39318
 * @date: 2022/3/11 13:19
 */
@SupportedAnnotationTypes({"study.blaife.example.dynamicrevise.SetField"})
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class DicProcessor extends AbstractProcessor {
    public static final String SUFFIX = "AutoGenerate";
    public static final String PREFIX = "My_";

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        Messager messager = processingEnv.getMessager();
        System.out.println("11111111111");
        for (TypeElement typeElement : annotations) {
            for (Element e : roundEnv.getElementsAnnotatedWith(typeElement)) {
                //打印
                messager.printMessage(Diagnostic.Kind.WARNING, "Printing:" + e.toString());
                messager.printMessage(Diagnostic.Kind.WARNING, "Printing:" + e.getSimpleName());
                messager.printMessage(Diagnostic.Kind.WARNING, "Printing:" + e.getEnclosedElements().toString());

                //获取注解
                SetField annotation = e.getAnnotation(SetField.class);
                //获取元素名并将其首字母大写
                String name = e.getSimpleName().toString();
                char c = Character.toUpperCase(name.charAt(0));
                name = String.valueOf(c + name.substring(1));
                //包裹注解元素的元素, 也就是其父元素, 比如注解了成员变量或者成员函数, 其上层就是该类
                Element enclosingElement = e.getEnclosingElement();
                //获取父元素的全类名,用来生成报名
                String enclosingQualifiedname;
                if (enclosingElement instanceof PackageElement) {
                    enclosingQualifiedname = ((PackageElement) enclosingElement).getQualifiedName().toString();
                } else {
                    enclosingQualifiedname = ((TypeElement) enclosingElement).getQualifiedName().toString();
                }
                try {
                    //生成包名
                    String generatePackageName = enclosingQualifiedname.substring(0, enclosingQualifiedname.lastIndexOf("."));
                    // 生成的类名
                    String genarateClassName = PREFIX + enclosingElement.getSimpleName() + SUFFIX;
                    //创建Java 文件
                    JavaFileObject f = processingEnv.getFiler().createSourceFile(genarateClassName);
                    // 在控制台输出文件路径
                    messager.printMessage(Diagnostic.Kind.WARNING, "Printing: " + f.toUri());
                    Writer w = f.openWriter();
                    try {
                        PrintWriter pw = new PrintWriter(w);
                        pw.println("package " + generatePackageName + ";");
                        pw.println("\npublic class " + genarateClassName + " { ");
                        pw.println("\n    /** 打印值 */");
                        pw.println("    public static void print" + name + "() {");
                        pw.println("                // 注解的父元素: " + enclosingElement.toString());
                        pw.println("                System.out.println(\"代码生成的路径: " + f.toUri() + "\");");
                        pw.println("                System.out.println(\"注解的元素: " + e.toString() + "\");");
                        pw.println("                System.out.println(\"注解的内容: " + annotation.value() + "\");");
                        pw.println("    }");
                        pw.println("}");
                        pw.flush();
                    } finally {
                        w.close();
                    }
                } catch (IOException e1) {
                    processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR,
                            e1.toString());
                }
            }
        }
        return true;
    }
}
