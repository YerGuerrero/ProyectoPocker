package ModoJuego;

import Juego.*;

import java.util.Random;

public class Poker extends ModoJuego {
    Jugador jugador1;
    Jugador jugador2;
    Baraja baraja;
    boolean primerApuesta=true;

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

        // Corregir
        if (pos1<pos2){
            jugador1.setGanar(true);
        }else if (pos1>pos2){
            jugador2.setGanar(true);
        }
        else {
            empate(jugador1.getMano(),jugador2.getMano());

        }
    }

    public void empate(Mano mano1, Mano mano2){
        Carta[] manotemp1=new Carta[mano1.getMano().size()];
        Carta[] manotemp2=new Carta[mano2.getMano().size()];
        for(int i=0;i<mano1.getMano().size(); i++){
            manotemp1[i]=mano1.getMano().get(i);
        }

        for(int i=0;i<mano2.getMano().size(); i++){
            manotemp2[i]=mano2.getMano().get(i);
        }
        AnalizarMano.ordenarNum(manotemp1,0,mano1.getMano().size()-1);
        AnalizarMano.ordenarNum(manotemp2,0,mano2.getMano().size()-1);

        if (manotemp1[mano1.getMano().size()-1].getNumero()< manotemp2[(mano2.getMano().size())-1].getNumero()){
            jugador2.setGanar(true);
        }
        else if(manotemp1[mano1.getMano().size()-1].getNumero()> manotemp2[(mano2.getMano().size())-1].getNumero()){
            jugador1.setGanar(true);
        }
        else{
            jugador1.setGanar(true);
            jugador2.setGanar(true);
        }
    }

    public void apostar(){

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

    public boolean isPrimerApuesta() {
        return primerApuesta;
    }
}
