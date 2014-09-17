
package scrabble.LOGIC;

/**
 *
 * @author Abrahamon
 */
public class Ficha extends Bolsa{
   String valor; 
   int puntaje;

   public Ficha(){
       
       //this.puntaje=puntaje;
       //this.valor=valor; 
   }
   
   public void getData(){
       System.out.println("Letra: "+valor+"; Puntaje: "+puntaje);
   }
    public void update() {
        System.out.println("SIRVE");
    }

    @Override
    public void darFicha() {
        System.out.println(super.fichis());
    }

  
}
