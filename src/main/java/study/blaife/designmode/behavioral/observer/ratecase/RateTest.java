package study.blaife.designmode.behavioral.observer.ratecase;

import org.junit.Test;

/**
 * @Description: 汇率案例 - 测试
 * @Author: magd39318
 * @Date: 2021/9/30 17:26
 */
public class RateTest {

    @Test
    public void rateTest() {
        BaseRate rate = new RateForCny();
        Company watcher1 = new ImportCompany();
        Company watcher2 = new ExportCompany();
        rate.add(watcher1);
        rate.add(watcher2);
        rate.change(10);
        rate.change(-9);
    }

}
