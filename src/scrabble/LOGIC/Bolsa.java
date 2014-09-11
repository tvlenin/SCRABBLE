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
        Lista tmplistaFichas = fichas.leer("FICHAS.TXT");
        Nodo tmp = tmplistaFichas.getHead();
        
        Lista <Ficha> listaFichas= new Lista <>();
        
        System.out.println("este es el valor de tmp en la cabeza; "+tmp.getDato().toString().charAt(2));
        
        while(tmp != null){
            Ficha ficha = new Ficha(tmp.getDato().toString().charAt(2), tmp.getDato().toString().charAt(0) );
            
            ficha.getData();
            listaFichas.insertar(ficha);
            
            //ficha.getData();
            
            tmp=tmp.getSiguiente();
        }
    }
    
    public void mezclar(){}
    public void darFichaAzar(){} //asignar tipo de retorno correcto
    public void cambiarFichaAzar(){}
    public void mostrarFichaAzar(){}
    public void getCantidadFichas(){}
    
}
