package study.blaife.designmode.behavioral.template.animalcase;

import org.junit.Test;
import study.blaife.designmode.behavioral.template.animalcase.animal.Fish;

/**
 * @Description: 模板方法模式 - 动物案例
 * @Author: magd39318
 * @Date: 2021/9/27 14:48
 */
public class AnimalTest {

    @Test
    public void fishLife() {
        BaseAnimal animal = new Fish();
        animal.life();
    }


}
