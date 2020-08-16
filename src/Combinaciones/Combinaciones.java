package Combinaciones;

import java.math.BigInteger;
import java.util.ArrayList;

public class Combinaciones {
    ArrayList<ArrayList<Integer>> resCombinaciones = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> combinacion(int n, int r) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            listaNumeros.add(i);
        }
        for (int i = 0; i < 1 << n; i++) {
            posiblesCombinaciones(listaNumeros, n, i);
        }
        int contador = 0;
        for (int i = 0; i < resCombinaciones.size(); i++) {
            if(resCombinaciones.get(i).size() == r){
                contador++;
                //System.out.println(resCombinaciones.get(i));
            }
        }
        //System.out.println(contador);

        return resCombinaciones;
    }

    public void posiblesCombinaciones(ArrayList<Integer> listaNumeros, int n, int combinacion) {
        ArrayList<Integer> nLista = new ArrayList<Integer>();
        for (int i = 0; i < 1 << n; i++) {
            if (BigInteger.valueOf(combinacion).testBit(i)){
                nLista.add(listaNumeros.get(i));
            }
        }
        resCombinaciones.add(nLista);
    }
}

/*
Combinaciones c = new Combinaciones();
ArrayList<ArrayList<Integer>> resultado = new ArrayList<>();
resultado = c.combinacion(9, 5);
 */
