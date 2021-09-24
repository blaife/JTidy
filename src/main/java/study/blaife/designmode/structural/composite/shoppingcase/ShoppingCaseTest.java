package study.blaife.designmode.structural.composite.shoppingcase;

import org.junit.Test;

/**
 * @Description: 购物案例 测试类
 * @Author: magd39318
 * @Date: 2021/9/24 10:11
 */
public class ShoppingCaseTest {

    @Test
    public void shopping() {
        float s = 0;
        Bags bigBag, mediumBag, smallRedBag, smallWhiteBag;
        bigBag = new Bags("大袋子");
        mediumBag = new Bags("中袋子");
        smallRedBag = new Bags("红色小袋子");
        smallWhiteBag = new Bags("白色小袋子");
        Goods sp;
        sp = new Goods("婺源特产", 2, 7.9f);
        smallRedBag.add(sp);
        sp = new Goods("婺源地图", 1, 9.9f);
        smallRedBag.add(sp);
        sp = new Goods("韶关香菇", 2, 68);
        smallWhiteBag.add(sp);
        sp = new Goods("韶关红茶", 3, 180);
        smallWhiteBag.add(sp);
        sp = new Goods("景德镇瓷器", 1, 380);
        mediumBag.add(sp);
        mediumBag.add(smallRedBag);
        sp = new Goods("鸿星尔克运动鞋", 1, 198);
        bigBag.add(sp);
        bigBag.add(smallWhiteBag);
        bigBag.add(mediumBag);
        System.out.println("您选购的商品有：");
        bigBag.show();
        s = bigBag.calculation();
        System.out.println("要支付的总价是：" + s + "元");
    }

}
