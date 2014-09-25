package scrabble.LOGIC;

import scrabble.DATAIO.LeerTexto;
import scrabble.EstructurasDeDatos.Lista;
import scrabble.EstructurasDeDatos.Nodo;

public class Tablero {
    LeerTexto leer = new LeerTexto();
    
    public Tablero(){
        Lista <CampoTablero> tablero = new Lista <>();
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
        System.out.println(tablero.getHead().getDato().getPosicion());
    }
    
        
}
