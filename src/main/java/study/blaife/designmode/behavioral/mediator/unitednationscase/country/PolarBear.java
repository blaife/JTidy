package study.blaife.designmode.behavioral.mediator.unitednationscase.country;

import study.blaife.designmode.behavioral.mediator.unitednationscase.Country;
import study.blaife.designmode.behavioral.mediator.unitednationscase.UnitedNations;

/**
 * @Description: 具体国家 - 北极熊
 * @Author: magd39318
 * @Date: 2021/10/9 10:27
 */
public class PolarBear extends Country {

    public PolarBear(UnitedNations un) {
        super(un);
    }

    public void declare(String message) {
        un.declare(message, this);
    }

    public void getMessage(String message) {
        System.out.println("北极熊发言：" + message);
    }

}
