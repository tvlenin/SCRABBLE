package scrabble.LOGIC;


import scrabble.DATAIO.LeerTexto;
import scrabble.EstructurasDeDatos.Lista;
import scrabble.EstructurasDeDatos.Nodo;

/**
 * Clase en la se tendra una lista con las fichas disponibles para el juego
 * @author abrahamon
 */
public abstract class Bolsa extends LeerTexto  {
    
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
            
            listaFichas.insertarFinal(ficha);
            tmpDataLista = tmpDataLista.getSiguiente();           
        }
    }
    
     /**
     * Metodo por medio del cual se verifica si la bolsa de fichas se encuentra vacia
     * @return boolean Retorna true si la bolsa se encuentrs vacia, y retorna false si en la bolsa de fichas se encuentran elementos
     * @author abrahamon
     */
    public boolean bolsaVacia(){
        if (listaFichas.getTalla() == 0)
            return true;
        return false;
    }
    
    
    
}
