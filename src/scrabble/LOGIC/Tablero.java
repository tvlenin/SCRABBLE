package scrabble.LOGIC;

import scrabble.EstructurasDeDatos.Lista;
import scrabble.EstructurasDeDatos.Nodo;

public class Tablero {
    private Lista <Lista> matrizTablero;
    
    public Tablero(){
        
        matrizTablero = new Lista<> ();        
            
            for(int j = 0; j < 15; j++){
                Lista <CampoTablero> subLIsta = new Lista<>();
                matrizTablero.insertar(subLIsta);
                //System.out.println(j);
            }
        
    }
    
    public void fichaTablero(){        
    }
    
        
}
