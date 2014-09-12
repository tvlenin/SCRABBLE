package scrabble.LOGIC;

import scrabble.DATAIO.LeerTexto;
import scrabble.EstructurasDeDatos.Lista;
import scrabble.EstructurasDeDatos.Nodo;

public class Bolsa {
    
    Lista <Ficha> listaFichas;
            
    public Bolsa(){
        
    LeerTexto fichas = new LeerTexto();    
    Lista <String >listaLecturaDeFichasTxt = fichas.leer("FICHAS.TXT");
    
    Nodo tmpDataLista = listaLecturaDeFichasTxt.getHead();
    listaFichas= new Lista <>();
    
    while(tmpDataLista != null){
        Ficha ficha = new Ficha();
        listaFichas.insertarFinal(ficha);
        tmpDataLista=tmpDataLista.getSiguiente();
    }
    }
    
    public void mezclar(){
    
    } 
    
    public void cambiarFichaAzar(){}
    public void mostrarFichaAzar(){}
    public void getCantidadFichas(){}
    
}
