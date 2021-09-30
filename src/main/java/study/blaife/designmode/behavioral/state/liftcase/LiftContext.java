package study.blaife.designmode.behavioral.state.liftcase;

import study.blaife.designmode.behavioral.state.liftcase.state.ClosingState;
import study.blaife.designmode.behavioral.state.liftcase.state.OpeningState;
import study.blaife.designmode.behavioral.state.liftcase.state.RunningState;
import study.blaife.designmode.behavioral.state.liftcase.state.StoppingState;

/**
 * @Description: 环境对象
 *      定义电梯的所有状态，然后定义电梯的当前状态，并定义不同状态对应的方法
 * @Author: magd39318
 * @Date: 2021/9/30 9:41
 */
public class LiftContext {

    public final static BaseLiftState OPENING_STATE = new OpeningState();
    public final static BaseLiftState CLOSING_STATE = new ClosingState();
    public final static BaseLiftState RUNNING_STATE = new RunningState();
    public final static BaseLiftState STOPPING_STATE = new StoppingState();


    private BaseLiftState liftState;

    public BaseLiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(BaseLiftState liftState) {
        this.liftState = liftState;
        this.liftState.setContext(this);
    }

    public void open() {
         this.liftState.open();
     }

     public void close() {
         this.liftState.close();
     }

     public void run() {
         this.liftState.run();
     }

     public void stop() {
         this.liftState.stop();
     }
}
