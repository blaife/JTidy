package study.blaife.designmode.behavioral.mediator.unitednationscase;

/**
 * @Description: 抽象中介者 - 联合国
 * @Author: magd39318
 * @Date: 2021/10/9 10:17
 */
public abstract class UnitedNations {

    /**
     * 宣告
     * @param message
     * @param country
     */
    public abstract void declare(String message, Country country);

}
