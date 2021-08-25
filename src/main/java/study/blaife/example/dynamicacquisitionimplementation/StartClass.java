package study.blaife.example.dynamicacquisitionimplementation;

import study.blaife.example.dynamicacquisitionimplementation.service.TopInterface;
import study.blaife.example.dynamicacquisitionimplementation.util.ClassForUtil;

import java.lang.reflect.InvocationTargetException;

/**
 * @Author: magd39318
 * @Date: 2021/8/11 15:24
 **/
public class StartClass {


    public static void main(String[] args)  {

        TopInterface result = ClassForUtil.getBeans(TopInterface.class, "one");
        if (result == null) {
            System.out.println("未发现匹配对象，请检查");
        } else {
            result.whoAmI();
        }
    }


}
