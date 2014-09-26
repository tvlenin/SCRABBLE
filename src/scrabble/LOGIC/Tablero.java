package scrabble.LOGIC;

import scrabble.EstructurasDeDatos.Lista;

/**
 * Clase en la que se tendra una lista para almancenar los espacios del tablero de juego
 * @author abrahamon
 */
public class Tablero {

    /**
     * Metodo en el que se inicializa una lista,
     * En la que se tendran los espacios necesarios para almacenar los campos que posee el tablero de juego
     * @return espacio Retorna la lista de los espacios del tablero de juego.
     */
    public Lista<Ficha> fichaTablero(){
        Lista<Ficha> espacio = new Lista<>();
        return espacio;
    }
    
        
}
