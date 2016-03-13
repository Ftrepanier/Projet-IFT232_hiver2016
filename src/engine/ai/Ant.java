package engine.ai;

import java.util.Random;

public class Ant {

    private int posX;
    private int posY;

    private int health;
    private int hunger;
    private int pheromones;

    private int speed;
    private Mode mode;
    private enum Mode {
        EXPLORATION,
        FOLLOW_PHEROMONE,
        BACK_TO_BASE,
        FLEE,
        ATTACK
    }

    public Ant(){

        posX = 10;
        posY = 10;

        health = 100;
        hunger = 100;
        pheromones = 100;

        speed = 5;
        mode = Mode.EXPLORATION;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public int getSpeed() {
        return speed;
    }

    public void Move(){

        float numDir;
        int   intDir;

        Random randDir = new Random();
        numDir = randDir.nextFloat() * 8;
        intDir = (int)numDir;

        if(intDir == Direction.NORTH.ordinal()){
            posY++;
        } else if (intDir == Direction.NORTH_EAST.ordinal()){
            posY++;
            posX++;
        } else if (intDir == Direction.EAST.ordinal()){
            posX++;
        } else if (intDir == Direction.SOUTH_EAST.ordinal()){
            posX++;
            posY--;
        } else if (intDir == Direction.SOUTH.ordinal()){
            posY--;
        } else if (intDir == Direction.SOUTH_WEST.ordinal()){
            posX--;
            posY--;
        } else if (intDir == Direction.WEST.ordinal()){
            posX--;
        } else if (intDir == Direction.NORTH_WEST.ordinal()){
            posX--;
            posY++;
        }

    }


}
