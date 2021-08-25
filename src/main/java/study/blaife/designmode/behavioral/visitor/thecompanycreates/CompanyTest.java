package study.blaife.designmode.behavioral.visitor.thecompanycreates;

import org.junit.Test;

/**
 *
 * 访问者模式  公司
 *
 * @Author: magd39318
 * @Date: 2021/8/13 10:47
 **/
public class CompanyTest {

    @Test
    public void coinageCreateTest() {
        CoinageCompany company = new CoinageCompany();
        System.out.println(company.create(new Paper()));
        System.out.println(company.create(new Cuprum()));
    }

    @Test
    public void artCreateTest() {
        ArtCompany company = new ArtCompany();
        System.out.println(company.create(new Paper()));
        System.out.println(company.create(new Cuprum()));
    }

}
