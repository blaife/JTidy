package study.blaife.designmode.structural.flyweight.gobangcase;

import java.awt.*;

/**
 * @Description: 棋子
 * @Author: magd39318
 * @Date: 2021/9/23 16:10
 */
public interface ChessPieces {

    /**
     * 棋子生成
     * @param g
     * @param pt
     */
    void downPieces(Graphics g, Point pt);

}

