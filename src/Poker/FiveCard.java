package Poker;

import Juego.*;
import ModoJuego.Poker;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FiveCard extends Poker {
    private Jugador jugador1;
    private Jugador jugador2;
    private Baraja baraja;
    private boolean primerApuesta;

    public FiveCard() {
        this.jugador1 = super.getJugador1();
        this.jugador2 = super.getJugador2();
        this.baraja = super.getBaraja();
        this.primerApuesta = super.isPrimerApuesta();
    }

    @Override
    public void jugar() {
        Apuestas apuestas = new Apuestas();
        Random rand = new Random();
        int num = rand.nextInt(5);
        System.out.println("Inicia" + num);
        if (num % 2 == 0) {//Jugador 2-> true
            apuestas.setDealer(true);
            baraja.repartir(5, jugador1, jugador2);
        } else {
            baraja.repartir(5, jugador2, jugador1);
        }

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

        System.out.println("ApuestaPrimero");

        //apuestas.ronda(primerApuesta);
        primerApuesta = false;
        //apuesta

        int cantBota1 = 0;
        int cantBota2 = 0;
        System.out.println("Jugador uno quiere botar:");
        Scanner entradaJug1 = new Scanner(System.in);
        String temp1 = entradaJug1.nextLine();
        if (temp1.equals("Si") || temp1.equals("si")) {
            System.out.println("entra jug1");
            cantBota1 = jugador1.botaCarta();

        }

        System.out.println("Jugador dos quiere botar:");
        Scanner entradaJug2 = new Scanner(System.in);
        String temp2 = entradaJug2.nextLine();
        if (temp2.equals("Si") || temp2.equals("si")) {
            cantBota2 = jugador2.botaCarta();
        }

        for (int i = 0; i < cantBota1; i++) {
            jugador1.getMano().getMano().add(baraja.siguiente());
        }
        for (int i = 0; i < cantBota2; i++) {
            jugador2.getMano().getMano().add(baraja.siguiente());
        }

        //apuestas.ronda(primerApuesta);

        System.out.println("llega todo bien");
        ArrayList<Carta> manoTemp3 = jugador1.getMano().getMano();
        ArrayList<Carta> manoTemp4 = jugador2.getMano().getMano();

        for (Carta carta : manoTemp3) {
            if (carta != null) {
                System.out.println("Jugador 1: " + carta.getNumero() + carta.getPalo());
            }
        }
        for (Carta carta : manoTemp4) {
            if (carta != null) {
                System.out.println("Jugador 2: " + carta.getNumero() + carta.getPalo());
            }
        }
        System.out.println("jugador1");
        Vector vector1 = AnalizarMano.analizaMano(jugador1.getMano());
        System.out.println("jugador2");
        Vector vector2 = AnalizarMano.analizaMano(jugador2.getMano());
        super.mejorCombinacion(vector1, vector2);
        System.out.println(jugador1.isGanar());
        System.out.println(jugador2.isGanar());
    }


}
