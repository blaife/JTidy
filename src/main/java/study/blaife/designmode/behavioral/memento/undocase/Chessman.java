package study.blaife.designmode.behavioral.memento.undocase;

/**
 * @Description: 发起人 - 棋手类
 * @Author: magd39318
 * @Date: 2021/10/11 10:39
 */
public class Chessman {

    /**
     * 颜色
     */
    private String color;
    private int x;
    private int y;

    /**
     * 保存当前状态
     * @return
     */
    public ChessmanMemento save() {
        return new ChessmanMemento(color, x, y);
    }

    public void restore(ChessmanMemento memento) {
        this.color = memento.getColor();
        this.x = memento.getX();
        this.y = memento.getY();
    }

    public Chessman(String color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }
}
