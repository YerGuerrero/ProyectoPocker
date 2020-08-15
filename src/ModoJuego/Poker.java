package ModoJuego;

import Juego.*;

public class Poker extends ModoJuego {
    Jugador jugador1;
    Jugador jugador2;
    Baraja baraja;

    public Poker() {
        this.jugador1=super.getJugador1();
        this.jugador2=super.getJugador2();
        this.baraja=super.getBaraja();
    }

    @Override
    public void jugar() {
    }

    public void mejorCombinacion( Vector vector1, Vector vector2 ){
        int pos1=-1;
        int pos2=-1;
        for (int i=0; i<vector1.getVector().length;i++){
            if (vector1.get(i)==1){
                pos1=i;
            }
        }
        for (int i=0; i<vector2.getVector().length;i++){
            if (vector2.get(i)==1){
                pos2=i;
            }
        }
        if (pos1<pos2){
            jugador1.setGanar(true);
        }else if (pos1>pos2){
            jugador2.setGanar(true);
        }
        else {
            empate(pos1,pos2);

        }
    }

    public void empate(int pos1, int pos2){

    }

    @Override
    public Jugador getJugador1() {
        return jugador1;
    }

    @Override
    public Jugador getJugador2() {
        return jugador2;
    }

    @Override
    public Baraja getBaraja() {
        return baraja;
    }
}
