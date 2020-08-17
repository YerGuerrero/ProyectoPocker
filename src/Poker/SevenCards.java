package Poker;

import Juego.*;
import ModoJuego.Poker;
import Poker.Apuestas;

import java.util.ArrayList;
import java.util.Random;

public class SevenCards extends Poker {
    private Jugador jugador1;
    private Jugador jugador2;
    private Baraja baraja;
    private boolean primerApuesta;

    public SevenCards() {
        this.jugador1=super.getJugador1();
        this.jugador2=super.getJugador2();
        this.baraja=super.getBaraja();
        this.primerApuesta=super.isPrimerApuesta();
    }

    @Override
    public void jugar() {

        System.out.println("Sevencard");
        Apuestas apuestas=new Apuestas();
        Random rand= new Random();
        int num= rand.nextInt(5);
        //2 cartas
        System.out.println("Inicia"+num);
        if (num % 2 == 0) {//Jugador 2-> true
            apuestas.setDealer(true);
            baraja.repartir(7,jugador1,jugador2);
        }else {
            baraja.repartir(7,jugador2,jugador1);
        }

        System.out.println("ApuestaPrimero");

        apuestas.ronda(primerApuesta);
        primerApuesta=false;

        //3 cartas


        apuestas.ronda(primerApuesta);
        //1 carta

        apuestas.ronda(primerApuesta);
        //1 carta

        apuestas.ronda(primerApuesta);

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
