package scrabble.EstructurasDeDatos;



public class Nodo<E> {
    E dato;
    Nodo<E> siguiente;

    public Nodo(E dato){
        this(dato,null);
    }
    
    public Nodo(E dato, Nodo<E> siguiente){
        this.dato=dato;
        this.siguiente=siguiente;
    }
    
    public void setData(E pData){
        this.dato = pData;
    }
    public E getDato() {
        return dato;
    }
    
    public Nodo<E> getSiguiente(){
        return siguiente;
    }

}

