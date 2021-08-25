package study.blaife.designmode.structural.decorator.pancakescase;

import java.math.BigDecimal;

/**
 * @Author: magd39318
 * @Date: 2021/8/12 15:06
 **/
public class Sausage extends BasePancakesDecorator {
    public Sausage(BasePancakes basePancakes) {
        super(basePancakes);
    }

    @Override
    protected void doSomeThing() {

    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "\n一个烤肠";
    }

    @Override
    protected BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(2));
    }
}
