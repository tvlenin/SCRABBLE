package scrabble.LOGIC;

import scrabble.DATAIO.LeerTexto;
import scrabble.EstructurasDeDatos.Lista;
import scrabble.EstructurasDeDatos.Nodo;
/**
 *
 * @author Abrahamon
 */
public class Bolsa extends LeerTexto {
    
    LeerTexto fichas = new LeerTexto();
    
    
    public Bolsa(){
        Lista listaLecturaDeFichasTxt = fichas.leer("FICHAS.TXT");
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
    
    public void mezclar(){}
    public void darFichaAzar(){} //asignar tipo de retorno correcto
    public void cambiarFichaAzar(){}
    public void mostrarFichaAzar(){}
    public void getCantidadFichas(){}
    
}
