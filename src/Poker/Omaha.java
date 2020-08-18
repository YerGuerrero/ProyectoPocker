package Poker;

import Combinaciones.Combinaciones;
import Juego.*;
import ModoJuego.Poker;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Omaha extends Poker {
    private Jugador jugador1;
    private Jugador jugador2;
    private Baraja baraja;
    private boolean primerApuesta;

    public Omaha() {
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
        String entrada1;
        String entrada2;
        if (num % 2 == 0) {//Jugador 2-> true
            apuestas.setDealer(true);
            baraja.repartir(4, jugador1, jugador2);
            //Imprime cartas
            System.out.print("Cartas Jugador1: ");
            for (int i = 0; i <4; i++) {
                System.out.print(jugador1.getMano().getMano().get(i).toString()+"| ");
            }
            System.out.print("\n"+"Cartas Jugador2: ");
            for (int i = 0; i <4; i++) {
                System.out.print(jugador2.getMano().getMano().get(i).toString()+"| ");
            }
            //Apuesta
            System.out.println("\n"+"Jugador 1 quiere apostar?");
            Scanner scanner1=new Scanner(System.in);
            entrada1= scanner1.nextLine();
            if (entrada1.equals("si")){
                apuestas.ronda(1,primerApuesta);
            }
            System.out.println("Jugador 2 quiere apostar?");
            Scanner scanner2=new Scanner(System.in);
            entrada2= scanner2.nextLine();
            if (entrada2.equals("si")){
                apuestas.ronda(2,primerApuesta);
            }

        } else {
            baraja.repartir(4, jugador2, jugador1);
            //Imprime cartas
            System.out.print("Cartas Jugador1: ");
            for (int i = 0; i <4; i++) {
                System.out.print(jugador1.getMano().getMano().get(i).toString()+"| ");
            }
            System.out.print("\n"+"Cartas Jugador2: ");
            for (int i = 0; i <4; i++) {
                System.out.print(jugador2.getMano().getMano().get(i).toString()+"| ");
            }

            //Apuesta
            System.out.println("\n"+"Jugador 2 quiere apostar?");
            Scanner scanner2=new Scanner(System.in);
            entrada2= scanner2.nextLine();
            if (entrada2.equals("si")){
                apuestas.ronda(2,primerApuesta);
            }
            System.out.println("Jugador 1 quiere apostar?");
            Scanner scanner1=new Scanner(System.in);
            entrada1= scanner1.nextLine();
            if (entrada2.equals("si")){
                apuestas.ronda(1,primerApuesta);
            }
        }

        primerApuesta = false;


        Carta[] mesa = new Carta[5];
        for (int i = 0; i < 5; i++) {
            mesa[i] = baraja.siguiente();
        }
        jugador1.pideCarta(mesa[0]);
        jugador1.pideCarta(mesa[1]);
        jugador1.pideCarta(mesa[2]);
        jugador2.pideCarta(mesa[0]);
        jugador2.pideCarta(mesa[1]);
        jugador2.pideCarta(mesa[2]);

        //Imprime Cartas
        System.out.print("Cartas Jugador1: ");
        for (int i = 0; i <7; i++) {
            System.out.print(jugador1.getMano().getMano().get(i).toString()+"| ");
        }
        System.out.print("\n"+"Cartas Jugador2: ");
        for (int i = 0; i <7; i++) {
            System.out.print(jugador2.getMano().getMano().get(i).toString()+"| ");
        }
        //Apuesta;
        if (apuestas.isDealer()){
            System.out.println("\n"+"Jugador 1 quiere apostar?");
            Scanner scanner1=new Scanner(System.in);
            entrada1= scanner1.nextLine();
            if (entrada1.equals("si")){
                apuestas.ronda(1,primerApuesta);
            }
            System.out.println("Jugador 2 quiere apostar?");
            Scanner scanner2=new Scanner(System.in);
            entrada2= scanner2.nextLine();
            if (entrada2.equals("si")){
                apuestas.ronda(2,primerApuesta);
            }
        }
        else {
            System.out.println("\n"+"Jugador 1 quiere apostar?");
            Scanner scanner1=new Scanner(System.in);
            entrada1= scanner1.nextLine();
            if (entrada1.equals("si")){
                apuestas.ronda(1,primerApuesta);
            }
            System.out.println("Jugador 2 quiere apostar?");
            Scanner scanner2=new Scanner(System.in);
            entrada2= scanner2.nextLine();
            if (entrada2.equals("si")){
                apuestas.ronda(2,primerApuesta);
            }
        }

        jugador1.pideCarta(mesa[3]);
        jugador2.pideCarta(mesa[3]);

        //Imprime Cartas
        System.out.print("Cartas Jugador1: ");
        for (int i = 0; i <8; i++) {
            System.out.print(jugador1.getMano().getMano().get(i).toString()+"| ");
        }
        System.out.print("\n"+"Cartas Jugador2: ");
        for (int i = 0; i <8; i++) {
            System.out.print(jugador2.getMano().getMano().get(i).toString()+"| ");
        }
        //Apuesta;
        if (apuestas.isDealer()){
            System.out.println("\n"+"Jugador 1 quiere apostar?");
            Scanner scanner1=new Scanner(System.in);
            entrada1= scanner1.nextLine();
            if (entrada1.equals("si")){
                apuestas.ronda(1,primerApuesta);
            }
            System.out.println("Jugador 2 quiere apostar?");
            Scanner scanner2=new Scanner(System.in);
            entrada2= scanner2.nextLine();
            if (entrada2.equals("si")){
                apuestas.ronda(2,primerApuesta);
            }
        }
        else {
            System.out.println("\n"+"Jugador 1 quiere apostar?");
            Scanner scanner1=new Scanner(System.in);
            entrada1= scanner1.nextLine();
            if (entrada1.equals("si")){
                apuestas.ronda(1,primerApuesta);
            }
            System.out.println("Jugador 2 quiere apostar?");
            Scanner scanner2=new Scanner(System.in);
            entrada2= scanner2.nextLine();
            if (entrada2.equals("si")){
                apuestas.ronda(2,primerApuesta);
            }
        }

        jugador1.pideCarta(mesa[4]);
        jugador2.pideCarta(mesa[4]);

        //Imprime Cartas
        System.out.print("Cartas Jugador1: ");
        for (int i = 0; i <9; i++) {
            System.out.print(jugador1.getMano().getMano().get(i).toString()+"| ");
        }
        System.out.print("\n"+"Cartas Jugador2: ");
        for (int i = 0; i <9; i++) {
            System.out.print(jugador2.getMano().getMano().get(i).toString()+"| ");
        }

        //Apuesta;
        if (apuestas.isDealer()){
            System.out.println("\n"+"Jugador 1 quiere apostar?");
            Scanner scanner1=new Scanner(System.in);
            entrada1= scanner1.nextLine();
            if (entrada1.equals("si")){
                apuestas.ronda(1,primerApuesta);
            }
            System.out.println("Jugador 2 quiere apostar?");
            Scanner scanner2=new Scanner(System.in);
            entrada2= scanner2.nextLine();
            if (entrada2.equals("si")){
                apuestas.ronda(2,primerApuesta);
            }
        }
        else {
            System.out.println("\n"+"Jugador 1 quiere apostar?");
            Scanner scanner1=new Scanner(System.in);
            entrada1= scanner1.nextLine();
            if (entrada1.equals("si")){
                apuestas.ronda(1,primerApuesta);
            }
            System.out.println("Jugador 2 quiere apostar?");
            Scanner scanner2=new Scanner(System.in);
            entrada2= scanner2.nextLine();
            if (entrada2.equals("si")){
                apuestas.ronda(2,primerApuesta);
            }
        }
        //Combina
        ArrayList<Carta> manoTemp = jugador1.getMano().getMano();
        ArrayList<Carta> manoTemp2 = jugador2.getMano().getMano();
        for (Carta carta : manoTemp) {
            if (carta != null) {
                System.out.println("\n"+"Jugador 1: " + carta.getNumero() + carta.getPalo());
            }
        }
        for (Carta carta : manoTemp2) {
            if (carta != null) {
                System.out.println("Jugador 2: " + carta.getNumero() + carta.getPalo());
            }
        }

        Combinaciones c = new Combinaciones();
        ArrayList<ArrayList<Integer>> resultado;
        resultado = c.combinacion(9, 5);

        ArrayList<ArrayList<Integer>> resultadoValido = new ArrayList<>();
        for (int i = 0; i < resultado.size(); i++) {
            int cantCartasJug = 0;
            int cantCartasMesa = 0;
            for (int j = 0; j < resultado.get(i).size(); j++) {
                if (resultado.get(i).get(j) < 4) {
                    cantCartasJug++;
                } else if (resultado.get(i).get(j) >= 4) {
                    cantCartasMesa++;
                }
            }
            if (cantCartasJug == 2 && cantCartasMesa == 3) {
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
        System.out.println(vectoresManoJug1.get(minJug1).getMano().size());
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
