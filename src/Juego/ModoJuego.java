package Juego;

import java.util.ArrayList;

import ModoJuego.*;

public class ModoJuego {
    private Jugador jugador1;
    private Jugador jugador2;
    private Baraja baraja;

    public ModoJuego() {
        jugador1 = new Jugador();
        jugador2 = new Jugador();
        baraja = new Baraja();
    }

    public void jugar() {

    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public Baraja getBaraja() {
        return baraja;
    }
}
