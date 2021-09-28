package study.blaife.designmode.behavioral.chainofresponsibility.leavecase;

/**
 * @Description: 抽象处理者：领导类
 * @Author: magd39318
 * @Date: 2021/9/28 13:36
 */
public abstract class BaseLeader {

    private BaseLeader next;

    public BaseLeader getNext() {
        return next;
    }

    public void setNext(BaseLeader next) {
        this.next = next;
    }

    /**
     * 处理请求方法
     * @param leaveDays
     */
    abstract void handleRequest(int leaveDays);
}
