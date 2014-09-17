package scrabble;

import GUI.PantallaPrincipal;
import scrabble.DATAIO.LeerTexto;
import scrabble.EstructurasDeDatos.Lista;
import scrabble.LOGIC.Bolsa;
import scrabble.LOGIC.Ficha;

public class main  {
    
public static void main(String[] args) {
        
    PantallaPrincipal pPantalla = new PantallaPrincipal();
    pPantalla.setVisible(true);
    
    
    
    
    
    LeerTexto leer = new LeerTexto();
    Ficha ficha = new Ficha();
    leer.leer("CROSSWD.TXT");
    //ficha.darFicha();
    
    }
}
