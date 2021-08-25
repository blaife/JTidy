package study.blaife.example.guikeyboardcontrol;

import javax.swing.*;
import java.awt.*;

/**
 * @Author: magd39318
 * @Date: 2021/8/17 10:04
 **/
public class GameFrame extends JFrame {

    public GameFrame() throws HeadlessException {
        JPanel panel = new JPanel();

        JLabel label = new JLabel(new ImageIcon("img/brick.png"), JLabel.CENTER);
        panel.add(label);
        this.add(panel);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300, 200, 600, 300);
    }

    public static void main(String[] args) {
        new GameFrame();
    }
}


