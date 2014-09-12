package scrabble.LOGIC;

import scrabble.DATAIO.LeerTexto;
import scrabble.EstructurasDeDatos.Lista;
import scrabble.EstructurasDeDatos.Nodo;

public class Bolsa extends LeerTexto {
    
    LeerTexto fichas = new LeerTexto();
    
    
    public Bolsa(){
        Lista listaLecturaDeFichasTxt = fichas.leer("FICHAS.TXT");
        Nodo tmpDataLista = listaLecturaDeFichasTxt.getHead();
        
        Lista <Ficha> listaFichas= new Lista <>();
        System.out.println(tmpDataLista.getDato().toString().charAt(0));
        Ficha ficha = new Ficha(tmpDataLista.getDato().toString().charAt(2) , tmpDataLista.getDato().toString().charAt(0));
    }
    
    public void mezclar(){
    
    }
    public void darFichaAzar(){} //asignar tipo de retorno correcto
    public void cambiarFichaAzar(){}
    public void mostrarFichaAzar(){}
    public void getCantidadFichas(){}
    
}
