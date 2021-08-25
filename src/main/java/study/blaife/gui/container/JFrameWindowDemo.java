package study.blaife.gui.container;

import javax.swing.*;
import java.awt.*;

/**
 * 容器
 *
 * 窗口 demo
 *
 * @Author: magd39318
 * @Date: 2021/8/16 14:26
 **/
public class JFrameWindowDemo extends JFrame {
    public JFrameWindowDemo() {
        // 设置标题
        setTitle("java的第一个GUI程序");
        // 设置窗口大小
        setSize(400,200);
        // 窗口是否可以关闭
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 创建一个标签
        JLabel label = new JLabel("使用JLabel类创建创建的标签");
        // 获取当前窗口的内容窗格
        Container c = getContentPane();
        // 将标签组件添加到内容窗格上
        c.add(label);
        // 设置窗口是否可见
        setVisible(true);


    }

    public static void main(String[] args) {
        new JFrameWindowDemo();
    }
}
