package study.blaife.designmode.behavioral.command.televisioncase;

/**
 * @Description: 抽象命令类
 * @Author: magd39318
 * @Date: 2021/9/28 10:27
 */
public abstract class Command {

    protected Television television;

    public Command(Television television) {
        this.television = television;
    }

    /**
     * 执行
     */
    abstract void execute();
}
