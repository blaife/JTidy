package study.blaife.designmode.behavioral.visitor.thecompanycreates;

/**
 * @Author: magd39318
 * @Date: 2021/8/13 10:45
 **/
public class ArtCompany implements Company {
    @Override
    public String create(Paper paper) {
        return "建造讲学图";
    }

    @Override
    public String create(Cuprum cuprum) {
        return "建造铜像";
    }
}
