package study.blaife.designmode.behavioral.visitor.thecompanycreates;

/**
 * @Author: magd39318
 * @Date: 2021/8/13 10:46
 **/
public class CoinageCompany implements Company {
    @Override
    public String create(Paper paper) {
        return "建造铜币";
    }

    @Override
    public String create(Cuprum cuprum) {
        return "建造纸币";
    }
}
