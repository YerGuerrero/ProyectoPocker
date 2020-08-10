package Juego;

import java.util.ArrayList;

public class Mano {
    private ArrayList<Carta> cartasAbiertas;
    private ArrayList<Carta> cartasJugador= new ArrayList<Carta>(5);
    Vector vector= new Vector(6);

    public Mano() {

    }

    public ArrayList<Carta> getCartasAbiertas() {
        return cartasAbiertas;
    }

    public ArrayList<Carta> getCartasJugador() {
        return cartasJugador;
    }

    public void setCartasAbiertas( ArrayList<Carta> cartasAbiertas ) {
        this.cartasAbiertas = cartasAbiertas;
    }

    public void setCartasJugador( ArrayList<Carta> cartasJugador ) {
        this.cartasJugador = cartasJugador;
    }
}
