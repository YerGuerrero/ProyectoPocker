package Juego;

import java.util.ArrayList;

public class Mano {
    private ArrayList<Carta> mano = new ArrayList<>();

    public Mano() {
    }

    public ArrayList<Carta> getMano() {
        return mano;
    }

    public void setMano(ArrayList<Carta> mano) {
        this.mano = mano;
    }
}
