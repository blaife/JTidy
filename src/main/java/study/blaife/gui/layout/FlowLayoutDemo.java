package study.blaife.gui.layout;

import javax.swing.*;
import java.awt.*;

/**
 * 流式布局管理器
 *
 * 流式布局管理器是 JPanel 和 JApplet 的默认布局管理器。FlowLayout 会将组件按照从上到下、从左到右的放置规律逐行进行定位。
 *
 * @Author: magd39318
 * @Date: 2021/8/16 15:05
 **/
public class FlowLayoutDemo extends JFrame {
    public FlowLayoutDemo() {
        setTitle("布局：流式布局管理器");

        JPanel panel = new JPanel();

        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);

        panel.setLayout(new FlowLayout(FlowLayout.LEADING, 20, 30));
        panel.setBackground(Color.red);
        this.add(panel);
        this.setBounds(300,200,300,150);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new FlowLayoutDemo();
    }
}