package study.blaife.designmode.creational.builder.caseoffastfood;

import java.math.BigDecimal;

/**
 * @Author: magd39318
 * @Date: 2021/8/13 17:12
 **/
public class BaseFood {

    private String name;
    private BigDecimal price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }



    @Override
    public String toString() {
        return "BaseFood{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
