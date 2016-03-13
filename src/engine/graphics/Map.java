package engine.graphics;

import engine.ai.Ant;
import engine.environment.Terrain;

import javax.swing.*;
import java.awt.*;

public class Map extends JPanel {

    private final int WIDTH = 500;
    private final int HEIGHT = 500;
    private final int SQUARE_SIZE = 20;

    // RÉGLER ÇA POUR NE PAS QUE ÇA SOIT PUBLIC
    public Terrain terrain;

    public Map() {
        setBackground(Color.GREEN);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setDoubleBuffered(true);

        terrain = new Terrain();
        terrain.spawnAnt();
        terrain.spawnAnt();
        terrain.spawnAnt();
    }

    private void drawGrid(Graphics g){

        g.setColor(Color.BLACK);

        //Lignes horizontales
        for(int y = SQUARE_SIZE; y <= HEIGHT;y+=SQUARE_SIZE)
        {
            g.drawLine(0, y, WIDTH, y);
        }

        //Lignes verticales
        for(int x = SQUARE_SIZE; x <= WIDTH;x+=SQUARE_SIZE)
        {
            g.drawLine(x, 0, x, HEIGHT);
        }
    }

    private void drawAnts(Graphics g){
        g.setColor(Color.RED);

        for(Ant ant : terrain.ants) {
            g.fillRect(ant.getPosX() * SQUARE_SIZE + 5, ant.getPosY() * SQUARE_SIZE + 5, 10, 10);
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawGrid(g);
        drawAnts(g);
    }
}
