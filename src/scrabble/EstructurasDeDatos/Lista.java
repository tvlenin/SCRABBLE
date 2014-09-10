package scrabble.EstructurasDeDatos;

import java.util.Iterator;
import scrabble.LOGIC.Observer;

public class Lista<E> {

    protected Nodo<E> primero; 
    protected int talla;
        
    public Lista(){
        primero = null;
        talla = 0;
    }
    

   
    public void insertarInicio(E x) {
        Nodo<E> nuevo = new Nodo<E>(x);
    }
    
    public void insertar(E x) {
        Nodo<E> nuevo = new Nodo<>(x);

        nuevo.siguiente = primero;
        primero = nuevo; 
        this.talla++;
    }
    
    public void insertarFinal(E x) {
        Nodo<E> nuevo = new Nodo<>(x);
        this.talla++;
        Nodo<E> tmp = primero;
        if (tmp == null){
            primero = nuevo;
        }
        else {
            
            while ( tmp.siguiente != null ) {
            tmp = tmp.siguiente;
            }
            tmp.siguiente = nuevo;
        }
    }
    
    @Override
    public String toString() {
        String res = "";
        for(Nodo<E> tmp = primero; tmp != null; tmp = tmp.siguiente) {
            res += tmp.dato.toString()+"\n";
        }
        return res;
    }
    
    
    
    public boolean eliminar(E x) {
        Nodo<E> tmp = primero, anterior = null;
        boolean res = false;
        while ( tmp != null && !tmp.dato.equals( x )) {
            anterior = tmp;
            tmp=tmp.siguiente;
        }
        if (tmp!=null) {
            res= true;
            this.talla--;
            if(anterior==null) {
                primero = tmp.siguiente;
            }
            else{
                anterior.siguiente=tmp.siguiente;
            }                 
        }
        return res;
    }
    
    /* public E buscarEnPosicion(int Ppos){
        if (talla==0)
            return null;
        
    }*/

   

    
    public boolean buscar(E x){
        boolean resp = false;
        for (Nodo<E> tmp = primero; tmp != null; tmp = tmp.siguiente) {
            if (x.equals(tmp.dato)) {
            resp = true;
            }
        }    
        return resp;
    }
    

    
    
}
    

    
    

