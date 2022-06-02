package study.blaife.example.fixedlengthfileparsing;

import study.blaife.example.fixedlengthfileparsing.entity.ProductF1;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 解析器
 *
 * @author: magd39318
 * @date: 2022/3/31 10:24
 */
public class Parser {

    public ProductF1 getFileTransition(byte[] FileBytes) {
        ProductF1 fileTransition = new ProductF1();
        /*
            1. 获取所有字段顺序
            2. 反射着填写字段
        */

        Field fields[] = fileTransition.getClass().getDeclaredFields();
        List<Field> fieldList = getOrderedField(fields);

        int index = 0;
        int warnLogIndex = 0;
        try {
            for (int i = 0; i < fieldList.size(); i++) {
                warnLogIndex = i;
                String methodName = "set" + fieldList.get(i).getName().substring(0, 1).toUpperCase() + fieldList.get(i).getName().substring(1);
                Method method = ProductF1.class.getMethod(methodName, String.class);
                method.invoke(fileTransition, new String (Arrays.copyOfRange(FileBytes,  index ,  index += fieldList.get(i).getAnnotation(Format.class).length())));
            }
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return fileTransition;
    }


    private List<Field> getOrderedField(Field[] fields){
        // 用来存放所有的属性域
        List<Field> fieldList = new ArrayList<>();
        // 过滤带有注解的Field
        for(Field f:fields){
            if(f.getAnnotation(Format.class)!=null){
                fieldList.add(f);
            }
        }
        // 这个比较排序的语法依赖于java 1.8
        fieldList.sort(Comparator.comparingInt(
                m -> m.getAnnotation(Format.class).order()));
        return fieldList;
    }

}
