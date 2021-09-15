package study.blaife.designmode.structural.proxy.classfeecase;

import org.junit.Test;

/**
 * @Description: 交班费案例测试类
 * @Author: magd39318
 * @Date: 2021/9/15 11:20
 */
public class ClassFeeTest {

    @Test
    public void giveMoney() {
        Student student = new StudentProxy("张三");
        student.giveMoney();
    }

}
