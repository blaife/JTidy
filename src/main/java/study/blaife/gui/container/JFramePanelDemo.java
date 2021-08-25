package study.blaife.gui.container;

import javax.swing.*;
import java.awt.*;

/**
 * 容器
 *
 * 面板 demo
 *
 * @Author: magd39318
 * @Date: 2021/8/16 14:38
 **/
public class JFramePanelDemo extends JFrame {
    public JFramePanelDemo() {

        // 设置标题
        setTitle("java的第二个GUI程序");
        // 设置窗口大小
        setSize(400,200);
        // 窗口是否可以关闭
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 创建一个面板
        JPanel panel = new JPanel();
        // 创建一个标签
        JLabel label = new JLabel("这是放在panel上的标签");
        // 设置背景颜色
        panel.setBackground(Color.RED);
        panel.add(label);
        this.add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JFramePanelDemo();
    }
}
