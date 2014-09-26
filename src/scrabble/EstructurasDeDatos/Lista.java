package scrabble.EstructurasDeDatos;

/**
 * Clase que se utiliza para crear listas genericas para almacenar distintos tipos de elementos en el programa.
 * @author fabricio
 * @param <E> Contiene el tipo de lista que se desea crear para almacenar datos del mismo tipo.
 */
public class Lista<E> {

    protected Nodo<E> cabeza;
    protected Nodo<E> cola;
    protected int talla;
    
    /**
     * Metodo constructor de la clase Lista, que se utiliza para inicializar la lista de elementos.
     * @author abrahamon
     */
    public Lista(){
        cabeza = null;
        cola = null;
        talla = 0;
    }
    
    /**
     * Metodo para introducir un elemento "x" al inicio de una lista.
     * @param x Elemento que se desea introducir en una lista.
     * @author abrahamon
     */
    public void insertar(E x){
        Nodo<E> nuevo = new Nodo<>(x);        
        if (talla == 0 ){
            cola = nuevo;
        }
        else{
            cabeza.previo = nuevo;
        }
        
        nuevo.siguiente = cabeza;
        nuevo.previo = null;
        cabeza = nuevo;
        this.talla++;
    }
    
    /**
     * Metodo que se utiliza para introducir un elemento "x" al final de una lista.
     * @param x Elemento que se desea introducir en una lista
     * @author abrahamon
     */
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
    
    /**
     * Metodo que se utiliza para eliminar un dato "x" de una lista, 
     * Si el dato a eliminar se encuantra en la lista este sera eliminado y se retornara true, 
     * De lo contrario se retornara false al no encontrar el dato en la lista.
     * @param x Dato que sera buscado en la lista y de ser encontrado se procede a eliminar dicho dato.
     * @return res Si el dato es eliminado satisfactoriamente returna true, si no se encuentra retorna false.
     * @author abrahamon
     */  
    public boolean eliminar(E x){              //tested
        Nodo<E> tmp = cabeza, anterior = null;
        boolean res = false;
        while ( tmp != null && !tmp.dato.equals( x ) ){
            anterior = tmp;
            tmp=tmp.siguiente;
        }
        if ( tmp != null ){
            res = true;
            this.talla--;
            if( anterior == null ){
                this.cabeza = tmp.siguiente;
            }
            else{
                anterior.siguiente=tmp.siguiente;
            }                 
        }
        return res;
    }
    
    /**
     * Metodo que se utiliza para conocer el valor de un elemento de la lista en cierta posicion.
     * @return nodoResp Retornael valor del dato que se encuentra en la posicion dada.
     * @author abrahamon
     */
    public Nodo<E> getDato(){
        Nodo<E> nodoResp = null;
        nodoResp = nodoResp.siguiente;
        return nodoResp;
    }
    
    /**
     * Metodo en el que se verifica si un elemento se encuentra en una lista.
     * @param x Elemento que se desea buscar en la lista.
     * @return resp Retorna un valor booleano dependiendo de si encuntra el dato en la lista o no.
     * @author abrahamon
     */
    public boolean buscar(E x){
        boolean resp = false;
        for ( Nodo<E> tmp = cabeza; tmp != null; tmp = tmp.siguiente ) {
            if ( x.equals(tmp.dato) ) {
            resp = true;
            
            }
        }    
        return resp;
    }
    
    /**
     * Metodo en el cual se accede al valor de un dato en una posicion aleatoria, 
     * Y ademas elimina el dato de la lista que lo contiene.
     * @return datoEscogido Retorna el valor del dato que fue accedido de manera aleatoria en la lista.
     * @author tvlenin
     */
    public Nodo<E> getAndQuitarElementoAzar(){
        Nodo<E> nodoTmp;
        int posicionAzar = (int )(Math.random() * talla);
        
        Nodo<E> datoEscogido = cabeza;
        for ( int cont = 0; cont < posicionAzar; cont++ ) {
            datoEscogido = datoEscogido.siguiente;
        }
        nodoTmp=datoEscogido;
        //this.eliminar();
        return datoEscogido;
    }
    

    /**
     * Metodo que analiza una lista y muestra el valor del elemento que se encuentre en la primera posicion.
     * @return cabeza Retorna el valor del primer elemento de una lista
     * @author abrahamon
     */
    public Nodo<E> getHead(){
        return cabeza;
    }
        
    /**
     * Metodo para obtener un elemento de una lista al azar y mostrarlo
     * @return tmp2 Valor del elemento que se toma de la lista
     * @author abrahamon
     */
    public Nodo<E> mostrarElementoAzar(){ //muestra solamente 
    
        int posicionAzar = (int )(Math.random() * talla);
        
        Nodo datoEscogido = cabeza;
        
        for (int cont = 0; cont < posicionAzar; cont++) {
            datoEscogido = datoEscogido.siguiente;
        }
        Nodo <E> tmp2 = datoEscogido;
        return tmp2;
    } 
    
    /**
     * Metodo para intercambiar los datos de dos nodos dados que se encuntren en una lista.
     * @param pElementoA Primer elemento que se desea cambiar de posicion
     * @param pElementoB Segundo elemento que se desea cambiar de posicion
     * @author abrahamon
     */     
    public void intercambiarData(Nodo<E> pElementoA, Nodo<E> pElementoB){
        Nodo <E> tmpNodo = new Nodo(pElementoA.getDato());
        pElementoA.setData(pElementoB.getDato());
        pElementoB.setData(tmpNodo.getDato());
    }
        
    /**
     * Metodo para realizar una mezcla de todos los elementos que se encuentren en una lista
     * @author abrahamon
     */
    public void mezclarTodosLosNodos(){
        Nodo<E> cambiandoNodoA = cabeza;
        Nodo<E> cambiandoNodoB;
        
        for (int i = 0; i < talla; i++){
            int posicionAzar = (int )(1+(Math.random() * (talla-1))); //numeros [1 , talla-1]
            cambiandoNodoB = cabeza;
            while( posicionAzar >= 1 ){
                cambiandoNodoB = cambiandoNodoB.getSiguiente();
                posicionAzar--;
            }
            this.intercambiarData(cambiandoNodoA, cambiandoNodoB);
            cambiandoNodoA = cambiandoNodoA.getSiguiente();
        }
    }
    
    /**
     * Metodo para recibir la cantida total de elementos que se encuentren en una lista
     * @return talla Cantidad elementos que se encuentren en una lista.
     * @author abrahamon
     */
    public int getTalla(){
        return this.talla;
    } 

}
      
    
