package Patrones;

import scrabble.EstructurasDeDatos.Lista;

/**
 * Clase que controla las tareas de un objeto observable
 * @author tvlenin
 */
public abstract class Observable {
 
    //El constructor crea el vector con la asociacion Observable-Observador
    //public Observable() {
        Lista <Observador> _observadores = new Lista<>();
    //}
 
    /**
     * Metodo que se utiliza para agregar un objeto observador a la lista de observadores.
     * @author tvlenin
     * @param o Objeto que se agrega a una lista para representar un observador de una clase
     */
    //Agregar y eliminar sencillamente operan sobre vector _observadores...
    public void agregarObservador(Observador o) {
        _observadores.insertar(o);
    }
 
    /**
     * Metodo que se utiliza para eliminar un objeto observador de la lista de observadores.
     * @author tvlenin
     * @param o Objeto que se debe eliminar de una lista en la que mantienen todos los objetos de este tipo.
     */
    public void eliminarObservador(Observador o) {
        _observadores.eliminar(o);
    }
 
    /**
     * Metodo que se utiliza para notificar a los metodos,
     * Que deben ser informados sobre cambios que sucedan en el programa y que los afecten.
     * @author tvlenin
     */
    //Notificacion: Para cada observador se invoca el método actualizar().
    public void notificarObservadores() {
        
        
    }
 
    //Este atributo privado mantiene el vector con los observadores
    //private Lista<Observador> _observadores;

}
