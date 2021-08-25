package study.blaife.designmode.creational.prototype.monstermodel;

/**
 * 怪物抽象类
 *
 * @Author: magd39318
 * @Date: 2021/8/13 15:50
 **/
public abstract class BaseMonster implements Cloneable {

    private Long id;
    protected String name;
    protected int blood;
    protected double speed;

    /**
     * 我是谁
     */
    abstract void whoAmI();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public Object clone()  {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    
}
