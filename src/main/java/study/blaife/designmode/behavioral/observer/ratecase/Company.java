package study.blaife.designmode.behavioral.observer.ratecase;

/**
 * @Description: 抽象观察者 - 公司
 * @Author: magd39318
 * @Date: 2021/9/30 17:20
 */
public interface Company {
    /**
     * 对汇率变化的反映
     * @param number
     */
    void response(int number);
}
