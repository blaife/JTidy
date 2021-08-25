package study.blaife.designmode.structural.decorator.pancakescase;

import java.math.BigDecimal;

/**
 * @Author: magd39318
 * @Date: 2021/8/12 14:51
 **/
public class Egg extends BasePancakesDecorator {
    public Egg(BasePancakes basePancakes) {
        super(basePancakes);
    }

    @Override
    protected void doSomeThing() {

    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "\n一个鸡蛋";
    }

    @Override
    protected BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(1.5));
    }
}
