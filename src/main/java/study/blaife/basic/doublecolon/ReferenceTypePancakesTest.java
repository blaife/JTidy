package study.blaife.basic.doublecolon;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @Author: magd39318
 * @Date: 2021/7/27 16:51
 **/
public class ReferenceTypePancakesTest extends BaseReferenceTypeTest {


    /**
     * 1. 静态方法引用
     */
    @Test
    public void staticMethodReferenceTest() {
        List<String> list = Arrays.asList("a","b","c");
        list.forEach(ReferenceTypePancakesTest::print);
    }

    /**
     * 2. 实例化方法引用
     */
    @Test
    public void instantiationMethodReferenceTest() {
        List<String> list = Arrays.asList("a","b","c");
        list.forEach(new ReferenceTypePancakesTest()::print2);
    }

    /**
     * 3. 超类方法引用
     */
    @Test
    public void superMethodReferenceTest() {
        List<String> list = Arrays.asList("a","b","c");
        list.forEach(super::print3);
    }

    /**
     * 4-1. 类构造器引用 无参数
     */
    @Test
    public void constructorReferenceTest() {
        InterfaceExample com = ReferenceTypePancakesTest::new;
        ReferenceTypePancakesTest bean = com.create();
        System.out.println(bean);
    }

    /**
     * 5. 数组构造器引用
     */
    @Test
    public void arrayConstructorReferenceTest() {
        Function<Integer, String[]> function = String[]::new;
        String[] array = function.apply(4);

        for (String r : array) {
            System.out.println(r);
        }
    }

    /**
     * 用于静态方法引用
     * @param content
     */
    public static void print(String content){
        System.out.println(content);
    }

    /**
     * 用于实例化方法引用
     * @param content
     */
    public void print2(String content){
        System.out.println(content);
    }

}

/**
 * 用于超类方法引用
 */
class BaseReferenceTypeTest {
    public void print3(String content){
        System.out.println(content);
    }
}

interface InterfaceExample {
    /**
     * 创建
     * @return
     */
    ReferenceTypePancakesTest create();
}

interface InterfaceExample2 {
    /**
     * 创建
     * @param param
     * @return
     */
    ReferenceTypePancakesTest create(String param);
}
