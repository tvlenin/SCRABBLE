package scrabble.EstructurasDeDatos;






public class Lista<E> {

    protected Nodo<E> cabeza;
    protected Nodo<E> cola;
    protected int talla;
    private int contador;
        
    public Lista(){
        cabeza = null;
        cola = null;
        talla = 0;
        contador = 0;
    }
     
    public void insertar(E x) {
        Nodo<E> nuevo = new Nodo<>(x);
        nuevo.siguiente = cabeza;
        cabeza = nuevo; 
        this.talla++;
    }
    
    public void insertarFinal(E x) {
        Nodo<E> nuevo = new Nodo<>(x);
        this.talla++;
        Nodo<E> tmpNodo = cabeza;
        if (tmpNodo == null){
            cabeza = nuevo;
        }
        else {
            
            while ( tmpNodo.siguiente != null ) {
            tmpNodo = tmpNodo.siguiente;
            }
            tmpNodo.siguiente = nuevo;
        }
    }
    
      
    public boolean eliminar(E x) {
        Nodo<E> tmp = cabeza, anterior = null;
        boolean res = false;
        while ( tmp != null && !tmp.dato.equals( x )) {
            anterior = tmp;
            tmp=tmp.siguiente;
        }
        if (tmp!=null) {
            res= true;
            this.talla--;
            if(anterior==null) {
                this.cabeza = tmp.siguiente;
            }
            else{
                anterior.siguiente=tmp.siguiente;
            }                 
        }
        return res;
    }
    
    public Nodo<E> getHead(){
        return cabeza;
    }
    
    public Nodo<E> getDato(){
        Nodo<E> nodoResp = null;
        if (contador == 1){
            nodoResp = cabeza;
        }else
            nodoResp = nodoResp.siguiente;
        return nodoResp;
    }
    
    public void intercambiar(E pElementoA, E pElementoB) {
        
    }
    public boolean buscar(E x){
        boolean resp = false;
        for (Nodo<E> tmp = cabeza; tmp != null; tmp = tmp.siguiente) {
            if (x.equals(tmp.dato)) {
            resp = true;
            
            }
        }    
        return resp;
    }
    
    public Nodo darElementoAzar(){
    
        int posicionAzar = (int )(Math.random() * talla);
        int contadorPos=0;
        Nodo datoEscogido = cabeza;
        if ( posicionAzar == contadorPos ) {
            datoEscogido.getSiguiente();
            contadorPos++;
        }
        return datoEscogido;
    }
        
    public int getTalla(){
        return this.talla;
    }
}
      
    
