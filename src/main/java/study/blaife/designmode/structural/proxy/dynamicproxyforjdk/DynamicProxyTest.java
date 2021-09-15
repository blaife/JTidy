package study.blaife.designmode.structural.proxy.dynamicproxyforjdk;


import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

/**
 * @Description: 动态代理案例测试
 * @Author: magd39318
 * @Date: 2021/9/15 13:49
 */
public class DynamicProxyTest {

    @Test
    public void dynamicProxyTest() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 获取动态代理类
        Class<?> proxyClass = Proxy.getProxyClass(IHello.class.getClassLoader(), IHello.class);
        // 获得代理类的构造函数，并传入参数类型InvocationHandler.class
        Constructor<?> constructor = proxyClass.getConstructor(InvocationHandler.class);
        // 通过构造函数来创建动态代理对象，将自定义的InvocationHandler实例传入
        IHello iHello = (IHello) constructor.newInstance(new HelloProxy(new Hello()));
        // 通过代理对象调用目标方法
        iHello.sayHello();
    }

}
