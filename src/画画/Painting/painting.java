package Painting;

import javax.swing.*;

public class painting {
    public static void main(String []args){
    SwingUtilities.invokeLater(() -> {
        TurtleDrawing turtleDrawing = new TurtleDrawing();
        turtleDrawing.setVisible(true);
    });


}
}
