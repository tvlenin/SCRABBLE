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
     
    public void insertar(E x){
        Nodo<E> nuevo = new Nodo<>(x);        
        if (talla == 0 ){
            cola=nuevo;}
        else{
            cabeza.previo = nuevo;}
        
        nuevo.siguiente = cabeza;
        nuevo.previo= null;
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
    
      
    public boolean eliminar(E x){              //tested
        Nodo<E> tmp = cabeza, anterior = null;
        boolean res = false;
        while ( tmp != null && !tmp.dato.equals( x )){
            anterior = tmp;
            tmp=tmp.siguiente;
        }
        if (tmp!=null){
            res= true;
            this.talla--;
            if(anterior==null){
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
        for (Nodo<E> tmp = cabeza; tmp != null; tmp = tmp.siguiente) {
            if (x.equals(tmp.dato)) {
            resp = true;
            
            }
        }    
        return resp;
    }
    
    public Nodo<E> getAndQuitarElementoAzar(){
        Nodo<E> nodoTmp;
        int posicionAzar = (int )(Math.random() * talla);
        
        Nodo<E> datoEscogido = cabeza;
        for (int cont = 0; cont < posicionAzar; cont++) {
            datoEscogido = datoEscogido.siguiente;
        }
        nodoTmp=datoEscogido;
        //this.eliminar();
        return datoEscogido;
    }
    
    
    public Nodo<E> getHead(){
        return cabeza;
    }
        
    //metodo para obtener elemento al azar y eliminarlo 
    public Nodo<E> mostrarElementoAzar(){ //muestra solamente 
    
        int posicionAzar = (int )(Math.random() * talla);
        
        Nodo datoEscogido = cabeza;
        
        for (int cont = 0; cont < posicionAzar; cont++) {
            datoEscogido = datoEscogido.siguiente;
        }
        Nodo <E> tmp2 = datoEscogido;
        return tmp2;
    } 
    
         
    public void intercambiarData(Nodo<E> pElementoA, Nodo<E> pElementoB){
        Nodo <E> tmpNodo=new Nodo(pElementoA.getDato());
        pElementoA.setData(pElementoB.getDato());
        pElementoB.setData(tmpNodo.getDato());
    }
        

    public void mezclarTodosLosNodos(){
        Nodo<E> cambiandoNodoA = cabeza;
        Nodo<E> cambiandoNodoB;
        
        for (int i = 0; i < talla; i++){
            int posicionAzar = (int )(1+(Math.random() * (talla-1))); //numeros [1 , talla-1]
            cambiandoNodoB = cabeza;
            while(posicionAzar >= 1){
                cambiandoNodoB = cambiandoNodoB.getSiguiente();
                posicionAzar--;
            }
            this.intercambiarData(cambiandoNodoA, cambiandoNodoB);
            cambiandoNodoA = cambiandoNodoA.getSiguiente();
        }
    }
    
    public int getTalla(){
        return this.talla;
    } 

}
      
    
