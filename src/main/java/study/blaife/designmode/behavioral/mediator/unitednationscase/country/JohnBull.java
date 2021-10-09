package study.blaife.designmode.behavioral.mediator.unitednationscase.country;

import study.blaife.designmode.behavioral.mediator.unitednationscase.Country;
import study.blaife.designmode.behavioral.mediator.unitednationscase.UnitedNations;

/**
 * @Description: 具体国家 - 约翰牛
 * @Author: magd39318
 * @Date: 2021/10/9 10:29
 */
public class JohnBull extends Country {

    public JohnBull(UnitedNations un) {
        super(un);
    }

    public void declare(String message) {
        un.declare(message, this);
    }

    public void getMessage(String message) {
        System.out.println("约翰牛发言：" + message);
    }

}
