package study.blaife.designmode.structural.composite.shoppingcase;

/**
 * @Description: 树叶构件：商品
 * @Author: magd39318
 * @Date: 2021/9/24 10:01
 */
public class Goods implements Articles {

    /**
     * 名称
     */
    private String name;

    /**
     * 数量
     */
    private int quantity;

    /**
     * 单价
     */
    private float unitPrice;

    public Goods(String name, int quantity, float unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    @Override
    public float calculation() {
        return quantity * unitPrice;
    }

    @Override
    public void show() {
        System.out.println(name + "(数量："+ quantity +", 单价："+ unitPrice +" 元)");
    }
}
