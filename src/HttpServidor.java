import Juego.ModoJuego;
import ModoJuego.*;
import Poker.*;

import java.util.ArrayList;
import java.util.Scanner;

public class HttpServidor {
    private String puerto;

    public static void main(String[] args) {
        System.out.println("Digite el tipo de Poker que quiere jugar "+"\n"+"Seven Cards (SC), Five Cards (FC), Holdem (H), Horse (HO), Omaha (O)");
        Scanner juego = new Scanner(System.in);
        String nombre = juego.nextLine();
        if (nombre.equals("H")||nombre.equals("h")) {
            System.out.println("-----------");
            System.out.println("  Hold'em");
            System.out.println("-----------");
            Holdem holdem = new Holdem();
            holdem.jugar();
        } else if (nombre.equals("SC")||nombre.equals("sc")) {
            System.out.println("---------------");
            System.out.println("  Seven Cards");
            System.out.println("---------------");
            SevenCards sevenCards = new SevenCards();
            sevenCards.jugar();
        } else if (nombre.equals("FC")||nombre.equals("fc")) {
            System.out.println("--------------");
            System.out.println("  Five Cards");
            System.out.println("--------------");
            FiveCard fiveCard = new FiveCard();
            fiveCard.jugar();
        } else if (nombre.equals("O")||nombre.equals("o")) {
            System.out.println("---------");
            System.out.println("  Omaha");
            System.out.println("---------");
            Omaha omaha = new Omaha();
            omaha.jugar();
        } else if (nombre.equals("HO")||nombre.equals("ho")) {
            System.out.println("---------");
            System.out.println("  Horse");
            System.out.println("---------");
            Horse horse = new Horse();
            horse.jugar();
        }


    }
}
