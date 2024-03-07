package Painting;

import javax.swing.*;
import java.awt.*;

class CuteTurtlePanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(new Color(34, 139, 34));

        // 画乌龟的头
        g.fillOval(100, 100, 50, 50);

        // 画乌龟的身体
        g.fillRoundRect(80, 130, 90, 60, 20, 20);

        // 画乌龟的四肢
        g.fillRect(80, 145, 20, 40); // 左前肢
        g.fillRect(150, 145, 20, 40); // 右前肢
        g.fillRect(80, 200, 20, 40); // 左后肢
        g.fillRect(150, 200, 20, 40); // 右后肢

        // 画乌龟的眼睛
        g.setColor(Color.BLACK);
        g.fillOval(120, 115, 5, 5); // 左眼
        g.fillOval(130, 115, 5, 5); // 右眼

        // 画乌龟的嘴巴
        g.drawLine(125, 120, 125, 125);

        // 画乌龟的尾巴
        g.drawLine(170, 130, 180, 120);
    }
}