package study.blaife.designmode.structural.composite.shoppingcase;

import java.util.ArrayList;

/**
 * @Description: 树枝构件：袋子
 * @Author: magd39318
 * @Date: 2021/9/24 10:06
 */
public class Bags implements Articles {

    /**
     * 名称
     */
    private String name;

    /**
     * 袋内商品列表
     */
    private ArrayList<Articles> bags = new ArrayList<>();

    public Bags(String name) {
        this.name = name;
    }

    /**
     * 新增
     * @param articles
     */
    public void add(Articles articles) {
        bags.add(articles);
    }

    /**
     * 移除
     * @param articles
     */
    public void remove(Articles articles) {
        bags.remove(articles);
    }

    /**
     * 和获取子对象
     * @param i
     * @return
     */
    public Articles getChild(int i) {
        return bags.get(i);
    }

    @Override
    public float calculation() {
        float s = 0;
        for (Articles articles : bags) {
            s += articles.calculation();
        }
        return s;
    }

    @Override
    public void show() {
        for (Articles articles : bags) {
            articles.show();
        }
    }
}
