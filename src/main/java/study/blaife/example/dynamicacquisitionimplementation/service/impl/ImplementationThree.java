package study.blaife.example.dynamicacquisitionimplementation.service.impl;

import study.blaife.example.dynamicacquisitionimplementation.annotation.TypeOfLogo;
import study.blaife.example.dynamicacquisitionimplementation.service.TopInterface;

/**
 * @Author: magd39318
 * @Date: 2021/8/11 10:40
 **/
@TypeOfLogo("three")
public class ImplementationThree implements TopInterface {
    @Override
    public void whoAmI() {
        System.out.println("I am three");
    }
}
