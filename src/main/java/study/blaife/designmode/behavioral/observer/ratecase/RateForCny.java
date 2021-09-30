package study.blaife.designmode.behavioral.observer.ratecase;

/**
 * @Description: 具体目标 - 人名币汇率
 * @Author: magd39318
 * @Date: 2021/9/30 17:25
 */
public class RateForCny extends BaseRate {
    @Override
    public void change(int number) {
        for (Company obs : companys) {
            ((Company) obs).response(number);
        }
    }
}
