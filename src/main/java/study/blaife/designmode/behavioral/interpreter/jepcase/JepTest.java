package study.blaife.designmode.behavioral.interpreter.jepcase;

import org.junit.Test;
import org.nfunk.jep.JEP;

/**
 * @Description: jep - 解释器模式
 * @Author: magd39318
 * @Date: 2021/10/11 14:31
 */
public class JepTest {

    @Test
    public void jepTest() {
        JEP jep = new JEP();
        //定义要计算的数据表达式
        String accrual = "本金*利率*时间";
        //给相关变量赋值
        jep.addVariable("本金", 10000);
        jep.addVariable("利率", 0.038);
        jep.addVariable("时间", 2);
        jep.parseExpression(accrual);
        System.out.println("存款利息：" + jep.getValue());
    }

}
