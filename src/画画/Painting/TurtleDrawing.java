package Painting;

import javax.swing.*;

public class TurtleDrawing extends JFrame {
    public TurtleDrawing() {
        setTitle("小乌龟画图");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setContentPane(new CuteTurtlePanel());
    }
}
