package study.blaife.example.dynamicacquisitionimplementation.util;

import study.blaife.example.dynamicacquisitionimplementation.annotation.TypeOfLogo;
import study.blaife.example.dynamicacquisitionimplementation.service.TopInterface;

import java.io.File;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
/**
 * @Author: magd39318
 * @Date: 2021/8/11 10:42
 **/
public class ClassForUtil {

    /**
     * 通过一个传递的class对象获取其所有的
     *
     * spring中包含一个方法ApplicationContext.getBeansOfType()来获取对应实现
     * 目前案例用于学习  使用基本的反射来获取其实现
     *
     * 要求代码结构为 service.impl 只会去寻找传入接口的统计目录下的impl文件夹中搜索
     *
     * @param requiredType 接口的class对象
     * @param annotationStr 注解字符串 （根据此字段判断使用哪个实现）
     * @param <T>
     * @return
     */
    public static <T> T getBeans(Class<T> requiredType, String annotationStr) {
        // 判断传入内容是否是一个接口
        if (requiredType.isInterface()) {
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            // 得到传入接口对象的包名
            String packageName = requiredType.getPackage().getName();
            try {
                // 添加 `.impl` 来得到对应的文件
                packageName += ".impl";
                String path = packageName.replace('.', '/');
                Enumeration<URL> resources = classLoader.getResources(path);
                ArrayList<Class> classes = new ArrayList<Class>();
                while (resources.hasMoreElements()) {
                    URL resource = resources.nextElement();
                    // 得到impl文件夹
                    File directory = new File(resource.getFile());
                    File[] files = directory.listFiles();
                    for (File file : files) {
                        // 这里值判断对应class文件， 其他文件均不做处理，不进行递归查询
                        if (file.getName().endsWith(".class")) {
                            // 将此文件名，并组装路径后使用Class.forName得到对应class对象 添加到集合中
                            classes.add(Class.forName(packageName + "." + file.getName().substring(0,file.getName().length() - 6)));
                        }
                    }
                }
                // 对class对象进行处理 判断其是否是对应接口的实现
                for (Class s : classes) {
                    if (Arrays.asList(s.getInterfaces()).contains(requiredType)) {
                        Annotation annotation = s.getAnnotation(TypeOfLogo.class);
                        if (annotation != null &&
                                annotation.annotationType().getDeclaredMethod("value")
                                        .invoke(annotation).equals(annotationStr)) {
                            return (T) s.newInstance();
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}
