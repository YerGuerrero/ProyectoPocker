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
        Scanner scanner = new Scanner(System.in);
        int cantManos = scanner.nextInt();
        for (int i = 0; i < cantManos; i++) {
            System.out.println("Holdem");
            Holdem holdem = new Holdem();
            holdem.jugar();
        }
        for (int i = 0; i < cantManos; i++) {
            System.out.println("Omaha");
            Omaha omaha = new Omaha();
            omaha.jugar();
        }
        for (int i = 0; i < cantManos; i++) {
            System.out.println("FiveCard");
            FiveCard fiveCard = new FiveCard();
            fiveCard.jugar();
        }
        for (int i = 0; i < cantManos; i++) {
            System.out.println("SevenCard");
            SevenCards sevenCards = new SevenCards();
            sevenCards.jugar();
        }
    }


}
