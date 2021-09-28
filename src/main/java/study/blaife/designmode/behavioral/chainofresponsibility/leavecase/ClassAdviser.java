package study.blaife.designmode.behavioral.chainofresponsibility.leavecase;

/**
 * @Description: 具体处理者：班主任
 * @Author: magd39318
 * @Date: 2021/9/28 13:38
 */
public class ClassAdviser extends BaseLeader {
    @Override
    void handleRequest(int leaveDays) {
        if (leaveDays <= 2) {
            System.out.println("班主任批准请假" + leaveDays + "天");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(leaveDays);
            } else {
                System.out.println("请假天数太多，没有人批准该假条");
            }
        }
    }
}
