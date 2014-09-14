package scrabble.LOGIC;

import Patrones.Observador;
import scrabble.DATAIO.LeerTexto;
import scrabble.EstructurasDeDatos.Lista;
import scrabble.EstructurasDeDatos.Nodo;
/**
 *
 * @author Abrahamon
 */
public class Bolsa extends LeerTexto implements Observador {
    
    LeerTexto fichas = new LeerTexto();
    
    
    public Bolsa(){
        Lista <String> listaLecturaDeFichasTxt = fichas.leer("FICHAS.TXT");
        
        Nodo <String> tmpDataLista = listaLecturaDeFichasTxt.getHead();
        //System.out.println(tmpDataLista.getDato());
        Lista <Ficha> listaFichas = new Lista <>();
        
        
        
        while(tmpDataLista != null){
            String [] letra = tmpDataLista.getDato().split("_");
            Ficha ficha = new Ficha(Integer.parseInt(letra[0]),letra[1]);
            
            
            listaFichas.insertar(ficha);
            System.out.println(ficha.getData());
            tmpDataLista = tmpDataLista.getSiguiente();
                    
        }
        
         
    }
    
    
    @Override
    public void actualizar() {
        System.out.println("Te observo");
    }
    
}
