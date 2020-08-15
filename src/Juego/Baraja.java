package Juego;

import java.util.ArrayList;
import java.util.Collections;


public class Baraja {
    private ArrayList<Carta> baraja;
    private int actual;
    private int inicio=0;

    public Baraja() {
        this(true);
    }

    public Baraja( boolean barajado ) {
        actual=0;
        baraja= new ArrayList<>();
        for(int i=0; i<52;i++){
            baraja.add(new Carta(i));
        }
        if(barajado){
            Collections.shuffle(baraja);
        }
    }

    public void repartir(int cantidad, Jugador jugador1,Jugador jugador2) {

        ArrayList<Carta> mano1 = new ArrayList<>(cantidad);
        ArrayList<Carta> mano2 = new ArrayList<>(cantidad);
        for (int i = 0; i < cantidad * 2; i++) {
            if (i % 2 == 0) {
                System.out.println(jugador1.getMano());
                jugador1.getMano().getMano().add(baraja.get(i));
            } else {
                jugador2.getMano().getMano().add(baraja.get(i));
            }
            actual++;
        }
    }

    public Carta siguiente() {
        if (!isEmpty()){
            return baraja.get(actual++);
        }
        return null;
    }

    public boolean isEmpty(){
        return actual==53;
    }

    public ArrayList<Carta> getBaraja() {
        return baraja;
    }
}
