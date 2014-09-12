package scrabble.DATAIO;
import Patrones.Observable;
import java.io.*;

import scrabble.EstructurasDeDatos.Lista;

//import scrabble.LOGIC.Subject;

/**
 *
 * @author fabricio
 */
public class LeerTexto extends Observable {
    Lista <String> palabras = new Lista <>();
    public Lista<String> leer(String PtxtData){
          
        try{
            // Abrimos el archivo
            FileInputStream fstream = new FileInputStream("src/scrabble/Ficheros/"+PtxtData);
            DataInputStream entrada = new DataInputStream(fstream);
            // Creamos el Buffer de Lectura
            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
            String strLinea;
            // Leer el archivo linea por linea
            while ((strLinea = buffer.readLine()) != null)   {
            // Imprimimos la línea por pantalla
            palabras.insertar(strLinea);
            

                
            }
            entrada.close();
        }catch (IOException e){ //Catch de excepciones
            System.err.println("Ocurrio un error: " + e.getMessage());
        
        }
        //System.out.println(palabras.buscar("dog"));
       
        super.notificarObservadores();
        return palabras;
        
        


    }
   
    
}
