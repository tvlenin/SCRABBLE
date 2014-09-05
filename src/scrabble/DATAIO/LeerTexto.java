package scrabble.DATAIO;
import java.io.*;
import scrabble.EstructurasDeDatos.Lista;

/**
 *
 * @author fabricio
 */
public class LeerTexto {
    
    public void leer(){
        Lista <String> palabras = new Lista();
        int cont = 0;
        try{
            // Abrimos el archivo
            FileInputStream fstream = new FileInputStream("/home/fabricio/NetBeansProjects/SCRABBLE/src/scrabble/diccionarios/CROSSWD.TXT");
            // Creamos el objeto de entrada
            DataInputStream entrada = new DataInputStream(fstream);
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
            // Cerramos el archivo
            entrada.close();
        }catch (Exception e){ //Catch de excepciones
            System.err.println("Ocurrio un error: " + e.getMessage());
        
        }
        System.out.println(palabras.buscar("dog"));
        System.out.println(cont);
    }
    
}
