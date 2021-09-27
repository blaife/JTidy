package study.blaife.designmode.behavioral.template.animalcase.animal;

import study.blaife.designmode.behavioral.template.animalcase.BaseAnimal;

/**
 * @Description: 老虎
 * @Author: magd39318
 * @Date: 2021/9/27 14:44
 */
public class Tiger extends BaseAnimal {
    @Override
    public void eat() {
        System.out.println("吃猴子");
    }

    @Override
    public void sport() {
        System.out.println("奔跑");
    }

    @Override
    public void sleep() {
        System.out.println("睡在森林");
    }
}
