package scrabble.EstructurasDeDatos;
/**
 * Clase que se utiliza para crear listas genericas para almacenar distintos tipos de elementos en el programa.
 * @author fabricio
 * @param <E> Contiene el tipo de lista que se desea crear para almacenar datos del mismo tipo.
 */
public class Lista<E> {

    public  Nodo<E> cabeza;
    public Nodo<E> cola;
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
     * Metodo que se utiliza para introducir un nuevo dato al inicio de una lista
     * @param pData Dato que sera introducido en una lista
     * @author abrahamon
     */
    public void insertar(E pData){
        Nodo<E> nuevo = new Nodo<>(pData);        
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
     * Metodo por el cual se introducira al final de una lista, un dato determinado
     * @param x Contiene el valor del dato que se desea insertar al final de una lista
     * @author abrahamon
     */
    public void insertarFinal(E pData) {
        Nodo<E> nuevo = new Nodo<>(pData);
        if( talla == 0){
            cabeza = nuevo;
        }
        else{
            cola.siguiente = nuevo;
        }
        nuevo.previo = cola;
        nuevo.siguiente = null;
        cola = nuevo;
        talla++;
    }
    
    /**
     * Metodo por el cual se introducira un nuevo dato en el interior de una lista
     * @param pData Dato que se desea insertar en una lista
     * @param pNodoPrevio Nodo que se encontrara a la izquierda del nuevo dato, para colocar el nuevo dato despues de este nodo.
     */
    public void insertarEnMedio( E pData, Nodo<E> pNodoPrevio){
        if (pNodoPrevio == cabeza){
            this.insertar(pData);
            return;
        }
        Nodo<E> nuevoNodo = new Nodo<>(pData);
        Nodo<E> nodoTmp = pNodoPrevio.getSiguiente();
        
        pNodoPrevio.siguiente = nuevoNodo;
        nuevoNodo.previo = pNodoPrevio;
        nuevoNodo.siguiente = nodoTmp;
        nodoTmp.previo = nuevoNodo;
        
        this.talla++;
    }
    
    
    
    /**
     * Metodo que se utiliza para eliminar un dato "x" de una lista,
     * Si el dato a eliminar se encuentra en la lista este sera eliminado y se retornara true,
     * De lo contrario se retornara false al no encontrar el dato en la lista.
     * @param x Dato que sera buscado en la lista y de ser encontrado se procede a eliminar dicho dato.
     * @return res Si el dato es eliminado satisfactoriamente returna true, si no se encuentra retorna false.
     * @author abrahamon
     */  
    public boolean eliminar(E x){
        if(cabeza == null)
            return false;
        if (talla == 1){ //no se puede eliminar una lista con un nodo
            cabeza = null;
            cola= null;
            talla = 0;
        }
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
        this.eliminar(datoEscogido.getDato());
        return nodoTmp;
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
    
    public void intercambiarNodos(Nodo<E> pNodoA, Nodo<E> pNodoB){
        Nodo<E> tmpReferenciaNodeA = pNodoA.previo;
        Nodo<E> tmpReferenciaNodeB = pNodoB.previo;
        Nodo<E> tmpNodeA = pNodoA;
        Nodo<E> tmpNodeB = pNodoB;
        if (pNodoA == pNodoB)
            return;
        
        else if(pNodoA.getSiguiente() == pNodoB || pNodoB.getSiguiente() == pNodoA || cabeza == pNodoA || cabeza==pNodoB){ //son contiguos
            E tmp = pNodoB.getDato();
            pNodoB.dato = pNodoA.getDato();
            pNodoA.dato = tmp;
        }        
        else{
        this.eliminar(pNodoA.getDato());
        this.insertarEnMedio(tmpNodeA.getDato(), tmpReferenciaNodeB);
        this.eliminar(pNodoB.dato);
        this.insertarEnMedio(tmpNodeB.getDato(), tmpReferenciaNodeA);
        }
    }
    
    
    public void intercambiarData(Nodo<E> pElementoA, Nodo<E> pElementoB){//metodo intocable ejemplo de lo que no se deberia hacer no se usa
        Nodo <E> tmpNodo = new Nodo(pElementoA.getDato());
        pElementoA.setData(pElementoB.getDato());
        pElementoB.setData(tmpNodo.getDato());
    }
        

    /**
     * Metodo por el cual se realiza una mezcla de todos los nodos que se encuentran en una lista
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
            this.intercambiarNodos(cambiandoNodoA, cambiandoNodoB);
            cambiandoNodoA = cambiandoNodoA.getSiguiente();
        }
    }
    
    /**
     * Metodo por medio del cual se puede conocer el valor del dato que se encuentra al final de una lista
     * @return cola Valor que posee el nodo que se encuentra al final de una lista
     * @author abrahamon
     */
    public Nodo<E> getTail(){
        return cola;
    }
    
    /**
     * Metodo para recibir la cantidad total de elementos que se encuentren en una lista
     * @return talla Cantidad elementos que se encuentren en una lista
     * @author abrahamon
     */
    public int getTalla(){
        return this.talla;
    } 

}
      
    
