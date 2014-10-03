package scrabble.DATAIO;
import Patrones.Observable;
import java.io.*;

import scrabble.EstructurasDeDatos.Lista;

//import scrabble.LOGIC.Subject;

/**
 * Clase en la que se gestinan las tareas relacionadas con la lectura y analisis de archivos de texto, 
 * Que contengan distintos elementos que sean necesarios para el funcinamiento y ejecucion del programa.
 * @author tvlenin
 */


public class LeerTexto  {
    
    private Lista <String> palabras = new Lista <>();
    
    /**
     * Metodo que devuelve una lista de tipo String, 
     * En la que cada elemento de la lista representa una linea de texto del archivo que se esta analizando.
     * @param PtxtData Parametro en el que se almacena el nombre del archivo de texto que se va a analizar.
     * Retorna una lista en la que se almacenan las palabras que se analizaron del archivo de texto. 
     */
    public Lista<String> leer(String PtxtData){
        
        try{
            
            File fileDir = new File("src/scrabble/Ficheros/"+PtxtData);
            Reader inpu = new InputStreamReader(new FileInputStream(fileDir), "ISO-8859-15");//"ISO-8859-15"
            BufferedReader buffer = new BufferedReader(inpu );
            
            String strLinea;
                // Leer el archivo linea por linea
                while ((strLinea = buffer.readLine()) != null)   {
                    if (strLinea.contains("/")){
                        String [] pala = strLinea.split("/");
                        strLinea = pala[0];
                    }
                    palabras.insertarFinal(strLinea);
                    //System.out.println(strLinea);

                }
            //fileDir.close();
        }catch (IOException e){ //Catch de excepciones
            System.err.println("Ocurrio un error: " + e.getMessage());
        
        }
        //System.out.println(palabras.buscar("dog"));
       
        //super.notificarObservadores();
        return palabras;
        }
    

    
}
