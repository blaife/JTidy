package study.blaife.designmode.behavioral.mediator.unitednationscase.country;

import study.blaife.designmode.behavioral.mediator.unitednationscase.Country;
import study.blaife.designmode.behavioral.mediator.unitednationscase.UnitedNations;

/**
 * @Description: 具体国家 - 白头鹰
 * @Author: magd39318
 * @Date: 2021/10/9 10:20
 */
public class BaldEagle extends Country {

    public BaldEagle(UnitedNations un) {
        super(un);
    }

    public void declare(String message) {
        un.declare(message, this);
    }

    public void getMessage(String message) {
        System.out.println("白头鹰发言：" + message);
    }

}
