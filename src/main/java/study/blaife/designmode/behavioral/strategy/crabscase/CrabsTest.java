package study.blaife.designmode.behavioral.strategy.crabscase;

import org.junit.Test;

/**
 * @Description: 大闸蟹案例测试类
 * @Author: magd39318
 * @Date: 2021/9/27 16:29
 */
public class CrabsTest {

    /* 有点类似于service-serviceImpl的模式，因为在使用中接口一般都由spring进行代理，我们只获取它的唯一实现 */

    @Test
    public void braisedHairyCrab() {
        CrabsCooking crabs = new BraiseCrabs();
        crabs.cookingMethod();
    }

}
