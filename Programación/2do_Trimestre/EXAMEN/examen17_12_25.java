import java.util.Scanner;
import java.util.ArrayList;

public class examen17_12_25{

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        pokemon();
        chocolate();
        strangerOnce();

    }

    public static void pokemon(){

        /* Primer scanner al número de pokemons que se van a introducir */

        int numPokemons = sc.nextInt();
        sc.nextLine();

        /* creamos un String para almacenar las respuestas del usuario */
        
        String respuestaUsuario;

        for (int i = 0; i < numPokemons; i++) {
            
            /* iteramos todas las vezes necesarias que hemos introducido para comprobar todas las palabras */

            respuestaUsuario = sc.next();
            char comprobante = respuestaUsuario.charAt(respuestaUsuario.length()-1);
            if (comprobante == 'a' || comprobante == 'e' || comprobante == 'i' || comprobante == 'o' || comprobante == 'u' || comprobante == 'n' || comprobante == 's') {
                System.out.println("NO");
            } else {
                System.out.println("SI");
            }

        }

    }

    public static void chocolate(){

        /* Miramos el numero de casos */

        int numCasos = sc.nextInt();
        sc.nextLine();
        
        /* un for para todos los casos */

        String anchuraAlturaTotal;

        for (int i = 0; i < numCasos; i++) {
            
            /* Leemos lo que pone el usuario */
    
            anchuraAlturaTotal = sc.nextLine();
            String[] anchuraAlturaTotalArray = anchuraAlturaTotal.split(" ");
            int operacionTotalAA = 0;
            int tablasNecesarias = 0;

            do {
                tablasNecesarias++;
                operacionTotalAA = operacionTotalAA + ((Integer.parseInt(anchuraAlturaTotalArray[0])) * (Integer.parseInt(anchuraAlturaTotalArray[1])));
            } while (operacionTotalAA < Integer.parseInt(anchuraAlturaTotalArray[2]));
            
            System.out.println(tablasNecesarias);

        }

    }

    public static void strangerOnce(){

        /* Introducimos el número de casos que vamos a comprobar */

        int numCasos = sc.nextInt();
        sc.nextLine();
        int digitos = 0;

        for (int i = 0; i < numCasos; i++) {

            digitos = sc.nextInt();
            sumarDigitos(digitos);
            

        }

    }

    static int sumarDigitos(int digitos){

        int comprobante = 0;
        int digitosPrime = digitos;
        int resultado = 0;
        int resultadoPrime = 0;
        int cifra = 1;

        for (int i = 0; 10 < digitos; i++) {
            
            digitos=digitos/10;
            comprobante++;

        }

        for (int i = 0; i <= comprobante; i++) {
            
            resultado = digitosPrime%1;
            resultadoPrime = resultadoPrime + resultado;
            digitosPrime = digitosPrime%cifra;
            cifra = cifra*10;

        }

        System.out.println(resultadoPrime);

        return resultadoPrime;

    }

}