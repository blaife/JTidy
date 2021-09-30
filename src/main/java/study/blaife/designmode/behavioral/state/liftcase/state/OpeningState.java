package study.blaife.designmode.behavioral.state.liftcase.state;

import study.blaife.designmode.behavioral.state.liftcase.BaseLiftState;
import study.blaife.designmode.behavioral.state.liftcase.LiftContext;

/**
 * @Description: 电梯打开
 * @Author: magd39318
 * @Date: 2021/9/30 9:48
 */
public class OpeningState extends BaseLiftState {
    @Override
    public void open() {
        System.out.println("电梯门开启");
    }

    @Override
    public void close() {
        super.context.setLiftState(LiftContext.CLOSING_STATE);
        super.context.getLiftState().close();
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
