package scrabble;
import scrabble.DATAIO.*;
import scrabble.LOGIC.Jugador;
import scrabble.LOGIC.Bolsa;
import scrabble.LOGIC.TurnoSalida;
import scrabble.LOGIC.Tablero;

public class Scrabble {
    
    public Scrabble(){
        
        
        LeerTexto leer = new LeerTexto();
        
        //hacer un jugador por cada boton presionado (lectura del arduino)
        // rifa para ver quien comienza
       
        Jugador jug = new Jugador();
        Tablero tablero = new Tablero();
        
        //TurnoSalida turnoSalida = new TurnoSalida();
        
    }

}
