package study.blaife.designmode.structural.proxy.classfeecase;

/**
 * @Description: 普通学生
 * @Author: magd39318
 * @Date: 2021/9/15 11:17
 */
public class RegularStudent implements Student {

    private String name;

    public RegularStudent(String name) {
        this.name = name;
    }

    @Override
    public void giveMoney() {
        System.out.println(name + "上交班费 100 元");
    }
}
