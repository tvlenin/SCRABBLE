/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Patrones;

import scrabble.EstructurasDeDatos.Lista;
import scrabble.EstructurasDeDatos.Nodo;
import scrabble.LOGIC.Ficha;

/**
 *
 * @author tvlenin
 */
public abstract class Observable {
 
    //El constructor crea el vector con la asociacion Observable-Observador
    //public Observable() {
    Lista <Observador> _observadores = new Lista<>();
    //}
 
    //Agregar y eliminar sencillamente operan sobre vector _observadores...
    public void agregarObservador(Observador o) {
        _observadores.insertar(o);
    }
 
    public void eliminarObservador(Observador o) {
        _observadores.eliminar(o);
    }
 
    //Notificacion: Para cada observador se invoca el método actualizar().
    public void notificarObservadores() {
        Nodo <Observador> nodoObserver = _observadores.getHead();
        while(nodoObserver != null){
            nodoObserver.getDato().actualizar();
            nodoObserver = nodoObserver.getSiguiente();
                   
            
        }
        
        
    }
 
    //Este atributo privado mantiene el vector con los observadores
    //private Lista<Observador> _observadores;

}
