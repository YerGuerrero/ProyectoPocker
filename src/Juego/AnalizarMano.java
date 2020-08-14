package Juego;


public class AnalizarMano {
    private static int CANT_CARTAS = 0;

    public static Vector analizaMano( Mano mano ){
        CANT_CARTAS=mano.getMano().size();
        Carta[] manoCompleta= new Carta[CANT_CARTAS];
        for(int i=0;i<CANT_CARTAS; i++){
            manoCompleta[i]=mano.getMano().get(i);
        }
        Vector vector= new Vector(CANT_CARTAS+1);

        if(esEscaleraReal(manoCompleta)){
            vector.set(0,9);
        }
        else if(esEscaleraColor(manoCompleta)){
            vector.set(1,8);
        }
        else if(esPoker(manoCompleta)){
            vector.set(2,7);
        }
        else if(esFull(manoCompleta)){
            vector.set(3,6);
        }
        else if(esColor(manoCompleta)){
            vector.set(4,5);
        }
        else if(esEscalera(manoCompleta)){
            vector.set(5,4);
        }
        else if(esTrio(manoCompleta)){
            vector.set(6,3);
        }
        else if(esDoblePareja(manoCompleta)){
            vector.set(7,2);
        }
        else if(esPareja(manoCompleta)){
            vector.set(8,1);
        }
        else {
            vector.set(9,0);
        }
        for (int i=0; i<CANT_CARTAS;i++){
            System.out.println("Vector:"+ vector.get(i));
        }
        return vector;
    }

    public static boolean esEscaleraReal(Carta[] mano) {
        return esEscaleraReal(ordenarNum(mano)) && esColor(mano);
    }

    public static boolean esColor(Carta[] mano) {
        boolean color = true;
        for (int i = 1; i < CANT_CARTAS && color; i++) {
            color = mano[0].getPalo() == mano[i].getPalo();
        }
        return color;
    }

    public static boolean esEscalera(Carta[] mano) {
        int num = mano[0].getNumero();
        boolean escalera = true;
        ordenarNum(mano);
        for (int i = 1; i < CANT_CARTAS && escalera; i++) {
            escalera = num + i == mano[i].getNumero();
        }
        return escalera;
    }

    public static boolean esEscaleraColor(Carta[] mano) {
        int num = mano[0].getNumero();
        boolean escaleraColor = true;
        ordenarNum(mano);
        for (int i = 1; i < CANT_CARTAS && escaleraColor; i++) {
            escaleraColor = (mano[0].getPalo() == mano[i].getPalo()) &&
                    (num + i == mano[i].getNumero());
        }
        return escaleraColor;
    }

    public static boolean esPoker(Carta[] mano) {
        boolean poker = true;
        ordenarNum(mano);
        if (mano[0].getNumero() == mano[1].getNumero()) {
            for (int i = 1; i < CANT_CARTAS - 1 && poker; i++) {
                poker = (mano[0].getNumero() == mano[i].getNumero());
            }
        } else {
            for (int i = 2; i < CANT_CARTAS && poker; i++) {
                poker = (mano[1].getNumero() == mano[i].getNumero());
            }
        }
        return poker;
    }

    public static boolean esFull(Carta[] mano) {
        return true;
    }

    public static boolean esTrio(Carta[] mano) {
        boolean trio = false;
        ordenarNum(mano);
        int cant = 1;
        for (int i = 0; i < CANT_CARTAS; i++) {
            if (mano[i].getNumero() == mano[i + 1].getNumero()) {
                cant++;
            }
        }
        trio = cant == 3;
        return trio;
    }

    public static boolean esPareja(Carta[] mano) {
        boolean pareja = false;
        ordenarNum(mano);
        int cant = 1;
        for (int i = 0; i < CANT_CARTAS; i++) {
            if (mano[i].getNumero() == mano[i + 1].getNumero()) {
                cant++;
            }
        }
        pareja = cant == 2;
        return pareja;
    }

    public static boolean esDoblePareja(Carta[] mano) {
        boolean doblePareja = false;
        ordenarNum(mano);
        int parejas = 0;
        for (int i = 0; i < CANT_CARTAS; i++) {
            if (mano[i].getNumero() == mano[i + 1].getNumero()) {
                parejas++;
            }
        }
        doblePareja = parejas == 2;
        return doblePareja;
    }

    public static Carta esCartaAlta(Carta[] mano) {
        ordenarNum(mano);
        return mano[(mano.length)-1];
    }

    public static Carta[] ordenarNum(Carta[] mano) {
        ordenarNum(mano, 1, 9);
        return mano;
    }

    public static void ordenarNum(Carta[] mano, int inicio, int ultimo) {
        if (inicio < ultimo) {
            int contParticion = particion(mano, inicio, ultimo);
            ordenarNum(mano, inicio, contParticion - 1);
            ordenarNum(mano, contParticion + 1, ultimo);
        }
    }

    public static int particion(Carta[] ordenar, int inicio, int ultimo) {
        int privote = ordenar[ultimo].getNumero();
        int i = inicio-1;

        for (int j = inicio; j < ultimo; j++) {
            if (ordenar[j].getNumero() <= privote) {
                i++;
                Carta swapTemp = ordenar[i];
                ordenar[i] = ordenar[j];
                ordenar[j] = swapTemp;
            }
        }
        Carta swapTemp = ordenar[i + 1];
        ordenar[i + 1] = ordenar[ultimo];
        ordenar[ultimo] = swapTemp;
        return i + 1;
    }

}
