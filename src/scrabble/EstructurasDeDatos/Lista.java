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
        nuevo.previo= null;
        cabeza = nuevo; 
        this.talla++;
    }
    
    /*public void insertarFinal(E x) {
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
    }*/
    
      
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
    
    public Nodo<E> sacarElemento(Nodo<E> objetoParaBorrar){
        
        Nodo<E> nodoTmp = cabeza;
        int contadorPos = 0;
        
        while (contadorPos <= talla){
            
            if(nodoTmp == objetoParaBorrar){
                nodoTmp.previo.siguiente = nodoTmp.siguiente;
                nodoTmp.siguiente.previo = nodoTmp.previo;
                return nodoTmp;
            }
            
            nodoTmp=nodoTmp.getSiguiente();
            contadorPos++;
        }
        return null;
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
        System.out.println(resp);
        return resp;
    }
    
    public Nodo darElementoAzar(){
    
        int posicionAzar = (int )(Math.random() * talla);
        Nodo datoEscogido = cabeza;
        while ( posicionAzar > 0) {
            datoEscogido = datoEscogido.siguiente;
            posicionAzar--;
        }
        return datoEscogido;
    }
        
    public void mezclarTodosLosNodos(){
        Nodo<E> cambiandoNodoA = cabeza;
        Nodo<E> cambiandoNodoB = cabeza;
        Nodo<E> tmpNodo;
        
        for (int i = 0; i <= talla; i=i=2) {
            int posicionAzar = (int )(Math.random() * talla);
            
            while(posicionAzar >= 1){
                cambiandoNodoB = cambiandoNodoB.siguiente;
                posicionAzar--;
            }
            tmpNodo = cambiandoNodoA;
            cambiandoNodoA = cambiandoNodoB;
            cambiandoNodoB = tmpNodo;
            
            cambiandoNodoA= cambiandoNodoA.siguiente;
        }
        
        
    }
    public int getTalla(){
        return this.talla;
    }
}
      
    
