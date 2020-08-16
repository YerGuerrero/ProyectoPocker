package Poker;

import Juego.*;

import ModoJuego.Poker;

import java.util.ArrayList;

public class Holdem extends Poker {
    private Jugador jugador1;
    private Jugador jugador2;
    private Baraja baraja;

    public Holdem() {
        this.jugador1=super.getJugador1();
        this.jugador2=super.getJugador2();
        this.baraja=super.getBaraja();
    }

    @Override
    public void jugar() {
        System.out.println("Holdem");
       baraja.repartir(2,jugador1,jugador2);
       //apuesta
        Carta[] mesa= new Carta[5];
        for (int i=0; i<5;i++){
            mesa[i]= baraja.siguiente();
        }
        jugador1.pideCarta(mesa[0]);
        jugador1.pideCarta(mesa[1]);
        jugador1.pideCarta(mesa[2]);
        jugador2.pideCarta(mesa[0]);
        jugador2.pideCarta(mesa[1]);
        jugador2.pideCarta(mesa[2]);
        //Apuesta
        jugador1.pideCarta(mesa[3]);
        jugador2.pideCarta(mesa[3]);
        //Apuesta
        jugador1.pideCarta(mesa[4]);
        jugador2.pideCarta(mesa[4]);
        System.out.println("llega todo bien");

        ArrayList<Carta> manoTemp = jugador1.getMano().getMano();
        ArrayList<Carta> manoTemp2 = jugador2.getMano().getMano();
        for (Carta carta : manoTemp) {
            if (carta != null) {
                System.out.println("Jugador 1: " + carta.getNumero() + carta.getPalo());
            }
        }
        for (Carta carta : manoTemp2) {
            if (carta != null) {
                System.out.println("Jugador 2: " + carta.getNumero() + carta.getPalo());
            }
        }
        System.out.println("jugador1");
        Vector vector1= AnalizarMano.analizaMano(jugador1.getMano());
        System.out.println("jugador2");
        Vector vector2 =AnalizarMano.analizaMano(jugador2.getMano());
        super.mejorCombinacion(vector1,vector2);
        System.out.println(jugador1.isGanar());
        System.out.println(jugador2.isGanar());

    }
}
