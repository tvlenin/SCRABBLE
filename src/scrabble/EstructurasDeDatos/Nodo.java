package scrabble.EstructurasDeDatos;

public class Nodo<E>{
    E dato;
    Nodo<E> siguiente;
    Nodo<E> previo;
    
    
    public Nodo(E dato){
        this(dato,null,null);
    }
    
    public Nodo(E pDato, Nodo<E> pSiguiente, Nodo<E> pPrevio){
        this.dato=pDato;
        this.siguiente=pSiguiente;
        this.previo= pPrevio;
    }
    
    public void setData(E pData){
        this.dato = pData;
    }
    public E getDato(){
        return dato;
    }
    
    public Nodo<E> getSiguiente(){
        return siguiente;
    }
    public Nodo<E> getPrevio(){
        return previo;
    }
}

