package study.blaife.designmode.structural.decorator.pancakescase;

import java.math.BigDecimal;

/**
 * @Author: magd39318
 * @Date: 2021/8/12 14:53
 **/
public abstract class BasePancakesDecorator extends BasePancakes {

    private BasePancakes basePancakes;

    public BasePancakesDecorator(BasePancakes basePancakes) {
        this.basePancakes = basePancakes;
    }

    /**
     * 做一些事情
     */
    protected abstract void doSomeThing();

    @Override
    protected String getMsg(){
        return this.basePancakes.getMsg();
    }

    @Override
    protected BigDecimal getPrice(){
        return this.basePancakes.getPrice();
    }
}
