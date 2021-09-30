package study.blaife.designmode.behavioral.state.liftcase;

import javax.naming.Context;

/**
 * @Description: 电梯状态
 * @Author: magd39318
 * @Date: 2021/9/30 9:44
 */
public abstract class BaseLiftState {

    protected LiftContext context;

    public void setContext(LiftContext context) {
        this.context = context;
    }

    /**
     * 打开
     */
    public abstract void open();

    /**
     * 关闭
     */
    public abstract void close();

    /**
     * 运行
     */
    public abstract void run();

    /**
     * 停止
     */
    public abstract void stop();
}
