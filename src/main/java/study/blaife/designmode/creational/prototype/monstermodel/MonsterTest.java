package study.blaife.designmode.creational.prototype.monstermodel;

import org.junit.Test;

/**
 *
 * 原型模式案例 怪物案例
 *
 * @Author: magd39318
 * @Date: 2021/8/13 15:57
 **/
public class MonsterTest {

    @Test
    public void getMonster() {
        MonsterCache.loadCache();
        MonsterCache.getMonster(1L).whoAmI();
        MonsterCache.getMonster(2L).whoAmI();
    }

}
