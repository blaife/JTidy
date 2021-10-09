package study.blaife.designmode.behavioral.mediator.unitednationscase;

import study.blaife.designmode.behavioral.mediator.unitednationscase.country.AbdomenBlackRabbit;
import study.blaife.designmode.behavioral.mediator.unitednationscase.country.BaldEagle;
import study.blaife.designmode.behavioral.mediator.unitednationscase.country.PolarBear;

/**
 * @Description: 具体中介者 - 安理会
 * @Author: magd39318
 * @Date: 2021/10/9 10:35
 */
public class UnitedNationsSecurityCouncil extends UnitedNations {

    private AbdomenBlackRabbit abdomenBlackRabbit;
    private BaldEagle baldEagle;
    private PolarBear polarBear;

    public void setAbdomenBlackRabbit(AbdomenBlackRabbit abdomenBlackRabbit) {
        this.abdomenBlackRabbit = abdomenBlackRabbit;
    }

    public void setBaldEagle(BaldEagle baldEagle) {
        this.baldEagle = baldEagle;
    }

    public void setPolarBear(PolarBear polarBear) {
        this.polarBear = polarBear;
    }


    @Override
    public void declare(String message, Country country) {
        if (country == abdomenBlackRabbit) {
            abdomenBlackRabbit.getMessage(message);
        } else if (country == baldEagle) {
            baldEagle.getMessage(message);
        } else if (country == polarBear) {
            polarBear.getMessage(message);
        }
    }
}
