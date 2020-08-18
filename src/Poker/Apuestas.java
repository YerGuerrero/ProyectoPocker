package Poker;

import java.util.Scanner;

public class Apuestas {
    private int dineroJugador1 = 1000;
    private int dineroJugador2 = 1000;
    private int ronda = 0;
    private boolean dealer = false;

    public void ronda(int jugador, boolean primerApuesta) {
        if (primerApuesta) {
            if (dealer) {
                if (jugador == 1) {
                    System.out.println("Jugador 1 digite el monto a apostar");
                    Scanner scanner = new Scanner(System.in);
                    ronda = scanner.nextInt();
                    dineroJugador1 = dineroJugador1 - ronda;
                    System.out.println("Dinero Jugador 1: " + dineroJugador1);
                } else if (jugador == 2) {
                    dineroJugador2 = dineroJugador2 - ronda;
                    System.out.println("Dinero Jugador 2: " + dineroJugador2);
                }

            } else {
                if (jugador == 1) {
                    dineroJugador1 = dineroJugador1 - ronda;
                    System.out.println("Dinero Jugador 1: "+ dineroJugador1);
                } else if (jugador == 2) {
                    System.out.println("Jugador 2 digite el monto a apostar");
                    Scanner scanner = new Scanner(System.in);
                    ronda = scanner.nextInt();
                    dineroJugador2 = dineroJugador2 - ronda;
                    System.out.println("Dinero Jugador 2: " + dineroJugador2);
                }
            }
        } else {
            if (dealer) {
                if (jugador == 1) {
                    dineroJugador1 = dineroJugador1 - ronda;
                    System.out.println("Dinero Jugador 1: " + dineroJugador1);
                } else if (jugador == 2) {
                    dineroJugador2 = dineroJugador2 - ronda;
                    System.out.println("Dinero Jugador 2: " + dineroJugador2);
                }
            } else {
                if (jugador == 1) {
                    dineroJugador1 = dineroJugador1 - ronda;
                    System.out.println("Dinero Jugador 1: " + dineroJugador1);
                } else if (jugador == 2) {
                    dineroJugador2 = dineroJugador2 - ronda;
                    System.out.println("Dinero Jugador 2: "+ dineroJugador2);
                }

            }
        }
    }

    public void ciega() {

    }

    public void setDealer(boolean dealer) {
        this.dealer = dealer;
    }

    public boolean isDealer() {
        return dealer;
    }

    public int getDineroJugador1() {
        return dineroJugador1;
    }

    public int getDineroJugador2() {
        return dineroJugador2;
    }
}
