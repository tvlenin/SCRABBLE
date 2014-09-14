package scrabble;

import scrabble.DATAIO.LeerTexto;
import scrabble.EstructurasDeDatos.Lista;
import scrabble.LOGIC.Bolsa;

public class main  {
    
public static void main(String[] args) {
        
    
      
    LeerTexto leer = new LeerTexto();
    Bolsa bolso = new Bolsa();
    
    //leer.agregarObservador(bolso);
    leer.leer("CROSSWD.TXT");
    }
}


