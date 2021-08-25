package study.blaife.gui.layout;

import javax.swing.*;
import java.awt.*;

/**
 * 边框比距管理器
 *
 * 边框布局管理器将窗口分为 5 个区域：North、South、East、West 和 Center
 *
 * @Author: magd39318
 * @Date: 2021/8/16 14:44
 **/
public class BorderLayoutDemo extends JFrame {

    public BorderLayoutDemo() {
        setTitle("布局：边框比距管理器");
        setLayout(new BorderLayout());
        JButton button1 = new JButton("上");
        JButton button2 = new JButton("下");
        JButton button3 = new JButton("左");
        JButton button4 = new JButton("右");
        JButton button5 = new JButton("中");

        this.add(button1, BorderLayout.NORTH);
        this.add(button2, BorderLayout.SOUTH);
        this.add(button3, BorderLayout.WEST);
        this.add(button4, BorderLayout.EAST);
        this.add(button5, BorderLayout.CENTER);

        setBounds(300, 200, 400, 300);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new BorderLayoutDemo();
    }
}
