package study.blaife.designmode.creational.builder.caseoffastfood;

import java.math.BigDecimal;

/**
 * @Description:
 * @Author: magd39318
 * @Date: 2021/8/25 10:52
 */
public final class BaseFoodBuilder {
    private String name;
    private BigDecimal price;

    private BaseFoodBuilder() {
    }

    public static BaseFoodBuilder aBaseFood() {
        return new BaseFoodBuilder();
    }

    public BaseFoodBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public BaseFoodBuilder withPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public BaseFood build() {
        BaseFood baseFood = new BaseFood();
        baseFood.setName(name);
        baseFood.setPrice(price);
        return baseFood;
    }
}
