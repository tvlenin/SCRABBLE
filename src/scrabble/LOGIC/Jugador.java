package scrabble.LOGIC;

import scrabble.EstructurasDeDatos.Lista;
import scrabble.EstructurasDeDatos.Nodo;

/**
 *
 * @author Abrahamon
 */
public class Jugador extends Bolsa {
    public Jugador(){
        Lista<Ficha> _fichas = new Lista<> ();
        
        for (int i = 0; i < 7; i++){
            Nodo<Ficha> fichasJugador = super.listaFichas.darElementoAzar();
            _fichas.insertarFinal(fichasJugador.getDato());
            System.out.println(fichasJugador.getDato().getData());
        }
        System.out.println(super.listaFichas.toString());
        
    }
    
    //Es una lista donde se encontraran los valores correspondientes a cada ficha
    public Lista<Ficha> fichasJugador(){        
        return null;
    }
    
    public void numeroJugador(){
    }
    
    public void puntajeJugador(){
    }
    
}
