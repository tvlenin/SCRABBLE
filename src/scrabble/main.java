package scrabble;

import scrabble.DATAIO.LeerTexto;
import scrabble.LOGIC.Jugador;

public class main  {
    
public static void main(String[] args) {
        
    
      
    LeerTexto leer = new LeerTexto();
    Jugador jug = new Jugador();
    
    //leer.agregarObservador(bolso);
    leer.leer("CROSSWD.TXT");
    }
}


