package study.blaife.designmode.behavioral.chainofresponsibility.leavecase;

import org.junit.Test;

/**
 * @Description: 责任链模式：请假案例测试类
 * @Author: magd39318
 * @Date: 2021/9/28 13:45
 */
public class LeaveCaseTest {

    @Test
    public void leaveTest() {
        BaseLeader classAdviser = new ClassAdviser();
        BaseLeader departmentHead = new DepartmentHead();
        BaseLeader dean = new Dean();
        BaseLeader deanOfStudies = new DeanOfStudies();
        classAdviser.setNext(departmentHead);
        departmentHead.setNext(dean);
        dean.setNext(deanOfStudies);
        classAdviser.handleRequest(4);
    }

}
