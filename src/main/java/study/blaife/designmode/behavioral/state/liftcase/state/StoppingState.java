package study.blaife.designmode.behavioral.state.liftcase.state;

import study.blaife.designmode.behavioral.state.liftcase.BaseLiftState;
import study.blaife.designmode.behavioral.state.liftcase.LiftContext;

/**
 * @Description: 电梯停止
 * @Author: magd39318
 * @Date: 2021/9/30 10:04
 */
public class StoppingState extends BaseLiftState {
    @Override
    public void open() {
        super.context.setLiftState(LiftContext.OPENING_STATE);
        super.context.getLiftState().open();
    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        super.context.setLiftState(LiftContext.RUNNING_STATE);
        super.context.getLiftState().run();
    }

    @Override
    public void stop() {
        System.out.println("电梯停止了");
    }
}
