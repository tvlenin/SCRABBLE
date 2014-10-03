package scrabble.LOGIC;

import scrabble.DATAIO.LeerTexto;
import scrabble.EstructurasDeDatos.Lista;
import scrabble.EstructurasDeDatos.Nodo;

/**
 * Clase en la que se tendra una lista para almancenar los espacios del tablero de juego
 * @author abrahamon
 */
public class Tablero {
    LeerTexto leer = new LeerTexto();
    Lista <Lista <CampoTablero> > tablero;
    
    /**
     * Metodo constructor de la clase Tablero en el que se inicializa una lista para almacenar los espacios del tablero de juego,
     * E informacion relevante de estos espacios
     * @author abrahamon
     */
    public Tablero(){
              
        tablero = new Lista<>();
        Lista<CampoTablero> listatmp = new Lista<>();
        
        Lista <String> listaLecturaDeFichasTxt = leer.leer("CAMPOSTABLERO.TXT");
        Nodo <String> tmpDataLista = listaLecturaDeFichasTxt.getHead();
        
        while(tmpDataLista != null){
            
            if(listatmp.getTalla() >= 15 ){
                tablero.insertarFinal(listatmp);
                listatmp = new Lista<>();
            }
            else{
                String [] tmpLetra = tmpDataLista.getDato().split("_");
                CampoTablero tmpcampo = new CampoTablero(Integer.parseInt(tmpLetra[0]), Integer.parseInt(tmpLetra[1]), tmpLetra[2]);
                listatmp.insertarFinal(tmpcampo);
                
                tmpDataLista = tmpDataLista.getSiguiente();
            }
        }
        /*tablero = new Lista <>();
        Lista <String> listaLecturaDeFichasTxt = leer.leer("CAMPOSTABLERO.TXT");
        
        Nodo <String> tmpDataLista = listaLecturaDeFichasTxt.getHead();
        //System.out.println(tmpDataLista.getDato());
        int contador =0;
        
        while(tmpDataLista != null){
            String [] letra = tmpDataLista.getDato().split("_");
           // System.out.println(letra[0]);
            CampoTablero campo = new CampoTablero(Integer.parseInt(letra[0]),Integer.parseInt(letra[1]),letra[2]);
            
            tablero.insertar(campo);
            tmpDataLista = tmpDataLista.getSiguiente();
            
        }
        //System.out.println(tablero.getHead().getDato().getPosicion());*/
    }
    
    /**
     * Metodo en el que se verifica si la posicion en la que se coloca una ficha es el espacio del centro del tablero
     * @param pos Posicion que se desea evaluar para verificar si es el espacio del centro
     * @return resp Retorna true si la posicion es igual a la posicion del centro, y false si no es correcta
     * @author abrahamon
     */
    public boolean verificaPosEnCentro(int pos){
        boolean resp = false;
        if(pos == 113)
            resp = true;
        return resp;
    }
    
    /**
     * Metodo que se usa para conocer el bonus que posee una posicion determinada del tablero de juego
     * @param pPosicion Posicion el tablero que se desae evaluar para conocer el bonus que posee
     * @return resp Retorna el bonus que posee la casilla
     */
    public int getBonusPosX(int pPosicion){//necesaria para mostrar el bonus en x posicion
        int moverseFilas = pPosicion / 15;
        int moverseColmnas = pPosicion % 15;
        
        Nodo<Lista<CampoTablero>> iteradorFilas = tablero.getHead();
        while(moverseFilas > 0){
            iteradorFilas = iteradorFilas.getSiguiente();
            moverseFilas--;
        }
        Nodo<CampoTablero> iteradorColumnas = iteradorFilas.getDato().getHead();
        while (moverseColmnas > 0){
            iteradorColumnas = iteradorColumnas.getSiguiente();
            moverseColmnas--;
        }
        int resp = iteradorColumnas.getDato().getMultiplicador();
        return resp;
    }
    
    /**
     * Metodo para conocer la descripcion de una posicion determinada del tablero
     * @param pPosicion Casilla del tablero que se desea evaluar
     * @return descripcion Retorna la descripcion referente a disponibilidad de una casilla del tablero
     */
    public String getDescripcionPosX(int pPosicion){//necesaria para mostrar el bonus en x posicion
        String descripcion ="";
        int moverseFilas = pPosicion / 15;
        int moverseColmnas = pPosicion % 15;
        
        Nodo<Lista<CampoTablero>> iteradorFilas = tablero.getHead();
        while(moverseFilas > 0){
            iteradorFilas = iteradorFilas.getSiguiente();
            moverseFilas--;
        }
        Nodo<CampoTablero> iteradorColumnas = iteradorFilas.getDato().getHead();
        while (moverseColmnas > 0){
            iteradorColumnas = iteradorColumnas.getSiguiente();
            moverseColmnas--;
        }
        
        descripcion = iteradorColumnas.getDato().getDescripcion();
        return descripcion;
    }
}
