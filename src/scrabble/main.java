package scrabble;

import GUI.PantallaPrincipal;
import scrabble.DATAIO.LeerTexto;
import scrabble.EstructurasDeDatos.Lista;
import scrabble.LOGIC.Bolsa;
import scrabble.LOGIC.Jugador;
import scrabble.LOGIC.Tablero;

public class main  {

/**
 * Metodo constructor de la clase que se utiliza para inicializar las llamadas a otros metodos,
 * Los cuales son necesarios para el correcto funcionamiento del programa.
 * @author abrahamon
 * @param args 
 */
public static void main(String[] args) {
    Scrabble scrabble = new Scrabble();
    PantallaPrincipal pantalla = new PantallaPrincipal();
    pantalla.setVisible(true);
    }
}