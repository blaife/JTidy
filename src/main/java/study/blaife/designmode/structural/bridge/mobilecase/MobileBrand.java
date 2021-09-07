package study.blaife.designmode.structural.bridge.mobilecase;

/**
 * @Description: 手机品牌抽象类
 * @Author: magd39318
 * @Date: 2021/8/30 17:13
 */
public abstract class MobileBrand {

    protected MobileSoft soft;

    public void setMobileSoft(MobileSoft soft) {
        this.soft = soft;
    }

    /**
     * 启动
     */
    public abstract void run();

}
