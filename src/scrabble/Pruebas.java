
package scrabble;

import scrabble.DATAIO.LeerTexto;
import scrabble.EstructurasDeDatos.Lista;
import scrabble.EstructurasDeDatos.Nodo;


public class Pruebas {
    LeerTexto leerPrueba = new LeerTexto();
    Lista <String> prueba = leerPrueba.leer("PRUEBA.TXT");
    
    public void imprimir(){
        Nodo <String> tmp = prueba.getHead();
        for (int i = 0; i < prueba.getTalla(); i++){
            
            
            System.out.println(tmp.getDato());
            tmp = tmp.getSiguiente();
        }
    }
    public void buscar (String pData){
        System.out.println(prueba.buscar(pData));
    }
    public void eliminar (String pData){
        System.out.println(prueba.eliminar(pData));
    }
    public void insertarInicio(String pData){
        prueba.insertar(pData);
        System.out.println("Inserte: "+ prueba.getHead().getDato()+", antes de: "+prueba.getHead().getSiguiente().getDato());
    }
    public void insertarFinal(String pData){
        prueba.insertarFinal(pData);
        System.out.println("Inserte: "+ prueba.getTail().getDato()+", despues de: "+prueba.getTail().getPrevio().getDato());
    }
    
    public void insetarMedio(String pData){
        prueba.insertarEnMedio(pData, prueba.getHead().getSiguiente());
        System.out.println("Inserte:"+prueba.getHead().getSiguiente().getSiguiente().getDato()+", antes de : "+
                prueba.getHead().getSiguiente().getDato()+", y antes de :"+ prueba.getHead().getSiguiente().getSiguiente().getSiguiente().getDato());
    }
    
    public void eliminarAzar(){
        Nodo<String> test = prueba.getAndQuitarElementoAzar();
        System.out.println("Elimino y obtengo el nodo con el dato:"+test.getDato());
    }
    
    public void mostrarAzar(){
        Nodo<String> test = prueba.mostrarElementoAzar();
        System.out.println("Obtuve: "+test.getDato());
    }
    public void getTalla(){
        System.out.println(prueba.getTalla());
    }
    public void getCola(){
        System.out.println(prueba.getTail().getDato());
    }
}
