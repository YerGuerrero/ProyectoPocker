package Juego;

public class Carta {
    private int palo;
    private int color;
    private int numero;

    public Carta( int palo, int color, int numero ) {
        this.palo = palo;
        this.color = color;
        this.numero = numero;
    }

    public int getPalo() {
        return palo;
    }

    public int getColor() {
        return color;
    }

    public int getNumero() {
        return numero;
    }
}
