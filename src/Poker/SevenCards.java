package Poker;

import Juego.*;
import ModoJuego.Poker;

import java.util.ArrayList;

public class SevenCards extends Poker {
    private Jugador jugador1;
    private Jugador jugador2;
    private Baraja baraja;

    public SevenCards() {
        this.jugador1=super.getJugador1();
        this.jugador2=super.getJugador2();
        this.baraja=super.getBaraja();
    }

    @Override
    public void jugar() {
        System.out.println("Sevencard");
        baraja.repartir(7,jugador1,jugador2);
        //2 cartas
        //apuesta
        //3 cartas
        //Apuesta
        //1 carta
        //Apuesta
        //1 carta
        //Apuesta
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

    }
}
