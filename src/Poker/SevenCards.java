package Poker;

import Combinaciones.Combinaciones;
import Juego.*;
import ModoJuego.Poker;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SevenCards extends Poker {
    private Jugador jugador1;
    private Jugador jugador2;
    private Baraja baraja;
    private boolean primerApuesta;

    public SevenCards() {
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
        //2 cartas
        if (num % 2 == 0) {//Jugador 2-> true
            apuestas.setDealer(true);
            baraja.repartir(7, jugador1, jugador2);
            System.out.println("Cartas Jugador1: " + jugador1.getMano().getMano().get(0).toString() + "| " + jugador1.getMano().getMano().get(1).toString());
            System.out.println("Cartas Jugador2: " + jugador2.getMano().getMano().get(0).toString() + "| " + jugador2.getMano().getMano().get(1).toString());
            System.out.println("Jugador 1 quiere apostar?");
            Scanner scanner1 = new Scanner(System.in);
            entrada1 = scanner1.nextLine();
            if (entrada1.equals("si")) {
                apuestas.ronda(1, primerApuesta);
            }
            System.out.println("Jugador 2 quiere apostar?");
            Scanner scanner2 = new Scanner(System.in);
            entrada2 = scanner2.nextLine();
            if (entrada2.equals("si")) {
                apuestas.ronda(2, primerApuesta);
            }
        } else {
            baraja.repartir(7, jugador2, jugador1);
            System.out.println("Cartas Jugador1: " + jugador1.getMano().getMano().get(0).toString() + "| " + jugador1.getMano().getMano().get(1).toString());
            System.out.println("Cartas Jugador2: " + jugador2.getMano().getMano().get(0).toString() + "| " + jugador2.getMano().getMano().get(1).toString());
            System.out.println("Jugador 2 quiere apostar?");
            Scanner scanner2 = new Scanner(System.in);
            entrada2 = scanner2.nextLine();
            System.out.println("Jugador 1 quiere apostar?");
            Scanner scanner1 = new Scanner(System.in);
            entrada1 = scanner1.nextLine();
        }
        //Apuesta
        primerApuesta = false;
        //3 cartas
        System.out.println("Cartas Jugador1: " + jugador1.getMano().getMano().get(0).toString() + "| " + jugador1.getMano().getMano().get(1).toString() + "| " + jugador1.getMano().getMano().get(2).toString() + "| " + jugador1.getMano().getMano().get(3).toString() + "| " + jugador1.getMano().getMano().get(4).toString());
        System.out.println("Cartas Jugador2: " + jugador2.getMano().getMano().get(0).toString() + "| " + jugador2.getMano().getMano().get(1).toString() + "| " + jugador2.getMano().getMano().get(2).toString() + "| " + jugador2.getMano().getMano().get(3).toString() + "| " + jugador2.getMano().getMano().get(4).toString());
        //Apuesta
        if (apuestas.isDealer()) {
            System.out.println("Jugador 1 quiere apostar?");
            Scanner scanner1 = new Scanner(System.in);
            entrada1 = scanner1.nextLine();
            if (entrada1.equals("si")) {
                apuestas.ronda(1, primerApuesta);
            }
            System.out.println("Jugador 2 quiere apostar?");
            Scanner scanner2 = new Scanner(System.in);
            entrada2 = scanner2.nextLine();
            if (entrada2.equals("si")) {
                apuestas.ronda(2, primerApuesta);
            }
        } else {
            System.out.println("Jugador 1 quiere apostar?");
            Scanner scanner1 = new Scanner(System.in);
            entrada1 = scanner1.nextLine();
            if (entrada1.equals("si")) {
                apuestas.ronda(1, primerApuesta);
            }
            System.out.println("Jugador 2 quiere apostar?");
            Scanner scanner2 = new Scanner(System.in);
            entrada2 = scanner2.nextLine();
            if (entrada2.equals("si")) {
                apuestas.ronda(2, primerApuesta);
            }
        }
        //1 carta
        System.out.println("Cartas Jugador1: " + jugador1.getMano().getMano().get(0).toString() + "| " + jugador1.getMano().getMano().get(1).toString() + "| " + jugador1.getMano().getMano().get(2).toString() + "| " + jugador1.getMano().getMano().get(3).toString() + "| " + jugador1.getMano().getMano().get(4).toString() + "| " + jugador1.getMano().getMano().get(5).toString());
        System.out.println("Cartas Jugador2: " + jugador2.getMano().getMano().get(0).toString() + "| " + jugador2.getMano().getMano().get(1).toString() + "| " + jugador2.getMano().getMano().get(2).toString() + "| " + jugador2.getMano().getMano().get(3).toString() + "| " + jugador2.getMano().getMano().get(4).toString() + "| " + jugador2.getMano().getMano().get(5).toString());

        //Apuesta
        if (apuestas.isDealer()) {
            System.out.println("Jugador 1 quiere apostar?");
            Scanner scanner1 = new Scanner(System.in);
            entrada1 = scanner1.nextLine();
            if (entrada1.equals("si")) {
                apuestas.ronda(1, primerApuesta);
            }
        } else {
            System.out.println("Jugador 2 quiere apostar?");
            Scanner scanner2 = new Scanner(System.in);
            entrada2 = scanner2.nextLine();
            if (entrada2.equals("si")) {
                apuestas.ronda(2, primerApuesta);
            }
        }

        //1 carta
        System.out.println("Cartas Jugador1: " + jugador1.getMano().getMano().get(0).toString() + " " + jugador1.getMano().getMano().get(1).toString() + " " + jugador1.getMano().getMano().get(2).toString() + " " + jugador1.getMano().getMano().get(3).toString() + " " + jugador1.getMano().getMano().get(4).toString() + " " + jugador1.getMano().getMano().get(5).toString() + " " + jugador1.getMano().getMano().get(6).toString());
        System.out.println("Cartas Jugador2: " + jugador2.getMano().getMano().get(0).toString() + " " + jugador2.getMano().getMano().get(1).toString() + " " + jugador2.getMano().getMano().get(2).toString() + " " + jugador2.getMano().getMano().get(3).toString() + " " + jugador2.getMano().getMano().get(4).toString() + " " + jugador2.getMano().getMano().get(5).toString() + " " + jugador2.getMano().getMano().get(6).toString());

        //Apuesta
        if (apuestas.isDealer()) {
            System.out.println("Jugador 1 quiere apostar?");
            Scanner scanner1 = new Scanner(System.in);
            entrada1 = scanner1.nextLine();
            if (entrada1.equals("si")) {
                apuestas.ronda(1, primerApuesta);
            }
        } else {
            System.out.println("Jugador 2 quiere apostar?");
            Scanner scanner2 = new Scanner(System.in);
            entrada2 = scanner2.nextLine();
            if (entrada2.equals("si")) {
                apuestas.ronda(2, primerApuesta);
            }
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

        Combinaciones c = new Combinaciones();
        ArrayList<ArrayList<Integer>> resultado = new ArrayList<>();
        resultado = c.combinacion(7, 5);

        ArrayList<ArrayList<Integer>> resultadoValido = new ArrayList<>();
        for (int i = 0; i < resultado.size(); i++) {
            int cantCartasJug = 0;
            for (int j = 0; j < resultado.get(i).size(); j++) {
                cantCartasJug++;
            }
            if (cantCartasJug == 5) {
                resultadoValido.add(resultado.get(i));
            }
        }

        ArrayList<Vector> vectoresJug1 = new ArrayList<>();
        ArrayList<Vector> vectoresJug2 = new ArrayList<>();
        ArrayList<Mano> vectoresManoJug1 = new ArrayList<>();
        ArrayList<Mano> vectoresManoJug2 = new ArrayList<>();

        for (int i = 0; i < resultadoValido.size(); i++) {
            Mano mano1 = new Mano();
            Mano mano2 = new Mano();
            ArrayList<Carta> manotempJug1 = new ArrayList<>();
            ArrayList<Carta> manotempJug2 = new ArrayList<>();
            for (int j = 0; j < resultadoValido.get(i).size(); j++) {
                manotempJug1.add(jugador1.getMano().getMano().get(resultadoValido.get(i).get(j)));
                manotempJug2.add(jugador2.getMano().getMano().get(resultadoValido.get(i).get(j)));
            }
            mano1.setMano(manotempJug1);
            mano2.setMano(manotempJug2);
            vectoresManoJug1.add(mano1);
            vectoresManoJug2.add(mano2);
            vectoresJug1.add(AnalizarMano.analizaMano(mano1));
            vectoresJug2.add(AnalizarMano.analizaMano(mano2));
        }
        int[] valoresJug1 = new int[vectoresJug1.size()];
        int[] valoresJug2 = new int[vectoresJug2.size()];
        for (int i = 0; i < vectoresJug1.size(); i++) {
            for (int j = 0; j < 10; j++) {
                if (vectoresJug1.get(i).get(j) == 1) {
                    valoresJug1[i] = j;
                }
                if (vectoresJug2.get(i).get(j) == 1) {
                    valoresJug2[i] = j;
                }
            }
        }
        for (int k : valoresJug1) {
            System.out.println("ValoresJug1:" + k);
        }
        System.out.println("Ver valores de vectores");
        for (int j : valoresJug2) {
            System.out.println("ValoresJug2:" + j);
        }

        int minJug1 = valoresJug1[0];
        int minJug2 = valoresJug2[0];
        System.out.println("Minimo en ceroJug1" + minJug1);
        System.out.println("Minimo en ceroJug2" + minJug2);
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < valoresJug1.length; i++) {
            if (minJug1 > valoresJug1[i]) {
                minJug1 = valoresJug1[i];
                index1 = i;
            }
            if (minJug2 > valoresJug2[i]) {
                minJug2 = valoresJug2[i];
                index2 = i;
            }
        }

        System.out.println("UltimoMinimo en ceroJug1" + minJug1 + " " + index1);
        System.out.println("UltimoMinimo en ceroJug2" + minJug2 + " " + index2);
        System.out.println(vectoresManoJug1.get(index1).getMano().size());
        for (int i = 0; i < vectoresManoJug1.get(index1).getMano().size(); i++) {
            Carta carta;
            carta = vectoresManoJug1.get(index1).getMano().get(i);
            if (carta != null) {
                System.out.println("Jugador 1: " + carta.getNumero() + carta.getPalo());
            }
        }

        System.out.println(vectoresManoJug2.get(index2).getMano().size());
        for (int i = 0; i < vectoresManoJug2.get(index2).getMano().size(); i++) {
            Carta carta;
            carta = vectoresManoJug2.get(index2).getMano().get(i);
            if (carta != null) {
                System.out.println("Jugador 2: " + carta.getNumero() + carta.getPalo());
            }
        }
        if (minJug1 < minJug2) {
            jugador1.setGanar(true);
        } else if (minJug1 > minJug2) {
            jugador2.setGanar(true);
        } else {
            empate(vectoresManoJug1.get(index1), vectoresManoJug2.get(index2));
        }
        System.out.println(jugador1.isGanar());
        System.out.println(jugador2.isGanar());
    }
}
