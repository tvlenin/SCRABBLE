
package scrabble.LOGIC;

import scrabble.DATAIO.LeerTexto;
import scrabble.EstructurasDeDatos.Lista;

/**
 *
 * @author tvlenin
 */
public class Diccionario {
    private LeerTexto dic = new LeerTexto();
    public Lista <String> diccionario;
    public Diccionario(){
        diccionario = dic.leer("es_CR.dic");
    }
    
    
    
    
}
