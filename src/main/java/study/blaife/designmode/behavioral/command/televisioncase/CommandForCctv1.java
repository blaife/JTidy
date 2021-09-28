package study.blaife.designmode.behavioral.command.televisioncase;

/**
 * @Description: CCTV 1
 * @Author: magd39318
 * @Date: 2021/9/28 10:29
 */
public class CommandForCctv1 extends Command{

    public CommandForCctv1(Television television) {
        super(television);
    }

    @Override
    void execute() {
        television.playCctv1();
    }
}
