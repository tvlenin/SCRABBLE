package scrabble;

import scrabble.DATAIO.LeerTexto;
import scrabble.LOGIC.Bolsa;

public class main  {
    
public static void main(String[] args) {
        
    //Bolsa bolsa=new Bolsa();
    LeerTexto leer = new LeerTexto();
    Bolsa bolso = new Bolsa();
    
    leer.agregarObservador(bolso);
    leer.leer("CROSSWD.TXT");
    }
}


