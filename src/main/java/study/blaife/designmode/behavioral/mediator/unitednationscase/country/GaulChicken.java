package study.blaife.designmode.behavioral.mediator.unitednationscase.country;

import study.blaife.designmode.behavioral.mediator.unitednationscase.Country;
import study.blaife.designmode.behavioral.mediator.unitednationscase.UnitedNations;

/**
 * @Description: 具体国家 - 高卢鸡
 * @Author: magd39318
 * @Date: 2021/10/9 10:28
 */
public class GaulChicken extends Country {

    public GaulChicken(UnitedNations un) {
        super(un);
    }

    public void declare(String message) {
        un.declare(message, this);
    }

    public void getMessage(String message) {
        System.out.println("高卢鸡发言：" + message);
    }

}
