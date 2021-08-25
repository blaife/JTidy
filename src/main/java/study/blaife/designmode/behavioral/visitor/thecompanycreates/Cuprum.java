package study.blaife.designmode.behavioral.visitor.thecompanycreates;

/**
 * @Author: magd39318
 * @Date: 2021/8/13 10:24
 **/
public class Cuprum implements Material {
    @Override
    public String accept(Company company) {
        return company.create(this);
    }
}
