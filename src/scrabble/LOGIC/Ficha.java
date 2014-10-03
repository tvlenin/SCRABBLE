package scrabble.LOGIC;

public class Ficha{
   private String valor; 
   private int puntaje;

   public Ficha(int puntaje, String valor){
       
       this.puntaje = puntaje;
       this.valor = valor; 
   }
   
   /**
    * Metodo para obtener el valor asignado de una ficha
    * @return valor Retorna un String con el valor que posee una ficha
    * @author abrahamon
    */
   public String getData(){
       return valor;
   }
   
   /**
    * Metodo para obtener el valor asignado de una ficha
    * @return valor Retorna un char con el valor que posee una ficha
    * @author abrahamon
    */
   public char getCharData(){
       return valor.charAt(0);
   }
   public int getPuntaje(){
       return puntaje;
   }
   
    public void update() {
        //System.out.println("SIRVE");
    }

    

  
}
