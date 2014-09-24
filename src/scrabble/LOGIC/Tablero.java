package scrabble.LOGIC;

import scrabble.EstructurasDeDatos.Lista;

public class Tablero {

    
    public Tablero(){
        Lista <CampoTablero> tablero = new Lista();
        
        for (int i = 0; i < 225; i++ ){
            CampoTablero campo = new CampoTablero(984100512);
        }
    }
    
        
}
