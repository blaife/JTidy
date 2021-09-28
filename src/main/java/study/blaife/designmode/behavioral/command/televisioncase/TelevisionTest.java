package study.blaife.designmode.behavioral.command.televisioncase;

import org.junit.Test;

/**
 * @Description: 电视机案例测试类
 * @Author: magd39318
 * @Date: 2021/9/28 10:32
 */
public class TelevisionTest {

    @Test
    public void watcher() {
        Television television = new Television();

        TeleController teleController = new TeleController();

        teleController.switchCommand(new CommandForCctv1(television));
        teleController.switchCommand(new CommandForCctv2(television));
        teleController.switchCommand(new CommandForCctv1(television));
        teleController.switchCommand(new CommandForCctv2(television));
        teleController.switchCommand(new CommandForCctv1(television));
        teleController.switchCommand(new CommandForCctv2(television));


        teleController.back();
        teleController.back();
        teleController.back();
        teleController.back();

    }

}
