package Juego;

public class Carta implements Comparable<Carta>{
    private int palo;
    //private int color;
    private int numero;

    public Carta(int numero) {
        this.palo = (numero/13);
        //this.color = color;
        this.numero = (numero%13);
    }

    public Carta( int  palo, int numero ) {
        this.palo = palo;
        this.numero = numero;
    }

    public int getPalo() {
        return palo;
    }

    public int getNumero() {
        return numero;
    }

    public int getOrdinal(){
        return (palo*13+this.numero);
    }

    @Override
    public int compareTo( Carta carta ) {
        int temp=this.getOrdinal()- carta.getOrdinal();
        return 0;
    }
}
