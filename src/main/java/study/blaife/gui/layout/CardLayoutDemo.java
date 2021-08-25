package study.blaife.gui.layout;

import javax.swing.*;
import java.awt.*;

/**
 * 卡片布局管理器
 *
 * CardLayout 布局管理器将容器分成许多层，每层的显示空间占据整个容器的大小，但是每层只允许放置一个组件
 *
 * @Author: magd39318
 * @Date: 2021/8/16 15:30
 **/
public class CardLayoutDemo extends JFrame {
    public CardLayoutDemo() {
        setTitle("布局：卡片布局管理器");
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        JPanel cards = new JPanel(new CardLayout());

        panel1.add(new JButton("登录"));
        panel1.add(new JButton("注册"));
        panel1.add(new JButton("找回密码"));
        panel2.add(new JTextField("用户名", 20));
        panel2.add(new JTextField("密码", 20));
        panel2.add(new JTextField("验证码", 20));

        cards.add(panel1, "card1");
        cards.add(panel2, "card2");

        CardLayout c1 = (CardLayout) cards.getLayout();

        c1.show(cards, "card2");
        this.add(cards);
        setBounds(300, 200, 400, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new CardLayoutDemo();
    }
}
