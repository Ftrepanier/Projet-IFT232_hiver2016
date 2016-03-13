package simulator;

import engine.ai.Ant;
import engine.graphics.Window;

public class AntLab {

    public static void main(String[] args) {

        int frame = 0;
        Window win = new Window();
        win.setVisible(true);

        long beforeTime, timeDiff, sleep;
        beforeTime = System.currentTimeMillis();
        final int DELAY = 10;

        while(true) {
            frame++;

            // à arranger absolument !!
            for(Ant ant : win.map.terrain.ants) {
                if (frame % ant.getSpeed() == 0)
                    ant.Move();
            }

            win.updateDisplay();

            timeDiff = System.currentTimeMillis() - beforeTime;
            sleep = DELAY - timeDiff;

            if (sleep < 0) {
                sleep = 2;
            }

            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                System.out.println("Interrupted: " + e.getMessage());
            }

            beforeTime = System.currentTimeMillis();
        }

    }

}
