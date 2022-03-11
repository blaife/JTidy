package study.blaife.example.dynamicrevise;

import java.util.Arrays;

/**
 * Set 注解解析器
 *
 * @author: magd39318
 * @date: 2022/3/10 15:17
 */
public class SetParser {

    public <T> void parser(T c) {
        Arrays.asList(c.getClass().getDeclaredFields()).parallelStream().forEach(a -> {
            if (a.getAnnotation(SetField.class) != null) {
                a.setAccessible(true);
                try {
                    a.set(c, a.getAnnotation(SetField.class).value());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        });
    }

}
