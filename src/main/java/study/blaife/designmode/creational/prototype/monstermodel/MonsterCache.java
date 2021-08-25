package study.blaife.designmode.creational.prototype.monstermodel;

import java.util.HashMap;

/**
 * @Author: magd39318
 * @Date: 2021/8/13 15:58
 **/
public class MonsterCache {

    private static HashMap<Long, BaseMonster> monsters = new HashMap<>(4);

    public static BaseMonster getMonster(Long monstersId) {
        BaseMonster cacheMonster = monsters.get(monstersId);
        return (BaseMonster) cacheMonster.clone();
    }

    public static void loadCache() {
        TheMushroomPeople theMushroomPeople = new TheMushroomPeople();
        theMushroomPeople.setId(1L);
        monsters.put(1L, theMushroomPeople);

        TheTortoiseBlame theTortoiseBlame = new TheTortoiseBlame();
        theTortoiseBlame.setId(2L);
        monsters.put(2L, theTortoiseBlame);
    }

}
