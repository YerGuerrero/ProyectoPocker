package Poker;

import Juego.Baraja;
import Juego.Jugador;
import ModoJuego.Poker;

import java.util.Scanner;

public class Horse extends Poker {
    private Jugador jugador1;
    private Jugador jugador2;
    private Baraja baraja;
    private boolean primerApuesta;

    public Horse() {
        this.jugador1 = super.getJugador1();
        this.jugador2 = super.getJugador2();
        this.baraja = super.getBaraja();
        this.primerApuesta = super.isPrimerApuesta();
    }

    @Override
    public void jugar() {
        System.out.println("Digite la cantidad de partidas que va a jugar por modo de juego:");
        Scanner scanner = new Scanner(System.in);
        int cantManos = scanner.nextInt();
        System.out.println("\n"+"*** Holdem ***");
        for (int i = 0; i < cantManos; i++) {
            Holdem holdem = new Holdem();
            holdem.jugar();
            if(i!=cantManos-1){
                System.out.println("-----------------");
                System.out.println(" Nueva Partida");
                System.out.println("-----------------");
            }
        }

        System.out.println("---------------------------");
        System.out.println(" Siguiente modo de Juego");
        System.out.println("---------------------------");
        System.out.println("\n"+"*** Omaha ***");
        for (int i = 0; i < cantManos; i++) {
            Omaha omaha = new Omaha();
            omaha.jugar();
            if(i!=cantManos-1){
                System.out.println("-----------------");
                System.out.println(" Nueva Partida");
                System.out.println("-----------------");
            }
        }

        System.out.println("---------------------------");
        System.out.println(" Siguiente modo de Juego");
        System.out.println("---------------------------");
        System.out.println("\n"+"*** Five Cards ***");
        for (int i = 0; i < cantManos; i++) {
            FiveCard fiveCard = new FiveCard();
            fiveCard.jugar();
            if(i!=cantManos-1){
                System.out.println("-----------------");
                System.out.println(" Nueva Partida");
                System.out.println("-----------------");
            }
        }

        System.out.println("---------------------------");
        System.out.println(" Siguiente modo de Juego");
        System.out.println("---------------------------");
        System.out.println("\n"+"*** Seven Cards ***");
        for (int i = 0; i < cantManos; i++) {
            SevenCards sevenCards = new SevenCards();
            sevenCards.jugar();
            if(i!=cantManos-1){
                System.out.println("-----------------");
                System.out.println(" Nueva Partida");
                System.out.println("-----------------");
            }
        }

        System.out.println("---------------------------");
        System.out.println(" Siguiente modo de Juego");
        System.out.println("---------------------------");
        System.out.println("\n"+"*** Hold'em ***");
        for (int i = 0; i < cantManos; i++) {
            Holdem holdem = new Holdem();
            holdem.jugar();
            if(i!=cantManos-1){
                System.out.println("-----------------");
                System.out.println(" Nueva Partida");
                System.out.println("-----------------");
            }
        }

    }
}
