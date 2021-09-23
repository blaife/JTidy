package study.blaife.designmode.structural.flyweight.gobangcase;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @Description: 棋盘
 * @Author: magd39318
 * @Date: 2021/9/23 16:48
 */
public class Chessboard extends MouseAdapter {
    GobangFactory gobangFactory;
    JFrame jFrame;
    Graphics graphics;
    JRadioButton whiteJRadioButton;
    JRadioButton blackJRadioButton;

    private final int x = 50;
    private final int y = 50;
    private final int w = 40;
    private final int rw = 400;

    Chessboard() {
        gobangFactory = new GobangFactory();
        jFrame = new JFrame("享元模式下的五子棋");
        jFrame.setBounds(100, 100, 500, 500);
        jFrame.setVisible(true);
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel southJPanel = new JPanel();
        jFrame.add("South", southJPanel);
        whiteJRadioButton = new JRadioButton("白子");
        blackJRadioButton = new JRadioButton("黑子", true);
        ButtonGroup group = new ButtonGroup();
        group.add(whiteJRadioButton);
        group.add(blackJRadioButton);
        southJPanel.add(whiteJRadioButton);
        southJPanel.add(blackJRadioButton);
        JPanel centerJPanel = new JPanel();
        centerJPanel.setLayout(null);
        centerJPanel.setSize(500, 500);
        centerJPanel.addMouseListener(this);
        jFrame.add("Center", centerJPanel);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        graphics = centerJPanel.getGraphics();
        graphics.setColor(Color.BLUE);
        graphics.drawRect(x, y, rw, rw);
        for (int i = 1; i < 10; i++) {
            //绘制第i条竖直线
            graphics.drawLine(x + (i * w), y, x + (i * w), y + rw);
            //绘制第i条水平线
            graphics.drawLine(x, y + (i * w), x + rw, y + (i * w));
        }
    }

    /**
     * 2222
     * @param e
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        Point pt = new Point(e.getX() - 15, e.getY() - 15);
        if (whiteJRadioButton.isSelected()) {
            ChessPieces c1 = gobangFactory.getChessPieces("w");
            c1.downPieces(graphics, pt);
        } else if (blackJRadioButton.isSelected()) {
            ChessPieces c2 = gobangFactory.getChessPieces("b");
            c2.downPieces(graphics, pt);
        }
    }

}
