package Juego;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Jugador {
    private Mano mano= new Mano();
    private int id;
    private boolean ganar=false;

    public void apuestaJugador(){//Preguntar

    }

    public void pideCarta(Carta carta){
        mano.getMano().add(carta);
    }

    public int botaCarta(){
        Scanner cartas= new Scanner(System.in);
        String temp= cartas.nextLine();
        System.out.println("Vefgf");
        String[] vectorScanner= temp.split(",");

        System.out.println("tamaño:"+vectorScanner.length);
        Carta[] vectorCartas= new Carta[vectorScanner.length];
        for(int i=0; i< vectorScanner.length;i++){
            String [] vectorTemp= vectorScanner[i].split(" ");
            System.out.println("llega aqui");
            Carta carta=new Carta(Integer.parseInt(vectorTemp[0]),Integer.parseInt(vectorTemp[1]));
            vectorCartas[i]=carta;
        }
        int numCartasBota= vectorCartas.length;
        int contador=0;
        for (int i=0;i<mano.getMano().size()-1;i++){
            while(contador < vectorScanner.length &&(!(mano.getMano().get(i).compareTo(vectorCartas[contador]) == 0))){
                    contador++;
            }
            if (mano.getMano().get(i).compareTo(vectorCartas[contador]) == 0) {
                mano.getMano().remove(i);
                i--;
            }
        }
        return numCartasBota;
    }

    public void setMano( Mano mano ) {
        this.mano = mano;
    }

    public Mano getMano() {
        return mano;
    }

    public int getId() {
        return id;
    }

    public boolean isGanar() {
        return ganar;
    }

    public void setGanar( boolean ganar ) {
        this.ganar = ganar;
    }
}
