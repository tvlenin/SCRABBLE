package scrabble.DATAIO;
import Patrones.Observable;
import java.io.*;

import scrabble.EstructurasDeDatos.Lista;

//import scrabble.LOGIC.Subject;


public class LeerTexto  {
    
    private Lista <String> palabras = new Lista <>();
    
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
