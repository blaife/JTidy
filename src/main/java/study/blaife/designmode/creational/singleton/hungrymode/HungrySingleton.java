package study.blaife.designmode.creational.singleton.hungrymode;

/**
 * @Description: 单例模式-饿汉模式
 * @Author: magd39318
 * @Date: 2021/8/30 9:48
 */
public class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton(){};

    public static HungrySingleton getInstance() {
        return instance;
    }
}
