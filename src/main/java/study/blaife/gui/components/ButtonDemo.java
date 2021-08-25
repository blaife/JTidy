package study.blaife.gui.components;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 展示组件：按钮
 *
 * JButton()：创建一个无标签文本、无图标的按钮。
 * JButton(Icon icon)：创建一个无标签文本、有图标的按钮。
 * JButton(String text)：创建一个有标签文本、无图标的按钮。
 * JButton(String text,Icon icon)：创建一个有标签文本、有图标的按钮。
 *
 * @Author: magd39318
 * @Date: 2021/8/16 16:10
 **/
public class ButtonDemo extends JFrame {

    public ButtonDemo() {
        ButtonDemo frame = this;
        JButton button = new JButton("弹出信息");
        button.setIcon(new ImageIcon("F:/1.png"));
        button.setHorizontalTextPosition(SwingConstants.CENTER);
        button.setVerticalTextPosition(SwingConstants.BOTTOM);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame,"盖世英雄");
            }
        });

        JPanel myPanel = new JPanel();
        myPanel.add(button);
        setBounds(300, 200, 600, 300);
        this.add(myPanel);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ButtonDemo();
    }
}
