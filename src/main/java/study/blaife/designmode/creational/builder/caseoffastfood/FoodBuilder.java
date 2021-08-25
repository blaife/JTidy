package study.blaife.designmode.creational.builder.caseoffastfood;

import java.math.BigDecimal;

/**
 * @Author: magd39318
 * @Date: 2021/8/13 17:22
 **/
public class FoodBuilder {

    private BaseFood food = new BaseFood();

    public BaseFood setName(String name) {
        food.setName(name);
        return food;
    }

    public BaseFood setPrice(BigDecimal price) {
        food.setPrice(price);
        return food;
    }

}
