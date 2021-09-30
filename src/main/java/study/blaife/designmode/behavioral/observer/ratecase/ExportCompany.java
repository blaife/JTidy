package study.blaife.designmode.behavioral.observer.ratecase;

/**
 * @Description: 具体观察者 - 出口公司
 * @Author: magd39318
 * @Date: 2021/9/30 17:23
 */
public class ExportCompany implements Company {
    @Override
    public void response(int number) {
        if (number > 0) {
            System.out.println("人民币汇率升值" + number + "个基点，降低了出口产品收入，降低了出口公司的销售利润率。");
        } else if (number < 0) {
            System.out.println("人民币汇率贬值" + (-number) + "个基点，提升了出口产品收入，提升了出口公司的销售利润率。");
        }
    }
}
