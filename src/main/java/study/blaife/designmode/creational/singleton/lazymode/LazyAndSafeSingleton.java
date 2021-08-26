package study.blaife.designmode.creational.singleton.lazymode;

/**
 * @Description: 懒汉模式-线程安全
 *      这种方式具备很好的 lazy loading，<br>
 *      能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步
 * @Author: magd39318
 * @Date: 2021/8/25 14:06
 */
public class LazyAndSafeSingleton {
    public static double isNumber = Math.random();

    private static LazyAndSafeSingleton lazyAndSafeSingleton;

    private LazyAndSafeSingleton() {}

    public static synchronized LazyAndSafeSingleton getInstance() {
        if (lazyAndSafeSingleton == null) {
            lazyAndSafeSingleton = new LazyAndSafeSingleton();
        }
        return lazyAndSafeSingleton;
    }

}
