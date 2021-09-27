package study.blaife.designmode.behavioral.template.animalcase.animal;

import study.blaife.designmode.behavioral.template.animalcase.BaseAnimal;

/**
 * @Description: 鱼
 * @Author: magd39318
 * @Date: 2021/9/27 14:40
 */
public class Fish extends BaseAnimal {
    @Override
    public void eat() {
        System.out.println("吃微生物");
    }

    @Override
    public void sport() {
        System.out.println("晃尾巴");
    }

    @Override
    public void sleep() {
        System.out.println("在水中休息");
    }
}
