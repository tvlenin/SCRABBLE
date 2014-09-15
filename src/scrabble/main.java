package scrabble;

import scrabble.DATAIO.LeerTexto;
import scrabble.EstructurasDeDatos.Lista;
import scrabble.EstructurasDeDatos.Nodo;
import scrabble.LOGIC.Bolsa;

public class main  {
    
public static void main(String[] args) { 

    //Bolsa bolsa=new Bolsa();

    Lista <String> lista = new Lista<>();
    lista.insertar("5");
    lista.insertar("4");
    lista.insertar("3");
    lista.insertar("2");
    lista.insertar("1");

    lista.mezclarTodosLosNodos();
    
    
    /*
    LeerTexto leer = new LeerTexto();
    Bolsa bolso = new Bolsa();
    
    leer.agregarObservador(bolso);
    leer.leer("CROSSWD.TXT");
     */
    }
}


