package scrabble.LOGIC;

import scrabble.DATAIO.LeerTexto;
import scrabble.EstructurasDeDatos.Lista;
import scrabble.EstructurasDeDatos.Nodo;

public class Tablero {
    LeerTexto leer = new LeerTexto();
    Lista <CampoTablero> tablero;
    
    public Tablero(){
              
        tablero = new Lista <>();
        Lista <String> listaLecturaDeFichasTxt = leer.leer("CAMPOSTABLERO.TXT");
        
        Nodo <String> tmpDataLista = listaLecturaDeFichasTxt.getHead();
        //System.out.println(tmpDataLista.getDato());
        
        while(tmpDataLista != null){
            String [] letra = tmpDataLista.getDato().split("_");
           // System.out.println(letra[0]);
            CampoTablero campo = new CampoTablero(Integer.parseInt(letra[0]),Integer.parseInt(letra[1]),letra[2]);
            tablero.insertar(campo);
            tmpDataLista = tmpDataLista.getSiguiente();
            
        }
        //System.out.println(tablero.getHead().getDato().getPosicion());
    }
       
    public boolean verificaPosEnCentro(int pos){
        boolean resp = false;
        if(pos == 113)
            resp = true;
        return resp;
    }
    
    public int getBonusPosX(int pPosicion){//necesaria para mostrar el bonus en x posicion
        int resp = 0;
        Nodo<CampoTablero> iteradorPosTablero = tablero.getHead();
        while(pPosicion > 0){
            iteradorPosTablero = iteradorPosTablero.getSiguiente();
            pPosicion--;
        }
        resp = iteradorPosTablero.getDato().getMultiplicador();
        return resp;
    }
    
    public String getDescripcionPosX(int pPosicion){//necesaria para mostrar el bonus en x posicion
        String resp ="";
        Nodo<CampoTablero> iteradorPosTablero = tablero.getHead();
        while(pPosicion > 0){
            iteradorPosTablero = iteradorPosTablero.getSiguiente();
            pPosicion--;
        }
        resp = iteradorPosTablero.getDato().getDescripcion();
        return resp;
    }
}
