package scrabble.LOGIC;

import Patrones.Observador;
import scrabble.DATAIO.LeerTexto;
import scrabble.EstructurasDeDatos.Lista;
import scrabble.EstructurasDeDatos.Nodo;
 



public class Bolsa extends LeerTexto implements Observador {
    
    LeerTexto fichas = new LeerTexto();
    
    
    public Bolsa(){
        Lista <String >listaLecturaDeFichasTxt = fichas.leer("FICHAS.TXT");
        Nodo tmpDataLista = listaLecturaDeFichasTxt.getHead();
        
        Lista <Ficha> listaFichas= new Lista <>();
        //System.out.println(tmpDataLista.getDato().toString().charAt(2)+",  "+tmpDataLista.getDato().toString().charAt(0));
        
        
        Ficha ficha;
        
        while(tmpDataLista != null){
            
            ficha = new Ficha();
            
            listaFichas.insertar(ficha);
            
            tmpDataLista=tmpDataLista.getSiguiente();
        
        }

    }
    
    
    @Override
    public void actualizar() {
        System.out.println("Te observo");
    }
    
}
