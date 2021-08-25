package study.blaife.designmode.creational.builder.caseoffastfood;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * 建造者模式实践
 *
 * @Author: magd39318
 * @Date: 2021/8/13 17:26
 **/
public class FastFoodTest {

    @Test
    public void buildFoodTest() {
        System.out.println(new FoodBuilder().setName("汉堡"));
        System.out.println(new FoodBuilder().setPrice(new BigDecimal(12)));
        System.out.println(BaseFoodBuilder.aBaseFood().withName("汉堡").withPrice(new BigDecimal(12)).build());
    }

}
