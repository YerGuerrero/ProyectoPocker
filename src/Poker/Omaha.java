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

        String entrada1;
        String entrada2;
        if (num % 2 == 0) {//Jugador 2-> true
            apuestas.setDealer(true);
            baraja.repartir(4, jugador1, jugador2);
            System.out.println("Dinero Jugador 1: "+apuestas.getDineroJugador1());
            System.out.println("Dinero Jugador 2: "+apuestas.getDineroJugador2());
            //Imprime cartas
            System.out.print("\n"+"Cartas Jugador 1: ");
            for (int i = 0; i <4; i++) {
                System.out.print(jugador1.getMano().getMano().get(i).toString()+"| ");
            }
            System.out.print("\n"+"Cartas Jugador2: ");
            for (int i = 0; i <4; i++) {
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
            baraja.repartir(4, jugador2, jugador1);
            System.out.println("Dinero Jugador 1: "+apuestas.getDineroJugador1());
            System.out.println("Dinero Jugador 2: "+apuestas.getDineroJugador2());
            //Imprime cartas
            System.out.print("\n"+"Cartas Jugador 1: ");
            for (int i = 0; i <4; i++) {
                System.out.print(jugador1.getMano().getMano().get(i).toString()+"| ");
            }
            System.out.print("\n"+"Cartas Jugador2: ");
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

        jugador1.pideCarta(mesa[3]);
        jugador2.pideCarta(mesa[3]);

        //Imprime Cartas
        System.out.print("\n"+"Cartas Jugador 1: ");
        for (int i = 0; i <8; i++) {
            System.out.print(jugador1.getMano().getMano().get(i).toString()+"| ");
        }
        System.out.print("\n"+"Cartas Jugador2: ");
        for (int i = 0; i <8; i++) {
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

        jugador1.pideCarta(mesa[4]);
        jugador2.pideCarta(mesa[4]);

        //Imprime Cartas
        System.out.print("\n"+"Cartas Jugador 1: ");
        for (int i = 0; i <9; i++) {
            System.out.print(jugador1.getMano().getMano().get(i).toString()+"| ");
        }
        System.out.print("\n"+"Cartas Jugador 2: ");
        for (int i = 0; i <9; i++) {
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

        //Imprime Cartas
        System.out.print("\n"+"Cartas Jugador 1: ");
        for (int i = 0; i <9; i++) {
            System.out.print(jugador1.getMano().getMano().get(i).toString()+"| ");
        }
        System.out.print("\n"+"Cartas Jugador 2: ");
        for (int i = 0; i <9; i++) {
            System.out.print(jugador2.getMano().getMano().get(i).toString()+"| ");
        }
        //Combina

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

        System.out.print("\n"+"\n"+"Mejor mano Jugador 1: " );
        for (int i = 0; i < vectoresManoJug1.get(index1).getMano().size(); i++) {
            Carta carta;
            carta = vectoresManoJug1.get(index1).getMano().get(i);
            if (carta != null) {
                System.out.print( (carta.getNumero()+1) +"-"+ carta.getPalo()+"| ");
            }
        }

        System.out.print("\n"+"\n"+"Mejor mano Jugador 2: " );
        for (int i = 0; i < vectoresManoJug2.get(index2).getMano().size(); i++) {
            Carta carta;
            carta = vectoresManoJug2.get(index2).getMano().get(i);
            if (carta != null) {
                System.out.print( (carta.getNumero()+1) +"-"+ carta.getPalo()+"| ");
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
            System.out.println("----------"+"\n");
            if (isCartaAlta()){
                jugadaGanadora(9);
            }else {
                jugadaGanadora(minJug1);
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
                jugadaGanadora(minJug2);
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
                jugadaGanadora(minJug1);
            }
            apuestas.setDineroJugador1(apuestas.getDineroJugador1() +apuestas.getTotalApuesta());
            System.out.println("Dinero Jugador 1: "+apuestas.getDineroJugador1()+"\n");
        }
    }
}
