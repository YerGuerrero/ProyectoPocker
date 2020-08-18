package Juego;

public class Carta implements Comparable<Carta> {
    private int palo;
    private int numero;

    public Carta(int numero) {
        this.palo = (numero / 13);
        this.numero = (numero % 13);
    }

    public Carta(int palo, int numero) {
        this.palo = palo;
        this.numero = numero;
    }

    public int getPalo() {
        return palo;
    }

    public int getNumero() {
        return numero;
    }

    public int getOrdinal() {
        return (palo * 13 + this.numero);
    }

    @Override
    public int compareTo(Carta carta) {
        return this.getOrdinal() - carta.getOrdinal();
    }

    public String toString() {
        String string = new String(String.valueOf(numero+1 + "-" + palo));
        return string;
    }
}
