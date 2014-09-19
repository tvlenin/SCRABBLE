package scrabble.LOGIC;

public class Ficha{
   private String valor; 
   private int puntaje;

   public Ficha(int puntaje, String valor){
       
       this.puntaje = puntaje;
       this.valor = valor; 
   }
   
   public String getData(){
       return valor;
   }
   public char getCharData(){
       return valor.charAt(0);
   }
   public int getPuntaje(){
       return puntaje;
   }
   
    public void update() {
        System.out.println("SIRVE");
    }

    

  
}
