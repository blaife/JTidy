package study.blaife.jvm;

/**
 * @author: magd39318
 * @date: 2022/4/26 14:42
 */
public class StringTest {
    public static void main(String[] args) {
        java.lang.String str = new java.lang.String();
        System.out.println("hello,atguigu.com");

        StringTest test = new StringTest();
        System.out.println(test.getClass().getClassLoader());
    }
}
