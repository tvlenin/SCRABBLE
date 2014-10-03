package scrabble.LOGIC;

import scrabble.DATAIO.LeerTexto;
import scrabble.EstructurasDeDatos.Lista;
import scrabble.EstructurasDeDatos.Nodo;

public class Tablero {
    LeerTexto leer = new LeerTexto();
    Lista <Lista <CampoTablero> > tablero;
    
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
