package ModoJuego;

import Juego.Baraja;
import Juego.Jugador;
import Juego.Mano;
import Juego.ModoJuego;

public class Pocker extends ModoJuego {
    @Override
    public void jugar( Jugador jugador1, Jugador jugador2, Baraja baraja ) {
        super.jugar(jugador1, jugador2, baraja);
    }

    public void mejorCombinacion( Mano mano1, Mano mano2 ){
        // retorna la mejor mano
    }
}
