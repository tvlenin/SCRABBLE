package scrabble.LOGIC;

public class Ficha{
   private String valor; 
   private int puntaje;

   public Ficha(int puntaje, String valor){
       
       this.puntaje=puntaje;
       this.valor=valor; 
   }
   
   public String getData(){
       return"Letra: "+valor+"; Puntaje: "+puntaje ;
   }
    public void update() {
        System.out.println("SIRVE");
    }

    

  
}
