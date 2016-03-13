package engine.environment;

import engine.ai.Ant;

import java.util.ArrayList;
import java.util.List;

public class Terrain {

    private int SIZE = 25;
    private Element[][] matrice;

    // RÉGLER ÇA POUR NE PAS QUE ÇA SOIT PUBLIC
    public ArrayList<Ant> ants;

    private enum Element{
        EMPTY
    }

    public Terrain(){

        ants = new ArrayList<>();
        matrice = new Element[SIZE][SIZE];

        for(int x = 0; x < SIZE; x++){
           for(int y = 0; y < SIZE; y++) {
               matrice[x][y] = Element.EMPTY;
           }
        }
    }

    public void spawnAnt(){
        ants.add(new Ant());
    }
}
