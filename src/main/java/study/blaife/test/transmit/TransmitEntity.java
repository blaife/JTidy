package study.blaife.test.transmit;

/**
 * 测试
 *
 * @author: magd39318
 * @date: 2022/2/28 12:58
 */
public class TransmitEntity {

    int a;

    public TransmitEntity() {
    }

    public TransmitEntity(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "TransmitEntity{" +
                "a=" + a +
                '}';
    }
}
