package engine.graphics;

import javax.swing.*;


public class Window extends JFrame {

    // RÉGLER ÇA POUR NE PAS QUE ÇA SOIT PUBLIC
    public Map map;

    public Window() {
        map = new Map();
        add(map);
        setResizable(false);

        pack();

        setTitle("AntLab");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void updateDisplay(){
        map.repaint();
    }

}
