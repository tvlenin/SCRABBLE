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
    
    public void insertarFinal(E x) {
        Nodo<E> nuevo = new Nodo<>(x);
        this.talla++;
        Nodo<E> tmpNodo = cabeza;
        if (tmpNodo == null){
            cabeza = nuevo;
            cola = nuevo;
            nuevo.siguiente = nuevo;
        }
        else {
            nuevo.siguiente = null;
            cola.siguiente = nuevo;
            cola = nuevo;
        }
    }
    
      
    public boolean eliminar(E x) 
    {
        Nodo<E> tmp = cabeza, anterior = null;
        boolean res = false;
        while ( tmp != null && !tmp.dato.equals( x )) 
        {
            anterior = tmp;
            tmp=tmp.siguiente;
        }
        if (tmp!=null) 
        {
            res= true;
            this.talla--;
            if(anterior==null) 
            {
                this.cabeza = tmp.siguiente;
            }
            else
            {
                anterior.siguiente=tmp.siguiente;
            }                 
        }
        return res;
    }
    
    public Nodo<E> getHead()
    {
        return cabeza;
    }
    
    public Nodo<E> sacarElemento(Nodo<E> objetoParaBorrar)
    {
        
        Nodo<E> nodoTmp = cabeza;
        int contadorPos = 0;
        
        while (contadorPos <= talla)
        {
            
            if(nodoTmp == objetoParaBorrar)
            {
                nodoTmp.previo.siguiente = nodoTmp.siguiente;
                nodoTmp.siguiente.previo = nodoTmp.previo;
                return nodoTmp;
            }
            
            nodoTmp=nodoTmp.getSiguiente();
            contadorPos++;
        }
        return null;
    }
    
    public Nodo<E> getDato()
    {
        Nodo<E> nodoResp = null;
        if (contador == 1)
        {
            nodoResp = cabeza;
        }else
            nodoResp = nodoResp.siguiente;
        return nodoResp;
    }
    
    public boolean buscar(E x)
    {
        boolean resp = false;
        for (Nodo<E> tmp = cabeza; tmp != null; tmp = tmp.getSiguiente()) 
        {
            if (x.equals(tmp.getDato())) 
            {
            resp = true;
            
            }
        }    
        System.out.println(resp);
        return resp;
    }
    
    public Nodo<E> darElementoAzar(){
    
        int posicionAzar = (int )(Math.random() * talla);
        
        Nodo datoEscogido = cabeza;
        for (int cont = 0; cont < posicionAzar; cont++) {
            datoEscogido = datoEscogido.siguiente;
        }
        return datoEscogido;
    }  
    //metodo para obtener elemento al azar y eliminarlo 
    public Nodo<E> sacarElementoAzar(){
    
        int posicionAzar = (int )(Math.random() * talla);
        
        Nodo datoEscogido = cabeza;
        
        for (int cont = 0; cont < posicionAzar; cont++) {
            datoEscogido = datoEscogido.siguiente;
        }
        Nodo <E> tmp2 = datoEscogido;
        
       
        return tmp2;
    } 
    
         
    public void intercambiarData(Nodo<E> pElementoA, Nodo<E> pElementoB) 
    {
        Nodo <E> tmpNodo=new Nodo(pElementoA.getDato());
        pElementoA.setData(pElementoB.getDato());
        pElementoB.setData(tmpNodo.getDato());
    }
        
    /**
     *
     */
    public void mezclarTodosLosNodos(){
        Nodo<E> cambiandoNodoA = cabeza;
        Nodo<E> cambiandoNodoB;
        
        for (int i = 0; i < talla; i++) 
        {
            int posicionAzar = (int )(1+(Math.random() * (talla-1))); //numeros [1 , talla-1]
            cambiandoNodoB = cabeza;
            
            while(posicionAzar >= 1)
            {
                cambiandoNodoB = cambiandoNodoB.getSiguiente();
                posicionAzar--;
            }
            this.intercambiarData(cambiandoNodoA, cambiandoNodoB);
            
            cambiandoNodoA = cambiandoNodoA.getSiguiente();
        }
    }
    
    public int getTalla()
    {
        return this.talla;
    }
    
    

}
      
    
