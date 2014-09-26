package scrabble.EstructurasDeDatos;

/**
 * Clase para introdir un  nuevo nodo de tipo generico a un lista del mismo tipo
 * @param <E> Tipo de dato que se debera crear el nodo
 * @author abrahamon
 */
public class Nodo<E>{
    E dato;
    Nodo<E> siguiente;
    Nodo<E> previo;
    
    /**
     * Metodo constructor para introducir un nodo en una lista vacia
     * @param dato Dato que se desea introducir en la lista
     * @author tvlenin
     */
    public Nodo(E dato){
        this(dato,null,null);
    }
    
    /**
     * Metodo constructor para introducir un nuevo nodo que tenga referencia a dos nodos, 
     * Y se coloque entre los mismos.
     * @param pDato Dato que se desea introducir en l lista
     * @param pSiguiente Dato que se encontrara despues del nodo a introducir
     * @param pPrevio Dato que se encontrara antes del nodo a introducir
     * @author tvlenin
     */
    public Nodo(E pDato, Nodo<E> pSiguiente, Nodo<E> pPrevio){
        this.dato = pDato;
        this.siguiente = pSiguiente;
        this.previo = pPrevio;
    }
    
    /**
     * Metodo para darle un nuevo valor a un nodo existente de una lista
     * @param pData Valor que se quiere intercambiar
     * @author tvlenin
     */
    public void setData(E pData){
        this.dato = pData;
    }
    
    /**
     * Metodo para recibir el valor de un nodo especifico de una lista
     * @return dato Nodo de la lista, el cual se desea conocer
     * @author tvlenin
     */
    public E getDato(){
        return dato;
    }
    
    /**
     * Metodo para conocer el nodo siguiente en una lista
     * @return siguiente Nodo que se encuentra a la derecha del nodo en el que se esta trabajando
     * @author tvlenin
     */
    public Nodo<E> getSiguiente(){
        return siguiente;
    }
    
    /**
     * Metodo para conocer el nodo anterior en una lista
     * @return previo Nodo que se encuentra a la izquierda del nodo sobre el que se esta trabajando
     * @author tvlenin
     */
    public Nodo<E> getPrevio(){
        return previo;
    }
}

