package study.blaife.designmode.behavioral.iterator.landscapecase;

import java.io.Serializable;

/**
 * @Description: 具体事务 ： 风景
 * @Author: magd39318
 * @Date: 2021/10/9 14:00
 */
public class Landscape implements Serializable {

    private static final long serialVersionUID = -360920874695755255L;

    private String name;
    private String synopsis;

    public Landscape() {
    }

    public Landscape(String name, String synopsis) {
        this.name = name;
        this.synopsis = synopsis;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public void toSee() {
        System.out.println(name + ": " + synopsis);
    }
}
