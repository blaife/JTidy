package study.blaife.designmode.behavioral.state.liftcase;

import org.junit.Test;
import study.blaife.designmode.behavioral.state.liftcase.state.ClosingState;

/**
 * @Description: 电梯案例测试
 * @Author: magd39318
 * @Date: 2021/9/30 10:12
 */
public class LiftCaseTest {

    @Test
    public void liftTest() {
        LiftContext context = new LiftContext();
        context.setLiftState(new ClosingState());
        context.open();
        context.close();
        context.run();
        context.stop();
    }

}
