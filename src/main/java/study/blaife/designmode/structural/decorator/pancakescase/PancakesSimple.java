package study.blaife.designmode.structural.decorator.pancakescase;

import java.math.BigDecimal;

/**
 * @Author: magd39318
 * @Date: 2021/8/12 14:49
 **/
public class PancakesSimple extends BasePancakes {
    @Override
    protected String getMsg() {
        return "煎饼";
    }

    @Override
    protected BigDecimal getPrice() {
        return new BigDecimal(5);
    }
}
