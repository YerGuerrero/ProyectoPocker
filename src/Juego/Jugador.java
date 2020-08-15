package Juego;

public class Jugador {
    private Mano mano= new Mano();
    private int id;
    private boolean ganar=false;

    public void apuestaJugador(){//Preguntar

    }

    public void pideCarta(Carta carta){
        mano.getMano().add(carta);
    }

    public void botaCarta(){

    }

    public void setMano( Mano mano ) {
        this.mano = mano;
    }

    public Mano getMano() {
        return mano;
    }

    public int getId() {
        return id;
    }

    public boolean isGanar() {
        return ganar;
    }

    public void setGanar( boolean ganar ) {
        this.ganar = ganar;
    }
}
