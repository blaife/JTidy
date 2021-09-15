package study.blaife.designmode.structural.proxy.classfeecase;

/**
 * @Description: 学生代理类
 * @Author: magd39318
 * @Date: 2021/9/15 11:19
 */
public class StudentProxy implements Student {

    private String name;
    private Student student;

    public StudentProxy(Student student) {
        this.student = student;
    }

    public StudentProxy(String name) {
        this.name = name;
    }

    @Override
    public void giveMoney() {
        if (student == null) {
            this.student = new RegularStudent(name);
        }
        student.giveMoney();
    }
}
