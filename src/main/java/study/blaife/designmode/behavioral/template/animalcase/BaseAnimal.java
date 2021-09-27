package study.blaife.designmode.behavioral.template.animalcase;

/**
 * @Description: 动物抽象类
 * @Author: magd39318
 * @Date: 2021/9/27 14:38
 */
public abstract class BaseAnimal {

    public void life() {
        eat();
        sport();
        sleep();
    }

    /**
     * 吃
     */
    public abstract void eat();

    /**
     * 运动
     */
    public abstract void sport();

    /**
     * 休息
     */
    public abstract void sleep();
}
