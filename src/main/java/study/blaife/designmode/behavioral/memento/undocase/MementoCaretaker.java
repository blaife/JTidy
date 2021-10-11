package study.blaife.designmode.behavioral.memento.undocase;

import java.util.ArrayList;

/**
 * @Description: 负责人角色 - 备忘录管理者
 * @Author: magd39318
 * @Date: 2021/10/11 10:41
 */
public class MementoCaretaker {

    int currentIndex = 0;
    private ArrayList<ChessmanMemento> mementoList = new ArrayList();

    /**
     * 悔棋
     * @return
     */
    public ChessmanMemento undo() {
        return mementoList.get(--currentIndex);
    }

    /**
     * 下子
     * @param memento
     */
    public void addMemento(ChessmanMemento memento) {
        if (currentIndex < mementoList.size()) {
            mementoList.set(currentIndex-1, memento);
        } else {
            mementoList.add(memento);
            currentIndex++;
        }
    }

    public void getMessage(){
        mementoList.stream().limit(currentIndex).forEach(a -> System.out.print(a+"\t"));
    }
}
