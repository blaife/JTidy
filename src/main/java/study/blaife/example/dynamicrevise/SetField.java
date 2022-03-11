package study.blaife.example.dynamicrevise;

import java.lang.annotation.*;

/**
 * 赋值
 *
 * @author: magd39318
 * @date: 2022/3/10 13:33
 */
@Target(ElementType.FIELD)
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface SetField {
    String value() default "";
}
