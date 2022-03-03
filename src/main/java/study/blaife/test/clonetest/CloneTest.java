package study.blaife.test.clonetest;

/**
 * 克隆测试
 * @Author: magd39318
 * @Date: 2022/1/17 14:09
 */
public class CloneTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Product p1 = new Product();
        Object p2 = p1.clone();
        System.out.println(p1);
        System.out.println(p2);
        Product p3 = p1;
        System.out.println(p3);
        System.out.println(p1 == p2);
        System.out.println(p1 == p3);
    }


    private static void test (Boolean flag) {
        System.out.println(flag);
    }

}



class Product implements Cloneable{
    private String a;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}