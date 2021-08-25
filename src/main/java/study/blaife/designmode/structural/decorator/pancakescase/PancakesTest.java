package study.blaife.designmode.structural.decorator.pancakescase;

import org.junit.Test;

/**
 *
 * 装饰着模式实践  摊煎饼
 *
 * @Author: magd39318
 * @Date: 2021/8/12 15:00
 **/
public class PancakesTest {

    @Test
    public void oneEgg() {
        BasePancakes basePancakes = new PancakesSimple();
        basePancakes = new Egg(basePancakes);
        System.out.println("----------煎饼信息----------");
        System.out.println(basePancakes.getMsg());
        System.out.println("----------煎饼价格----------");
        System.out.println(basePancakes.getPrice());
    }

    @Test
    public void twoEggAndOneSausage() {
        BasePancakes basePancakes = new PancakesSimple();
        basePancakes = new Egg(basePancakes);
        basePancakes = new Egg(basePancakes);
        basePancakes = new Sausage(basePancakes);
        System.out.println("----------煎饼信息----------");
        System.out.println(basePancakes.getMsg());
        System.out.println("----------煎饼价格----------");
        System.out.println(basePancakes.getPrice());
    }
}
