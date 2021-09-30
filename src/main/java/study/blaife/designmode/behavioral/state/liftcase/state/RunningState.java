package study.blaife.designmode.behavioral.state.liftcase.state;

import study.blaife.designmode.behavioral.state.liftcase.BaseLiftState;
import study.blaife.designmode.behavioral.state.liftcase.LiftContext;

/**
 * @Description: 电梯运行
 * @Author: magd39318
 * @Date: 2021/9/30 10:04
 */
public class RunningState extends BaseLiftState {
    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        System.out.println("电梯运行中");
    }

    @Override
    public void stop() {
        super.context.setLiftState(LiftContext.STOPPING_STATE);
        super.context.getLiftState().stop();
    }
}
