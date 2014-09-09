
package scrabble.LOGIC;

import static java.lang.Math.E;
import java.util.Iterator;
import scrabble.EstructurasDeDatos.Lista;

/**
 *
 * @author tvlenin
 */
public abstract class Subject {
    Observer observador;
    //public Subject(){
        Lista <Observer> _observadores = new Lista <> ();
       
    //}
    
    /**
     *
     * @param observador
     */
    public void addObserver(Observer observador){
        _observadores.insertar(observador);
    }
    
    public void deleteObserver(Observer observador){
        _observadores.insertar(observador);
    }
    
    public void notifyObserver() {
        {
            
        }
        
    }
    
    //private Lista <Observer> _observadores;
    
}
