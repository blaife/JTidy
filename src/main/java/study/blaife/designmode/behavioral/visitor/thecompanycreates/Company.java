package study.blaife.designmode.behavioral.visitor.thecompanycreates;

/**
 * @Author: magd39318
 * @Date: 2021/8/13 10:17
 **/
public interface Company {

    /**
     * 根据纸改造内容
     * @param paper
     * @return
     */
    String create(Paper paper);

    /**
     * 根据铜改造内容
     * @param cuprum
     * @return
     */
    String create(Cuprum cuprum);
}
