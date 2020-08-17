package Juego;

import java.sql.SQLOutput;
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
        String[] vectorScanner= temp.split(",");
        Carta[] vectorCartas= new Carta[vectorScanner.length];
        for(int i=0; i< vectorScanner.length;i++){
            String [] vectorTemp= vectorScanner[i].split(" ");
            Carta carta=new Carta(Integer.parseInt(vectorTemp[1]),Integer.parseInt(vectorTemp[0]));
            vectorCartas[i]=carta;
        }

        for (int i = 0; i < vectorCartas.length; i++) {
            System.out.println("VectoresBota:" +vectorCartas[i].getNumero()+vectorCartas[i].getPalo());
        }
        int numCartasBota= vectorCartas.length;
        int[] eliminar=new int[vectorCartas.length];
        int n=0;
        for (int i=0;i<mano.getMano().size();i++){
            for (int j = 0; j < vectorCartas.length; j++) {
                if( mano.getMano().get(i).compareTo(vectorCartas[j]) == 0){
                    System.out.println("hol:"+mano.getMano().indexOf(mano.getMano().get(i)));
                    eliminar[n]=mano.getMano().indexOf(mano.getMano().get(i));
                    n++;
                }
            }
        }

        int cont=0;
        for (int j=0; j< eliminar.length;j++) {
            System.out.println(eliminar[j]);
            mano.getMano().remove((eliminar[j]-cont));
            System.out.println("holii"+ (eliminar[j]-cont) );
            System.out.println("Contador"+cont);
            cont++;
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
