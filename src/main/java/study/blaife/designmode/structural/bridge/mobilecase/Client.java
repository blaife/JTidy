package study.blaife.designmode.structural.bridge.mobilecase;

import study.blaife.designmode.structural.bridge.mobilecase.brand.BrandForHuaWei;
import study.blaife.designmode.structural.bridge.mobilecase.brand.BrandForMi;
import study.blaife.designmode.structural.bridge.mobilecase.soft.SoftForAddressList;
import study.blaife.designmode.structural.bridge.mobilecase.soft.SoftForGame;

/**
 * @Description: 客户端
 * @Author: magd39318
 * @Date: 2021/8/30 17:23
 */
public class Client {

    public static void main(String[] args) {
        MobileBrand mobileBrand;
        mobileBrand = new BrandForMi();
        mobileBrand.setMobileSoft(new SoftForGame());
        mobileBrand.run();

        System.out.println("----------------------");


        mobileBrand = new BrandForHuaWei();
        mobileBrand.setMobileSoft(new SoftForAddressList());
        mobileBrand.run();

        System.out.println("----------------------");

    }

}
