package study.blaife.jvm;

/**
 * @author: magd39318
 * @date: 2022/4/26 14:44
 */
public class MainTest {

    static{
        System.out.println("我是自定义的MainTest类的静态代码块");
    }

    //错误: 在类 java.lang.String 中找不到 main 方法
    public static void main(String[] args) {
        System.out.println("hello,MainTest");
    }
}
