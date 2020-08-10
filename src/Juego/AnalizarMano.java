package Juego;

import java.util.ArrayList;
import java.util.*;

public class AnalizarMano {
    int CANT_CARTAS;

    public Vector analizaMano(Mano mano){
        CANT_CARTAS=mano.getCartasJugador().size()+mano.getCartasAbiertas().size();
        ArrayList<Carta> manoCompleta= new ArrayList<Carta>();
        manoCompleta.addAll(mano.getCartasJugador());
        manoCompleta.addAll(mano.getCartasAbiertas());

        Vector vector= new Vector(CANT_CARTAS+1);
        return vector;
    }

    public boolean esEscaleraReal(Carta[] mano){
        return esEscaleraReal(ordenarNum(mano)) && esColor(mano);
    }

    public boolean esColor(Carta[] mano){
        boolean color= true;
        for (int i=1; i<CANT_CARTAS&& color;i++){
            color=mano[0].getPalo()==mano[i].getPalo();
        }
        return color;
    }

    public boolean esEscalera(Carta[] mano){
        int num=mano[0].getNumero();
        boolean escalera= true;
        ordenarNum(mano);
        for (int i=1;i<CANT_CARTAS && escalera;i++){
            escalera=num+i==mano[i].getNumero();
        }
        return escalera;
    }

    public boolean esEscaleraColor(Carta[] mano){

        boolean escaleraColor=true;
        return true;
    }

    public boolean esPoker(Carta[] mano){
        return true;
    }

    public boolean esFull(Carta[] mano){
        return true;
    }

    public boolean esTrio(Carta[] mano){
        return true;
    }

    public boolean esDoblePareja(Carta[] mano){
        return true;
    }

    public boolean esPareja(Carta[] mano){
        return true;
    }

    public boolean esCartaAlta(Carta[] mano){
        return true;
    }

    private Carta[] ordenarNum( Carta[] mano){
        ordenarNum(mano,0,4);
        return mano;
    }

    private Carta[] ordenarNum(Carta[] mano,int inicio, int ultimo ){
        if (inicio<ultimo){
            int contParticion=particion(mano, inicio, ultimo);
            ordenarNum(mano,inicio,contParticion-1);
            ordenarNum(mano,contParticion+1,ultimo);
        }
        return mano;
    }

    private int particion( Carta[] ordenar, int inicio, int ultimo ){
        int privote= ordenar[ultimo].getNumero();
        int i= (inicio-1);

        for(int j = inicio; j<ultimo; j++){
            if(ordenar[j].getNumero()<=privote){
                i++;
                Carta swapTemp=ordenar[i];
                ordenar[i]=ordenar[j];
                ordenar[j]=swapTemp;
            }
        }
        Carta swapTemp= ordenar[i+1];
        ordenar[i+1]=ordenar[ultimo];
        ordenar[ultimo]=swapTemp;
        return i+1;
    }

}
