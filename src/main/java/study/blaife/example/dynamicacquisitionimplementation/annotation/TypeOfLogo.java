package study.blaife.example.dynamicacquisitionimplementation.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: magd39318
 * @Date: 2021/8/11 14:41
 **/
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface TypeOfLogo {

    String value();

}
