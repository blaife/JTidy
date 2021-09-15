package study.blaife.designmode.structural.proxy.dynamicproxyforjdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Description: 代理类
 * @Author: magd39318
 * @Date: 2021/9/15 13:46
 */
public class HelloProxy implements InvocationHandler {

    private Object target;

    public HelloProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("前置通知");
        Object rs = method.invoke(target, args);
        System.out.println("后置通知");
        return null;
    }
}
