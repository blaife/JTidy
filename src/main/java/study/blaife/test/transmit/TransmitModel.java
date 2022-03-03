package study.blaife.test.transmit;

/**
 * 传递模式 值传递还是引用传递
 *
 * @author: magd39318
 * @date: 2022/2/28 12:42
 */
public class TransmitModel {

    public static void main(String[] args) {
        TransmitEntity x1 = new TransmitEntity(1);
        TransmitEntity x2 = new TransmitEntity(1);
        TransmitModel t = new TransmitModel();
        t.change1(x1);
        t.change2(x2);
        System.out.println(x1);
        System.out.println(x2);
    }

    public void change1(TransmitEntity i) {
        i = new TransmitEntity(2);
    }
    public void change2(TransmitEntity i) {
        i.setA(2);
    }

}

