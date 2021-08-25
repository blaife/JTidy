package study.blaife.gui.components;

import javax.swing.*;

/**
 * 展示组件：标签
 *
 *
 * JLabel()：创建无图像并且标题为空字符串的 JLabel。
 * JLabel(Icon image)：创建具有指定图像的 JLabel。
 * JLabel(String text)：创建具有指定文本的 JLabel。
 * JLabel(String textjcon image,int horizontalAlignment)：创建具有指定文本、图像和水平对齐方式的 JLabel，horizontalAlignment 的取值有 3 个，即 JLabel.LEFT、JLabel.RIGHT 和 JLabel.CENTER。
 *
 * @Author: magd39318
 * @Date: 2021/8/16 15:42
 **/
public class LabelDemo extends JFrame {

    public LabelDemo() {
        setTitle("展示组件：标签");
        JPanel panel = new JPanel();
        JLabel label1 = new JLabel("普通标签");
        JLabel label2 = new JLabel();
        label2.setText("调用setText()方法");

        // 只能使用本地图片吗?
        Icon img = new ImageIcon("F:/1.png");
        JLabel label3 = new JLabel("盖世英雄", img, JLabel.CENTER);
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        this.add(panel);
        setBounds(300,200,400,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new LabelDemo();
    }


}
