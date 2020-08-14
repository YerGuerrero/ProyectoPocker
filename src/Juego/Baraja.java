package Juego;

import java.util.ArrayList;
import java.util.Collections;
import Juego.AnalizarMano;

public class Baraja {
    private ArrayList<Carta> baraja;
    private int actual;

    public Baraja() {
        this(true);
    }

    public Baraja( boolean barajado ) {
        actual=0;
        baraja= new ArrayList<Carta>();
        for(int i=0; i<52;i++){
            baraja.add(new Carta(i));
        }
        for(int i=0; i<52;i++){
            System.out.println("Baraja: "+baraja.get(i).getNumero()+baraja.get(i).getPalo());
        }
        if(barajado){
            Collections.shuffle(baraja);
        }
        Jugador jugador1=new Jugador();
        Jugador jugador2=new Jugador();
        repartir(10, jugador1,jugador2);
        System.out.println("Jugador1");
        AnalizarMano.analizaMano(jugador1.getMano());
        System.out.println("Jugador2");
        AnalizarMano.analizaMano(jugador2.getMano());
    }
       /* baraja= new Carta[52];
        int cont=1;// 1->bastos, 2->corazones, 3->treboles, 4->diamantes
        int i=0;
        while (i<52){
            for (int j=1;j<14;j++){

                if (cont%2!=0){
                    baraja[i]= new Carta(cont,0,j);//color 1 negro
                }
                else{
                    baraja[i] =new Carta(cont,1,j);//color 1 rojo
                }
                if(i<52){
                    i++;
                }
            }
            cont++;
        }
        barajar();
        Jugador jugador1=new Jugador();
        Jugador jugador2=new Jugador();
        repartir(4, jugador1,jugador2);
    }

    public void barajar() {
        for (int i=0;i<52;i++){
            Carta temp = null;
            int pos = (int) (Math.random() * 51);
            System.out.println("nùmero random"+pos);
            while (pos==i){
                pos = (int) (Math.random() * 51);
            }
            temp=baraja[i];
            baraja[i]=baraja[pos];
            baraja[pos]=temp;
        }
    }
*/

    public void repartir(int cantidad, Jugador jugador1,Jugador jugador2) {
        ArrayList<Carta> mano1 = new ArrayList<Carta>(cantidad);
        ArrayList<Carta> mano2 = new ArrayList<Carta>(cantidad);
        int cont1 = 0;
        int cont2 = 0;
        for (int i = 0; i < cantidad * 2; i++) {
            if (i % 2 == 0) {
                mano1.add(cont1,baraja.get(i));
                cont1++;
            } else {
                mano2.add(cont2, baraja.get(i));
                cont2++;
            }
        }
        Mano manotemp1 = new Mano();
        manotemp1.setMano(mano1);
        Mano manotemp2 = new Mano();
        manotemp2.setMano(mano2);
        jugador1.setMano(manotemp1);
        jugador2.setMano(manotemp2);

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
    }
    public Carta siguiente() {
        if (!isEmpty()){
            return baraja.get(actual++);
        }
        return null;
    }

    public boolean isEmpty(){
        return actual==53;
    }

    public ArrayList<Carta> getBaraja() {
        return baraja;
    }
}
