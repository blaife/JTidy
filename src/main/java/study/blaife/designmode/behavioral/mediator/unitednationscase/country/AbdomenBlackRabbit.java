package study.blaife.designmode.behavioral.mediator.unitednationscase.country;

import study.blaife.designmode.behavioral.mediator.unitednationscase.Country;
import study.blaife.designmode.behavioral.mediator.unitednationscase.UnitedNations;

/**
 * @Description: 具体国家 - 腹黑兔
 * @Author: magd39318
 * @Date: 2021/10/9 10:30
 */
public class AbdomenBlackRabbit extends Country {

    public AbdomenBlackRabbit(UnitedNations un) {
        super(un);
    }

    public void declare(String message) {
        un.declare(message, this);
    }

    public void getMessage(String message) {
        System.out.println("腹黑兔发言：" + message);
    }

}
