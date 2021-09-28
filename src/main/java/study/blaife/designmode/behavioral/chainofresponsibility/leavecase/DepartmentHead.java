package study.blaife.designmode.behavioral.chainofresponsibility.leavecase;

/**
 * @Description: 具体处理者：系主任
 * @Author: magd39318
 * @Date: 2021/9/28 13:39
 */
public class  DepartmentHead extends BaseLeader {

    @Override
    void handleRequest(int leaveDays) {
        if (leaveDays <= 7) {
            System.out.println("系主任批准请假" + leaveDays + "天");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(leaveDays);
            } else {
                System.out.println("请假天数太多，没有人批准该假条");
            }
        }
    }
}
