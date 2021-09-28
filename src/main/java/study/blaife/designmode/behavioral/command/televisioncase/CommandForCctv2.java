package study.blaife.designmode.behavioral.command.televisioncase;

/**
 * @Description: CCTV 2
 * @Author: magd39318
 * @Date: 2021/9/28 10:30
 */
public class CommandForCctv2 extends Command {

    public CommandForCctv2(Television television) {
        super(television);
    }

    @Override
    void execute() {
        television.playCctv2();
    }
}
