package study.blaife.example.dynamicrevise;

import java.time.LocalDateTime;

/**
 * 执行操作
 *
 * @author: magd39318
 * @date: 2022/3/11 11:02
 */
public class Start {

    /**
     * 2022-03-11T11:25:10.268
     * Entity{value1='value1', value2='value2', valueBlank=''}
     * 2022-03-11T11:25:10.724
     *
     * 2022-03-11T11:25:45.220
     * Entity{value1='value1', value2='value2', valueBlank=''}
     * 2022-03-11T11:25:45.269
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());

        Entity entity = new Entity();
        SetParser setParser = new SetParser();
        setParser.parser(entity);
        System.out.println(entity);

        System.out.println(LocalDateTime.now());

    }
}
