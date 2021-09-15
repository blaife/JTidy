package study.blaife.designmode.structural.proxy.dynamicproxyforjdk;

/**
 * @Description: 具体实现接口
 * @Author: magd39318
 * @Date: 2021/9/15 13:45
 */
public class Hello implements IHello {
    @Override
    public void sayHello() {
        System.out.println("SayHello");
    }
}
