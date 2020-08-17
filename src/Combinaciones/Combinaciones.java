package Combinaciones;

import java.math.BigInteger;
import java.util.ArrayList;

public class Combinaciones {
    ArrayList<ArrayList<Integer>> Combinaciones = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> combinacion(int n, int r) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            listaNumeros.add(i);
        }
        for (int i = 0; i < 1 << n; i++) {
            posiblesCombinaciones(listaNumeros, n, i);
        }
        int contador = 0;
        ArrayList<ArrayList<Integer>> resultado = new ArrayList<>();
        for (int i = 0; i < Combinaciones.size(); i++) {
            if (Combinaciones.get(i).size() == r) {
                contador++;
                resultado.add(Combinaciones.get(i));
            }
        }
        //System.out.println(contador);
        return resultado;
    }

    public void posiblesCombinaciones(ArrayList<Integer> listaNumeros, int n, int combinacion) {
        ArrayList<Integer> nLista = new ArrayList<>();
        for (int i = 0; i < 1 << n; i++) {
            if (BigInteger.valueOf(combinacion).testBit(i)) {
                nLista.add(listaNumeros.get(i));
            }
        }
        Combinaciones.add(nLista);
    }
}

/*
Combinaciones c = new Combinaciones();
ArrayList<ArrayList<Integer>> resultado = new ArrayList<>();
resultado = c.combinacion(9, 5);
 */
