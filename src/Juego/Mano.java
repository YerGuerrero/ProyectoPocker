package Juego;

import java.util.ArrayList;

public class Mano {
    private ArrayList<Carta> mano=new ArrayList<>();
    Vector vector= new Vector(6);

    public Mano() {
    }

    public ArrayList<Carta> getMano() {
        return mano;
    }

    public void setMano( ArrayList<Carta> mano ) {
        this.mano = mano;
    }
}
