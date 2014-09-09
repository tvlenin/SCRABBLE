
package scrabble.LOGIC;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import scrabble.EstructurasDeDatos.Lista;

/**
 *
 * @author Abrahamon
 */
public class Bolsa {
    
    Lista listaDeFichas;
    
    public Bolsa(){
        listaDeFichas= new Lista();
        //--------------------------------------------------------------------------------------------------
        //                      Crear una lista con las fichas
        Lista <String> listaDeFichas = new Lista();
        int cont = 0;
        try{
            FileInputStream fstream = new FileInputStream("src\\scrabble\\diccionarios\\FICHAS.txt");
            DataInputStream entrada = new DataInputStream(fstream);
            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
            String strLinea;
            while ((strLinea = buffer.readLine()) != null)   {
                cont++;
                listaDeFichas.insertarInicio(strLinea);
                
              
                //System.out.println (palabras.toString());
            }
            // Cerramos el archivo
            entrada.close();
        }catch (Exception e){ //Catch de excepciones
            System.err.println("Ocurrio un error: " + e.getMessage());
        
        }
        System.out.println(listaDeFichas.buscar("A"));
        System.out.println(cont);        
        //----------------------------------------------------------------------------------------------------
    }
    
    public void mezclar(){}
    public void darFichaAzar(){} //asignar tipo de retorno correcto
    public void cambiarFichaAzar(){}
    public void mostrarFichaAzar(){}
    public void getCantidadFichas(){}
    
}
