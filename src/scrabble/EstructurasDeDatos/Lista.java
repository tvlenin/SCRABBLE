package scrabble.EstructurasDeDatos;

public class Lista<E> {

    protected Nodo<E> cabeza;
    protected Nodo<E> cola;
    protected int talla;
    
    public Lista(){
        cabeza = null;
        cola = null;
        talla = 0;
    }
    
    public void insertarAuto(E pData){ //si la lista esta vacia realiza un insertar, sino inserta al final
        if (talla == 0){
            this.insertar(pData);
        }
        else{
            this.insertarFinal(pData);
        }
    }
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
    
    public void insertarEnMedio( E pData, Nodo<E> pNodoPrevio){
        if (pNodoPrevio == cabeza){
            System.out.println("En vez de 'insertarEnMedio' utilice (insertar || insertarAuto) ");
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
    
    public void insertarFinal(E x) {
        
        
        Nodo<E> nuevo = new Nodo<>(x);
        if( talla == 0){
            cabeza = nuevo;
        }
        else{
            cola.siguiente = nuevo;
        }
        nuevo.previo = cola;
        nuevo.siguiente = null;
        cola = nuevo;
        talla ++;
        
        
        
        
        
        
        
        /*Nodo<E> nuevo = new Nodo<>(x);
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
        this.talla++;*/
    }
    
      
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
    
    public Nodo<E> getDato(){
        Nodo<E> nodoResp = null;
        nodoResp = nodoResp.siguiente;
        return nodoResp;
    }
    
    public boolean buscar(E x){
        boolean resp = false;
        for ( Nodo<E> tmp = cabeza; tmp != null; tmp = tmp.siguiente ) {
            if ( x.equals(tmp.dato) ) {
            resp = true;
            
            }
        }    
        return resp;
    }
    
    public Nodo<E> getAndQuitarElementoAzar(){
        Nodo<E> nodoTmp;
        int posicionAzar = (int )(Math.random() * talla);
        
        Nodo<E> datoEscogido = cabeza;
        for ( int cont = 0; cont < posicionAzar; cont++ ) {
            datoEscogido = datoEscogido.siguiente;
        }
        nodoTmp=datoEscogido;
        this.eliminar(datoEscogido.getDato());
        
        return datoEscogido;
    }
    
    
    public Nodo<E> getHead(){
        return cabeza;
    }
        
    //metodo para obtener elemento al azar solamente
    public Nodo<E> mostrarElementoAzar(){ //muestra solamente 
    
        int posicionAzar = (int )(Math.random() * talla);
        
        Nodo datoEscogido = cabeza;
        
        for (int cont = 0; cont < posicionAzar; cont++) {
            datoEscogido = datoEscogido.siguiente;
        }
        Nodo <E> tmp2 = datoEscogido;
        return tmp2;
    } 
    
    public void intercambiarNodos(Nodo<E> node1, Nodo<E> node2){
        
        if (node1 == node2){
        return;
        }
        Nodo temp;
        temp = node1.siguiente;
        node1.siguiente = node2.siguiente;
        node2.siguiente = temp;
        if (node1.siguiente != null)
            node1.siguiente.previo = node1;
        if (node2.siguiente != null)
            node2.siguiente.previo = node2;
        temp = node1.previo;
        node1.previo = node2.previo;
        node2.previo = temp;
        if (node1.previo != null)
            node1.previo.siguiente = node1;
        if (node2.previo == null)
            return ;
        node2.previo.siguiente = node2;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*Nodo<E> p = pNodoB.previo;
        Nodo<E> n = pNodoB.siguiente;
        Nodo<E> z = pNodoA.siguiente;
        Nodo<E> x = pNodoA.previo;
        pNodoB.previo = pNodoA.previo;
        pNodoB.siguiente = pNodoA.siguiente;
        pNodoA.previo = p;
        pNodoA.siguiente = n;
        p.siguiente = pNodoB;
        z.previo = pNodoB;
        if (pNodoB.siguiente != null){
            pNodoB.siguiente.previo = pNodoB;
        }
        if (pNodoB.previo != null){
            pNodoB.previo.siguiente = pNodoB;
        }
        if (pNodoA.siguiente != null){
            pNodoA.siguiente.previo = pNodoA;
        }
        if (pNodoA.previo != null){
            pNodoA.previo.siguiente = pNodoA;
        }
    */
    }     
    public void intercambiarDataNOUSAR(Nodo<E> pElementoA, Nodo<E> pElementoB){//metodo intocable ejemplo de lo que no se deberia hacer no se usa
        Nodo <E> tmpNodo = new Nodo(pElementoA.getDato());
        pElementoA.setData(pElementoB.getDato());
        pElementoB.setData(tmpNodo.getDato());
    }
        

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
            this.intercambiarDataNOUSAR(cambiandoNodoA, cambiandoNodoB);
            cambiandoNodoA = cambiandoNodoA.getSiguiente();
        }
    }
    
    public Nodo<E> getTail(){
        return cola;
    }
    public int getTalla(){
        return this.talla;
    } 

}
      
    
