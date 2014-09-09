package scrabble.DATAIO;
import java.io.*;
import java.lang.String;
import scrabble.EstructurasDeDatos.Lista;




class  LeerArchivo   {
     
    
    /*public static void main(String args[]) {
        
        Lista <String> palabras = new Lista();
        int cont = 0;
        try{
            // Abrimos el archivo
            FileInputStream fstream = new FileInputStream("src\\scrabble\\diccionarios\\CROSSWD.txt");
            // Creamos el objeto de entrada
            DataInputStream entrada = new DataInputStream(fstream);
            // Creamos el Buffer de Lectura
            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
            String strLinea;
            // Leer el archivo linea por linea
            while ((strLinea = buffer.readLine()) != null)   {
                cont++;
                // Imprimimos la línea por pantalla
                palabras.insertarInicio(strLinea);
                
              
                //System.out.println (palabras.toString());
            }
            // Cerramos el archivo
            entrada.close();
        }catch (Exception e){ //Catch de excepciones
            System.err.println("Ocurrio un error: " + e.getMessage());
        
        }
        System.out.println(palabras.buscar("qwert"));
        System.out.println(cont);
        
    }*/
}