package study.blaife.designmode.behavioral.visitor.thecompanycreates;

/**
 * @Author: magd39318
 * @Date: 2021/8/13 10:21
 **/
public interface Material {

    /**
     * 开始制造
     * @param company
     * @return
     */
    String accept(Company company);

}
