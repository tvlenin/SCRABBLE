package scrabble;
import scrabble.DATAIO.*;
import scrabble.LOGIC.Jugador;
import scrabble.LOGIC.Bolsa;
import scrabble.LOGIC.TurnoSalida;

public class Scrabble {
    
    public Scrabble(){
        
        
        LeerTexto leer = new LeerTexto();
        leer.leer("CROSSWD.TXT");
        
        //hacer un jugador por cada boton presionado (lectura del arduino)
        // rifa para ver quien comienza
        
        Jugador jug = new Jugador();
        
        TurnoSalida turnoSalida = new TurnoSalida();
        
    }

}
