package study.blaife.designmode.behavioral.chainofresponsibility.leavecase;

/**
 * @Description: 具体处理者：教务处长
 * @Author: magd39318
 * @Date: 2021/9/28 13:39
 */
public class DeanOfStudies extends BaseLeader {
    @Override
    void handleRequest(int leaveDays) {
        if (leaveDays <= 20) {
            System.out.println("教务处长批准请假" + leaveDays + "天");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(leaveDays);
            } else {
                System.out.println("请假天数太多，没有人批准该假条");
            }
        }
    }
}
