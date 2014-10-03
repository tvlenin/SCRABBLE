package scrabble.LOGIC;

/**
 * Clase en la que se analizaran algunos datos referentes a las fichas del juego
 * @author abrahamon
 */
public class Ficha{
   
   private String valor;  //Almacena el valor que posee una ficha
   
   private int puntaje; //Almacena el puntaje que poseen las fichas

   /**
    * Metodo en el que se le asigna un valor a una ficha y tambien se le asigna la puntuacion correspondiente.
    * @param puntaje Puntaje que posee una ficha determinada
    * @param valor Valor que se le asignara a una ficha
    * @author abrahamon
    */
   public Ficha(int puntaje, String valor){
       
       this.puntaje = puntaje;
       this.valor = valor; 
   }
   
   /**
    * Metodo para obtener el valor de una ficha
    * @return valor Retorna un String con el valor que posee una ficha
    * @author abrahamon
    */
   public String getData(){
       return valor;
   }
   
   /**
    * Metodo para obtener el valor de una ficha
    * @return valor Retorna un char con el valor que posee una ficha
    * @author abrahamon
    */
   public char getCharData(){
       return valor.charAt(0);
   }
   
   /**
    * Metodo para obtener el puntaje que posee una ficha determinada
    * @return puntaje Retorna un entero con el puntaje correspondiente a una ficha determinada
    * @author abrahamon
    */
   public int getPuntaje(){
       return puntaje;
   }
   
   /**
    * Metodo para actualizar alguna informacion de la clase Ficha
    * @author tvlenin
    */
    public void update() {
        //System.out.println("SIRVE");
    }

    

  
}
