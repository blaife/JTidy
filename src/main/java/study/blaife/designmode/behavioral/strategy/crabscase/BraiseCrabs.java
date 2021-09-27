package study.blaife.designmode.behavioral.strategy.crabscase;

/**
 * @Description: 红烧大闸蟹
 * @Author: magd39318
 * @Date: 2021/9/27 16:26
 */
public class BraiseCrabs implements CrabsCooking {
    @Override
    public void cookingMethod() {
        System.out.println("上菜：红烧大闸蟹！");
    }
}
