package Juego;

public class AnalizarMano {
    private static int TAM_VECTOR = 10;
    static int CANT_CARTASJUG;

    public static Vector analizaMano(Mano mano) {
        CANT_CARTASJUG = mano.getMano().size();
        Carta[] manoCompleta = new Carta[CANT_CARTASJUG];
        for (int i = 0; i < CANT_CARTASJUG; i++) {
            manoCompleta[i] = mano.getMano().get(i);
        }
        Vector vector = new Vector(TAM_VECTOR + 1);
        if (esEscaleraReal(manoCompleta)) {
            vector.set(0, 1);
        } else if (esEscaleraColor(manoCompleta)) {
            vector.set(1, 1);
        } else if (esPoker(manoCompleta)) {
            vector.set(2, 1);
        } else if (esFull(manoCompleta)) {
            vector.set(3, 1);
        } else if (esColor(manoCompleta)) {
            vector.set(4, 1);
        } else if (esEscalera(manoCompleta)) {
            vector.set(5, 1);
        } else if (esTrio(manoCompleta)) {
            vector.set(6, 1);
        } else if (esDoblePareja(manoCompleta)) {
            vector.set(7, 1);
        } else if (esPareja(manoCompleta)) {
            vector.set(8, 1);
        } else if (esCartaAlta(manoCompleta)) {
            vector.set(9, 1);
        }
        return vector;
    }

    public static boolean esEscaleraReal(Carta[] mano) {
        return esEscalera(ordenarNum(mano)) && esColor(mano);
    }

    public static boolean esColor(Carta[] mano) {
        boolean color = true;
        for (int i = 1; i < CANT_CARTASJUG && color; i++) {
            color = mano[0].getPalo() == mano[i].getPalo();
        }
        return color;
    }

    public static boolean esEscalera(Carta[] mano) {
        int num = mano[0].getNumero();
        boolean escalera = true;
        ordenarNum(mano);
        for (int i = 1; i < CANT_CARTASJUG && escalera; i++) {
            escalera = num + i == mano[i].getNumero();
        }
        return escalera;
    }

    public static boolean esEscaleraColor(Carta[] mano) {
        int num = mano[0].getNumero();
        boolean escaleraColor = true;
        ordenarNum(mano);
        for (int i = 1; i < CANT_CARTASJUG && escaleraColor; i++) {
            escaleraColor = (mano[0].getPalo() == mano[i].getPalo()) &&
                    (num + i == mano[i].getNumero());
        }
        return escaleraColor;
    }

    public static boolean esPoker(Carta[] mano) {
        boolean poker = true;
        ordenarNum(mano);
        if (mano[0].getNumero() == mano[1].getNumero()) {
            for (int i = 1; i < CANT_CARTASJUG - 1 && poker; i++) {
                poker = (mano[0].getNumero() == mano[i].getNumero());
            }
        } else {
            for (int i = 2; i < CANT_CARTASJUG && poker; i++) {
                poker = (mano[1].getNumero() == mano[i].getNumero());
            }
        }
        return poker;
    }

    public static boolean esFull(Carta[] mano) {
        return (esTrio(mano) && esPareja(mano));
    }

    public static boolean esTrio(Carta[] mano) {
        boolean trio = false;
        ordenarNum(mano);
        for (int i = 0; i < CANT_CARTASJUG - 2 && !trio; i++) {
            trio = mano[i].getNumero() == mano[i + 1].getNumero() && mano[i].getNumero() == mano[i + 2].getNumero();
        }
        return trio;
    }

    public static boolean esPareja(Carta[] mano) {
        boolean pareja;
        ordenarNum(mano);
        int parejaSimple = 0;
        for (int i = 0; i < CANT_CARTASJUG - 1; i++) {
            if (mano[i].getNumero() == mano[i + 1].getNumero()) {
                parejaSimple++;
            }
        }
        pareja = parejaSimple == 1;
        return pareja;
    }

    public static boolean esDoblePareja(Carta[] mano) {
        boolean doblePareja;
        ordenarNum(mano);
        int parejas = 0;
        for (int i = 0; i < CANT_CARTASJUG - 1; i++) {
            if (mano[i].getNumero() == mano[i + 1].getNumero()) {
                parejas++;
            }
        }
        doblePareja = parejas == 2;
        return doblePareja;
    }

    public static Boolean esCartaAlta(Carta[] mano) {
        ordenarNum(mano);
        return true;
    }

    public static Carta[] ordenarNum(Carta[] mano) {
        ordenarNum(mano, 0, CANT_CARTASJUG - 1);
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
        int i = inicio - 1;

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
