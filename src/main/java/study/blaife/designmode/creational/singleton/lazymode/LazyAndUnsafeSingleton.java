package study.blaife.designmode.creational.singleton.lazymode;

/**
 * @Description: 懒汉模式-线程不安全
 * @Author: magd39318
 * @Date: 2021/8/25 14:06
 */
public class LazyAndUnsafeSingleton {

    private static LazyAndUnsafeSingleton lazyAndUnsafeSingleton;

    private LazyAndUnsafeSingleton() {}

    public static LazyAndUnsafeSingleton getInstance() {
        if (lazyAndUnsafeSingleton == null) {
            lazyAndUnsafeSingleton = new LazyAndUnsafeSingleton();
        }
        return lazyAndUnsafeSingleton;
    }
}
