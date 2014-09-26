package scrabble.LOGIC;

import Patrones.Observador;
import scrabble.DATAIO.LeerTexto;
import scrabble.EstructurasDeDatos.Lista;
import scrabble.EstructurasDeDatos.Nodo;

/**
 * Clase en la se tendra una lista con las fichas disponibles para el juego
 * @author abrahamon
 */
public abstract class Bolsa extends LeerTexto implements Observador {
    
    LeerTexto fichas = new LeerTexto();
    
    Lista <Ficha> listaFichas = new Lista <>();
    
    /**
     * Metodo constructor de la clase Bolsa en el que se lee un archivo de texto, 
     * Con la cantidad de de fichas que se tendran en el juego y se crea una lista de Strings en la que se almacenan las fichas.
     * @author tvlenin
     */
    public Bolsa(){
        Lista <String> listaLecturaDeFichasTxt = fichas.leer("FICHAS.TXT");
        
        Nodo <String> tmpDataLista = listaLecturaDeFichasTxt.getHead();
        //System.out.println(tmpDataLista.getDato());
        
        while(tmpDataLista != null){
            String [] letra = tmpDataLista.getDato().split("_");
            Ficha ficha = new Ficha(Integer.parseInt(letra[0]),letra[1]);
            
            listaFichas.insertar(ficha);
            tmpDataLista = tmpDataLista.getSiguiente();           
        }
    }
    
    /**
     * Metodo para actualizar la informacion de la lista de  fichas
     * @author tvlenin
     */
    @Override
    public void actualizar() {
        //System.out.println("Te observo");
    }
    
}
