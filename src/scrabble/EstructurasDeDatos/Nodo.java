package scrabble.EstructurasDeDatos;

class Nodo<E>{
    E dato;
    Nodo<E> siguiente;

    Nodo(E dato){
        this(dato,null);
    }
    Nodo(E dato, Nodo<E> siguiente){
        this.dato=dato;
        this.siguiente=siguiente;
    }
    
    public E getDato() {
        return dato;
    }
}

