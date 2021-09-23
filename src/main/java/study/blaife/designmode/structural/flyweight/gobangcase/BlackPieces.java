package study.blaife.designmode.structural.flyweight.gobangcase;

import java.awt.*;

/**
 * @Description: 黑棋
 * @Author: magd39318
 * @Date: 2021/9/23 16:13
 */
public class BlackPieces implements ChessPieces {
    @Override
    public void downPieces(Graphics g, Point pt) {
        g.setColor(Color.BLACK);
        g.fillOval(pt.x, pt.y, 30, 30);
    }
}
