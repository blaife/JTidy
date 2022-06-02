package study.blaife.example.fixedlengthfileparsing;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 定长文件解析注解
 *
 * @author: magd39318
 * @date: 2022/3/31 9:45
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Format {

    String value();

    int length();

    int order();



}
