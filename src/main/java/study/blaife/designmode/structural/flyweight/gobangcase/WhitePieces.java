package study.blaife.designmode.structural.flyweight.gobangcase;

import java.awt.*;

/**
 * @Description: 白棋
 * @Author: magd39318
 * @Date: 2021/9/23 16:12
 */
public class WhitePieces implements ChessPieces {
    @Override
    public void downPieces(Graphics g, Point pt) {
        g.setColor(Color.WHITE);
        g.fillOval(pt.x, pt.y, 30, 30);
    }
}
