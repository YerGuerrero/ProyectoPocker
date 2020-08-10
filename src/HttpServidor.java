import Juego.Baraja;
import Juego.Carta;

import java.util.ArrayList;

public class HttpServidor {
    private String puerto;

    public static void main(String[] args) {
        ArrayList<Carta> temp =new Baraja().getBaraja();
        for (int i=0; i<52;i++){
            System.out.println("carta: "+temp.get(i).getNumero()+temp.get(i).getPalo());
        }
        System.out.println("Holii");
    }
}
