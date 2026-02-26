import java.util.ArrayList;
import java.util.Collections;

public class Main{

   @SuppressWarnings("unused")
   public static void main(String[] Args){

      for (int i = 0; i < Args.length; i++) {
         Carta carta = new Carta(i, "Oros");
         Carta carta2 = new Carta(i, "Espadas");
         Carta carta3 = new Carta(i, "Copas");
         Carta carta4 = new Carta(i, "Bastos");
         Baraja.Cartas.add(carta);
      }

   }

}

class Carta{

   String palo, numero;

   /* Constructor */

   public Carta(int num , String palo){
      this.numero = Integer.toString(num);
      this.palo = palo;
   } 

   /* Getters y Setters */

   public String getPalo() {
      return palo;
   }

   public void setPalo(String palo) {
      this.palo = palo;
   }

   public String getNumero() {
      return numero;
   }

   public void setNumero(String numero) {
      this.numero = numero;
   }  

   @Override

   public String toString(){
      return this.numero + " de " + this.palo;
   }

}

class Baraja{

   static ArrayList<Carta> Cartas = new ArrayList<Carta>();

   public void Barajar(){

      Collections.shuffle(Cartas);

   }

   public Carta repartirCartas(){

      Carta cartaRepartida = Cartas.getFirst();

      Cartas.removeFirst();

      return cartaRepartida;

   }

}

class Jugador{

   String nombre;
   ArrayList<Carta> Mano = new ArrayList<Carta>();

   Jugador(String nombre){
      this.nombre = nombre;
   }

   public void recibeCarta(Carta carta){
      Mano.add(carta);
   }

   public void juegaCarta(){

      System.out.println();
      System.out.println();

      System.out.println();
      System.out.print("Que carta quieres jugar?: ");
   }


}

abstract class JuegoDeCartas{}

class JuegoX extends JuegoDeCartas{}

