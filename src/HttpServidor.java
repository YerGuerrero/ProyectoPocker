import Juego.ModoJuego;
import ModoJuego.*;
import Poker.*;

import java.util.ArrayList;
import java.util.Scanner;

public class HttpServidor {
    private String puerto;

    public static void main(String[] args) {
        Scanner juego = new Scanner(System.in);
        String nombre = juego.nextLine();
        if (nombre.equals("H")) {
            Holdem holdem = new Holdem();
            holdem.jugar();
        } else if (nombre.equals("SC")) {
            SevenCards sevenCards = new SevenCards();
            sevenCards.jugar();
        } else if (nombre.equals("FC")) {
            FiveCard fiveCard = new FiveCard();
            fiveCard.jugar();
        } else if (nombre.equals("O")) {
            Omaha omaha = new Omaha();
            omaha.jugar();
        } else if (nombre.equals("HO")) {
            Horse horse = new Horse();
            horse.jugar();
        }


    }
}
