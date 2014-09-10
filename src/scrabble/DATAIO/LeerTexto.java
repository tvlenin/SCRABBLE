package scrabble.DATAIO;
import Patrones.Container;
import Patrones.Iterator;
import java.io.*;

import scrabble.EstructurasDeDatos.Lista;

import scrabble.LOGIC.Ficha;
//import scrabble.LOGIC.Subject;

/**
 *
 * @author fabricio
 */
public class LeerTexto implements Container {
    Lista <String> palabras = new Lista <>();
    public void leer(){
        
        int cont = 0;
        try{
            // Abrimos el archivo
            FileInputStream fstream = new FileInputStream("src/scrabble/diccionarios/CROSSWD.TXT");
            // Creamos el Buffer de Lectura
            try ( // Creamos el objeto de entrada
                    DataInputStream entrada = new DataInputStream(fstream)) {
                // Creamos el Buffer de Lectura
                BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
                String strLinea;
                // Leer el archivo linea por linea
                while ((strLinea = buffer.readLine()) != null)   {
                    cont++;
                    // Imprimimos la línea por pantalla
                    palabras.insertar(strLinea);
                    
                    
                    //System.out.println (palabras.toString());
                }
            }
        }catch (IOException e){ //Catch de excepciones
            System.err.println("Ocurrio un error: " + e.getMessage());
        
        }
        System.out.println(palabras.buscar("dog"));
       
        


    }
     @Override
    public Iterator getIterator() {
        return new Iterador();
    }
    
     private class Iterador implements Iterator {

      int index;

      @Override
      public boolean hasNext() {
         if(index < palabras.getTalla()){
            return true;
         }
         return false;
      }

      @Override
      public Object next() {
         if(this.hasNext()){
            //return palabras.;
         }
         return null;
      }		
   }
    
}
