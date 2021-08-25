package study.blaife.designmode.creational.prototype.monstermodel;

/**
 * @Author: magd39318
 * @Date: 2021/8/13 15:54
 **/
public class TheMushroomPeople extends BaseMonster{

    public TheMushroomPeople() {
        name = "蘑菇人";
        blood = 10;
        speed = 0.75;
    }

    @Override
    void whoAmI() {
        System.out.println("I am the mushroom people");
    }
}
