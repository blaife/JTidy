package study.blaife.designmode.behavioral.strategy.crabscase;

/**
 * @Description: 清蒸大闸蟹
 * @Author: magd39318
 * @Date: 2021/9/27 16:25
 */
public class SteamedCrabs implements CrabsCooking{
    @Override
    public void cookingMethod() {
        System.out.println("上菜：清蒸大闸蟹！");
    }
}
