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

            System.out.println("Dinero Jugador 1: "+apuestas.getDineroJugador1());
            System.out.println("Dinero Jugador 2: "+apuestas.getDineroJugador2());
            //Imprime cartas
            System.out.print("\n"+"Cartas Jugador 1: ");
            for (int i = 0; i <2; i++) {
                System.out.print(jugador1.getMano().getMano().get(i).toString()+"| ");
            }

            System.out.print("\n"+"Cartas Jugador 2: ");
            for (int i = 0; i <2; i++) {
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
            baraja.repartir(7, jugador2, jugador1);

            System.out.println("Dinero Jugador 1: "+apuestas.getDineroJugador1());
            System.out.println("Dinero Jugador 2: "+apuestas.getDineroJugador2());
            //Imprime cartas
            System.out.print("\n"+"Cartas Jugador 1: ");
            for (int i = 0; i <2; i++) {
                System.out.print(jugador1.getMano().getMano().get(i).toString()+"| ");
            }

            System.out.print("\n"+"Cartas Jugador 2: ");
            for (int i = 0; i <2; i++) {
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

        //Apuesta

        primerApuesta = false;


        //3 cartas
        //Imprime cartas
        System.out.print("\n"+"Cartas Jugador1: ");
        for (int i = 0; i <5; i++) {
            System.out.print(jugador1.getMano().getMano().get(i).toString()+"| ");
        }
        System.out.print("\n"+"Cartas Jugador2: ");
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
        for (int i = 0; i <6; i++) {
            System.out.print(jugador1.getMano().getMano().get(i).toString()+"| ");
        }
        System.out.print("\n"+"Cartas Jugador 2: ");
        for (int i = 0; i <6; i++) {
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
        for (int i = 0; i <7; i++) {
            System.out.print(jugador1.getMano().getMano().get(i).toString()+"| ");
        }
        System.out.print("\n"+"Cartas Jugador 2: ");
        for (int i = 0; i <7; i++) {
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
        for (int i = 0; i <7; i++) {
            System.out.print(jugador1.getMano().getMano().get(i).toString()+"| ");
        }
        System.out.print("\n"+"Cartas Jugador 2: ");
        for (int i = 0; i <7; i++) {
            System.out.print(jugador2.getMano().getMano().get(i).toString()+"| ");
        }

        //Combinar
        Combinaciones c = new Combinaciones();
        ArrayList<ArrayList<Integer>> resultado=new ArrayList<>();
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

        int minJug1 = valoresJug1[0];
        int minJug2 = valoresJug2[0];

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


        if (minJug1 < minJug2) {
            jugador1.setGanar(true);
        } else if (minJug1 > minJug2) {
            jugador2.setGanar(true);
        } else {
            empate(vectoresManoJug1.get(index1), vectoresManoJug2.get(index2));
        }
        if (jugador1.isGanar()&&jugador2.isGanar()){
            System.out.println("\n"+"\n"+"----------");
            System.out.println("  Empate");
            System.out.println("----------");
        }
        else if (jugador2.isGanar()){
            System.out.println("\n"+"\n"+"-----------------------");
            System.out.println("  Ganador: Jugador 2");
            System.out.println("-----------------------");
        }
        else if (jugador1.isGanar()){
            System.out.println("\n"+"\n"+"-----------------------");
            System.out.println("  Ganador: Jugador 1");
            System.out.println("-----------------------");
        }
    }
}