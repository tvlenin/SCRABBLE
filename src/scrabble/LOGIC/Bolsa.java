package scrabble.LOGIC;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
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
        /*
        while(tmpDataLista.getSiguiente() != null){
            //Ficha ficha1 = new Ficha(tmpDataLista.getDato().toString().charAt(2), tmpDataLista.getDato().toString().charAt(0) );
            
            //listaFichas.insertar(ficha);
            
            //ficha.getData();
            
            tmpDataLista=tmpDataLista.getSiguiente();
        }*/
    }
    
    public void mezclar(){}
    public void darFichaAzar(){} //asignar tipo de retorno correcto
    public void cambiarFichaAzar(){}
    public void mostrarFichaAzar(){}
    public void getCantidadFichas(){}
    
}
