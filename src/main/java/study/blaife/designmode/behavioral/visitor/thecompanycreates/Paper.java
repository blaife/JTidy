package study.blaife.designmode.behavioral.visitor.thecompanycreates;

/**
 * @Author: magd39318
 * @Date: 2021/8/13 10:22
 **/
public class Paper implements Material {
    @Override
    public String accept(Company company) {
        return company.create(this);
    }
}
