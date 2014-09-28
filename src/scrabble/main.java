package scrabble;

import scrabble.EstructurasDeDatos.Lista;

public class main  {
    
    public static void main(String[] args) {
        //Scrabble juego = new Scrabble();
        Lista<String> lista = new Lista<>();
        
        lista.insertar("C");
        lista.insertar("B");
        lista.insertar("A");
        System.out.println(lista.getHead().getDato());
        System.out.println(lista.getHead().getSiguiente().getDato());
        System.out.println(lista.getHead().getSiguiente().getSiguiente().getDato());
        
        lista.intercambiarNodos(lista.getHead().getSiguiente(), lista.getHead().getSiguiente().getSiguiente());
        
        System.out.println(lista.getHead().getDato());
        System.out.println(lista.getHead().getSiguiente().getDato());
        System.out.println(lista.getHead().getSiguiente().getSiguiente().getDato());
    }
}
