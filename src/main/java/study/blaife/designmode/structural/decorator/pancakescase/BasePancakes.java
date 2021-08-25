package study.blaife.designmode.structural.decorator.pancakescase;

import java.math.BigDecimal;

/**
 * @Author: magd39318
 * @Date: 2021/8/12 14:46
 **/
public abstract class BasePancakes {

    /**
     * 获取其信息
     * @return
     */
    protected abstract String getMsg();

    /**
     * 获取其价格
     * @return
     */
    protected abstract BigDecimal getPrice();
}
