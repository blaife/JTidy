package study.blaife.designmode.creational.singleton.doublechecked;

/**
 * @Description: 单例模式-双检锁
 * @Author: magd39318
 * @Date: 2021/8/30 9:57
 */
public class DoubleCheckedSingleton {

    private volatile static DoubleCheckedSingleton singleton;

    private DoubleCheckedSingleton(){}

    public static DoubleCheckedSingleton getSingleton() {
        // 第一次校验
        if (singleton == null) {
            synchronized (DoubleCheckedSingleton.class) {
                // 第二次校验
                if (singleton == null) {
                    singleton = new DoubleCheckedSingleton();
                }
            }
        }
        return singleton;
    }


}
