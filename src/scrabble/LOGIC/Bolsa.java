package scrabble.LOGIC;

import Patrones.Observador;
import scrabble.DATAIO.LeerTexto;
import scrabble.EstructurasDeDatos.Lista;
import scrabble.EstructurasDeDatos.Nodo;
/**
 *
 * @author Abrahamon
 */
public abstract class Bolsa extends LeerTexto implements Observador {
    
    private LeerTexto fichas = new LeerTexto();
    private Lista <Ficha> listaFichas = new Lista <>();
    
    public Bolsa(){
        Lista <String >listaLecturaDeFichasTxt = fichas.leer("FICHAS.TXT");
        Nodo tmpDataLista = listaLecturaDeFichasTxt.getHead();
        
        
        //System.out.println(tmpDataLista.getDato().toString().charAt(0));
        
        while(tmpDataLista != null){
            
            Ficha ficha = new Ficha();
            
            listaFichas.insertarFinal(ficha);
            
            tmpDataLista=tmpDataLista.getSiguiente();
           System.out.println(tmpDataLista.getDato().toString().charAt(0));
        }
        System.out.println("sirvio");
    }
    @Override
    public void actualizar() {
        System.out.println("Te observo");
    }
    public Ficha fichis(){
        
        return listaFichas.getHead().getDato();
    
    }
    
    public abstract void darFicha();
    
}
