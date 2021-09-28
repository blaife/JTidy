package study.blaife.designmode.behavioral.command.televisioncase;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 命令调用者：遥控器
 * @Author: magd39318
 * @Date: 2021/9/28 10:33
 */
public class TeleController {

    List<Command> historyCommand = new ArrayList<>();

    /**
     * 切换频道
     * @param command
     */
    public void switchCommand(Command command) {
        historyCommand.add(command);
        command.execute();
    }

    /**
     * 回退
     */
    public void back() {
        if (historyCommand.isEmpty()) {
            return;
        }
        int size = historyCommand.size();
        int preIndex = size-2 <= 0 ? 0 : size-2;

        Command preCommand = historyCommand.remove(preIndex);

        preCommand.execute();
    }

}
