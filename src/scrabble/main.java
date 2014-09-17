package scrabble;

import scrabble.DATAIO.LeerTexto;
import scrabble.EstructurasDeDatos.Lista;
import scrabble.LOGIC.Jugador;

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
    
    System.out.println(lista.getHead().getDato());
    
    
    LeerTexto leer = new LeerTexto();
    Jugador jug = new Jugador();
    
    //leer.agregarObservador(bolso);
    leer.leer("CROSSWD.TXT");
    
    }
}


