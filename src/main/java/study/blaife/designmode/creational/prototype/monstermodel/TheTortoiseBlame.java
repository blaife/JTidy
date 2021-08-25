package study.blaife.designmode.creational.prototype.monstermodel;

/**
 * @Author: magd39318
 * @Date: 2021/8/13 16:09
 **/
public class TheTortoiseBlame extends BaseMonster{
    public TheTortoiseBlame() {
        name = "乌龟怪";
        blood = 30;
        speed = 0.35;
    }

    @Override
    void whoAmI() {
        System.out.println("I am the tortoise blame");
    }
}
