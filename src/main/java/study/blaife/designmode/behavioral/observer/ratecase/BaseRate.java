package study.blaife.designmode.behavioral.observer.ratecase;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 抽象主体 - 汇率
 * @Author: magd39318
 * @Date: 2021/9/30 17:19
 */
public abstract class BaseRate {

    protected List<Company> companys = new ArrayList<Company>();

    /**
     * 增加观察者方法
     * @param company
     */
    public void add(Company company) {
        companys.add(company);
    }

    /**
     * 删除观察者方法
     * @param company
     */
    public void remove(Company company) {
        companys.remove(company);
    }

    /**
     * 更改汇率
     * @param number
     */
    public abstract void change(int number);
}
