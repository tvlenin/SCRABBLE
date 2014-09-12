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
        Lista <String >listaLecturaDeFichasTxt = fichas.leer("FICHAS.TXT");
        Nodo tmpDataLista = listaLecturaDeFichasTxt.getHead();
        
        Lista <Ficha> listaFichas= new Lista <>();
        System.out.println(tmpDataLista.getDato().toString().charAt(0));
        
        while(tmpDataLista != null){
            
            Ficha ficha = new Ficha();
            
            listaFichas.insertarFinal(ficha);
            
            tmpDataLista=tmpDataLista.getSiguiente();
        
        }
        System.out.println("sirvio");
    }
    @Override
    public void actualizar() {
        System.out.println("Te observo");
    }
    
}
