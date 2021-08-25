package study.blaife.designmode.creational.singleton.lazymode;

/**
 * @Description: 懒汉模式-线程安全
 * @Author: magd39318
 * @Date: 2021/8/25 14:06
 */
public class LazyAndSafeSingleton {
    public static double isNumber = Math.random();

    private static LazyAndSafeSingleton lazyAndSafeSingleton;

    private LazyAndSafeSingleton() {}

    public static LazyAndSafeSingleton getInstance() {
        if (lazyAndSafeSingleton == null) {
            lazyAndSafeSingleton = new LazyAndSafeSingleton();
        }
        return lazyAndSafeSingleton;
    }

}
