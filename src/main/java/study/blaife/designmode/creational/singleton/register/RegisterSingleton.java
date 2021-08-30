package study.blaife.designmode.creational.singleton.register;

/**
 * @Description: 单例模式-登记/静态内部类模式
 *
 *      如果实例化 instance 很消耗资源，所以想让它延迟加载，
 *      另外一方面，又不希望在 Singleton 类加载时就实例化，
 *      因为不能确保 Singleton 类还可能在其他的地方被主动使用从而被加载，
 *      那么这个时候实例化 instance 显然是不合适的
 *
 * @Author: magd39318
 * @Date: 2021/8/30 10:01
 */
public class RegisterSingleton {

    private static class SingletonHolder {
        private static final RegisterSingleton INSTANCE = new RegisterSingleton();
    }

    private RegisterSingleton (){}

    public static final RegisterSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
