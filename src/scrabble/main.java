package scrabble;

import scrabble.DATAIO.LeerTexto;
import scrabble.EstructurasDeDatos.Lista;
import scrabble.LOGIC.Bolsa;

public class main  {
    
public static void main(String[] args) {
        
    
    Bolsa bolsa=new Bolsa();
    
    
    
    LeerTexto leer = new LeerTexto();
    leer.leer("CROSSWD.TXT");
    }
}


