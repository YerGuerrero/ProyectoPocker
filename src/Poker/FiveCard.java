package Poker;

import Juego.*;
import ModoJuego.Poker;
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
        String entrada1;
        String entrada2;
        if (num % 2 == 0) {//Jugador 2-> true
            apuestas.setDealer(true);
            baraja.repartir(5, jugador1, jugador2);

            //Imprime cartas
            System.out.print("\n"+"Cartas Jugador 1: ");
            for (int i = 0; i <5; i++) {
                System.out.print(jugador1.getMano().getMano().get(i).toString()+"| ");
            }
            System.out.print("\n"+"Cartas Jugador 2: ");
            for (int i = 0; i <5; i++) {
                System.out.print(jugador2.getMano().getMano().get(i).toString()+"| ");
            }
            //Apuesta
            System.out.println("\n"+"\n"+"Jugador 1 quiere apostar?");
            Scanner scanner1=new Scanner(System.in);
            entrada1= scanner1.nextLine();
            if (entrada1.equals("si")){
                apuestas.ronda(1,primerApuesta);
            }
            System.out.println("\n"+"Jugador 2 quiere apostar?");
            Scanner scanner2=new Scanner(System.in);
            entrada2= scanner2.nextLine();
            if (entrada2.equals("si")){
                apuestas.ronda(2,primerApuesta);
            }

        } else {
            baraja.repartir(5, jugador2, jugador1);

            //Imprime cartas
            System.out.print("\n"+"Cartas Jugador 1: ");
            for (int i = 0; i <4; i++) {
                System.out.print(jugador1.getMano().getMano().get(i).toString()+"| ");
            }
            System.out.print("\n"+"Cartas Jugador 2: ");
            for (int i = 0; i <4; i++) {
                System.out.print(jugador2.getMano().getMano().get(i).toString()+"| ");
            }

            //Apuesta
            System.out.println("\n"+"\n"+"Jugador 2 quiere apostar?");
            Scanner scanner2=new Scanner(System.in);
            entrada2= scanner2.nextLine();
            if (entrada2.equals("si")){
                apuestas.ronda(2,primerApuesta);
            }
            System.out.println("\n"+"Jugador 1 quiere apostar?");
            Scanner scanner1=new Scanner(System.in);
            entrada1= scanner1.nextLine();
            if (entrada1.equals("si")){
                apuestas.ronda(1,primerApuesta);
            }
        }

        primerApuesta = false;

        int cantBota1 = 0;
        int cantBota2 = 0;
        System.out.println("\n"+"Jugador uno quiere botar:");
        Scanner entradaJug1 = new Scanner(System.in);
        String temp1 = entradaJug1.nextLine();
        if (temp1.equals("Si") || temp1.equals("si")) {
            System.out.print("\n"+"Digite las cartas a botar. Ejemplo: 1-2,13-4,... ");
            cantBota1 = jugador1.botaCarta();

        }

        System.out.println("\n"+"Jugador dos quiere botar:");
        Scanner entradaJug2 = new Scanner(System.in);
        String temp2 = entradaJug2.nextLine();
        if (temp2.equals("Si") || temp2.equals("si")) {
            System.out.println("\n"+"Digite las cartas a botar. Ejemplo: 1-2,13-4,... ");
            cantBota2 = jugador2.botaCarta();
        }

        for (int i = 0; i < cantBota1; i++) {
            jugador1.getMano().getMano().add(baraja.siguiente());
        }
        for (int i = 0; i < cantBota2; i++) {
            jugador2.getMano().getMano().add(baraja.siguiente());
        }

        //Imprime cartas
        System.out.print("\n"+"Cartas Jugador 1: ");
        for (int i = 0; i <5; i++) {
            System.out.print(jugador1.getMano().getMano().get(i).toString()+"| ");
        }
        System.out.print("\n"+"Cartas Jugador 2: ");
        for (int i = 0; i <5; i++) {
            System.out.print(jugador2.getMano().getMano().get(i).toString()+"| ");
        }

        //Apuesta
        if (apuestas.isDealer()){
            System.out.println("\n"+"\n"+"Jugador 1 quiere apostar?");
            Scanner scanner1=new Scanner(System.in);
            entrada1= scanner1.nextLine();
            if (entrada1.equals("si")){
                apuestas.ronda(1,primerApuesta);
            }
            System.out.println("\n"+"Jugador 2 quiere apostar?");
            Scanner scanner2=new Scanner(System.in);
            entrada2= scanner2.nextLine();
            if (entrada2.equals("si")){
                apuestas.ronda(2,primerApuesta);
            }
        }
        else {
            System.out.println("\n"+"\n"+"Jugador 1 quiere apostar?");
            Scanner scanner1=new Scanner(System.in);
            entrada1= scanner1.nextLine();
            if (entrada1.equals("si")){
                apuestas.ronda(1,primerApuesta);
            }
            System.out.println("\n"+"Jugador 2 quiere apostar?");
            Scanner scanner2=new Scanner(System.in);
            entrada2= scanner2.nextLine();
            if (entrada2.equals("si")){
                apuestas.ronda(2,primerApuesta);
            }
        }

        //Imprime cartas
        System.out.print("\n"+"Cartas Jugador 1: ");
        for (int i = 0; i <5; i++) {
            System.out.print(jugador1.getMano().getMano().get(i).toString()+"| ");
        }
        System.out.print("\n"+"Cartas Jugador 2: ");
        for (int i = 0; i <5; i++) {
            System.out.print(jugador2.getMano().getMano().get(i).toString()+"| ");
        }

        //Combina
        Vector vector1 = AnalizarMano.analizaMano(jugador1.getMano());
        Vector vector2 = AnalizarMano.analizaMano(jugador2.getMano());
        super.mejorCombinacion(vector1, vector2);

        if (jugador1.isGanar()&&jugador2.isGanar()){
            System.out.println("\n"+"\n"+"----------");
            System.out.println("  Empate");
            System.out.println("----------"+"\n");
            if (isCartaAlta()){
                jugadaGanadora(9);
            }else {
                jugadaGanadora(getPos1());
            }
            int mitad=apuestas.getTotalApuesta()/2;
            apuestas.setDineroJugador1(apuestas.getDineroJugador1() +mitad);
            apuestas.setDineroJugador2(apuestas.getDineroJugador2() +mitad);
            System.out.println("Dinero Jugador 1: "+apuestas.getDineroJugador1());
            System.out.println("Dinero Jugador 2: "+apuestas.getDineroJugador2()+"\n");
        }
        else if (jugador2.isGanar()){
            System.out.println("\n"+"\n"+"-----------------------");
            System.out.println("  Ganador: Jugador 2");
            System.out.println("-----------------------"+"\n");
            if (isCartaAlta()){
                jugadaGanadora(9);
            }else {
                jugadaGanadora(getPos2());
            }
            apuestas.setDineroJugador2(apuestas.getDineroJugador2() +apuestas.getTotalApuesta());
            System.out.println("Dinero Jugador 2: "+apuestas.getDineroJugador2()+"\n");
        }
        else if (jugador1.isGanar()){
            System.out.println("\n"+"\n"+"-----------------------");
            System.out.println("  Ganador: Jugador 1");
            System.out.println("-----------------------"+"\n");
            if (isCartaAlta()){
                jugadaGanadora(9);
            }else {
                jugadaGanadora(getPos1());
            }
            apuestas.setDineroJugador1(apuestas.getDineroJugador1() +apuestas.getTotalApuesta());
            System.out.println("Dinero Jugador 1: "+apuestas.getDineroJugador1()+"\n");
        }
    }
}
