package study.blaife.designmode.behavioral.template.animalcase.animal;

import study.blaife.designmode.behavioral.template.animalcase.BaseAnimal;

/**
 * @Description: 猴子
 * @Author: magd39318
 * @Date: 2021/9/27 14:42
 */
public class Monkey extends BaseAnimal {
    @Override
    public void eat() {
        System.out.println("吃香蕉");
    }

    @Override
    public void sport() {
        System.out.println("手舞足蹈");
    }

    @Override
    public void sleep() {
        System.out.println("在树上休息");
    }
}
