package study.blaife.designmode.behavioral.strategy.crabscase;

/**
 * @Description: 环境类: 厨房
 * @Author: magd39318
 * @Date: 2021/9/27 16:27
 */
public class Kitchen {

    /**
     * 菜
     */
    private CrabsCooking crabsCooking;

    public CrabsCooking getCrabsCooking() {
        return crabsCooking;
    }

    public void setCrabsCooking(CrabsCooking crabsCooking) {
        this.crabsCooking = crabsCooking;
    }
}
