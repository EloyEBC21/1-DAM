import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;

public class Ejercicios_de_ED{

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        //Ejercicio1();
        Ejercicio2();
        //Ejercicio3();
        //Ejercicio4();
        //Ejercicio5();
        //Ejercicio6();

    }

    public static void Ejercicio1(){

        /* Ejercicio 1 */

        /* Declaramos Variables */

        LinkedList<String> Alumnos = new LinkedList<String>();
        String StringAlumnos = "";
        int Contador = 0;

        /* Creamos un bucle porque nos lo piden */

        do{

            Contador++;
            System.out.println("Introduce un nombre del alumnado:");
           
                /* Esto es pura estetica para que me diga solo una vez el como salír del bucle */
            if (Contador == 1) {
                
                System.out.println("Si deseas terminar introduce 'fin':");   

            }
            
                /* Pedimos al usuario que introduzca los nombres del alumnado  */
            StringAlumnos = sc.next();
            System.out.println();

            if (StringAlumnos.equalsIgnoreCase("fin")) {

                /* Si el usuario introduce "fin" mostrarémos los detalles del listado que ha introducido previamente */

                System.out.println("-------------------- Listado Alumnado --------------------");
                System.out.println("");

                /* Iteramos la primera lista con un "Iterator" */

                Iterator<String>Iterador = Alumnos.iterator();
                while (Iterador.hasNext()){
                    System.out.println(Iterador.next());
                }

                /* Mostramos el tamañao de la lista / Cuantos alumnos ha introducido el usuario */

                System.out.println();
                System.out.println("Total de alumnos: " + Alumnos.size());

                /* Ordenamos el LiknedList*/

                System.out.println();
                Collections.sort(Alumnos);

                /* Iteramos pero esta vez con el LinkedList ordenado */

                System.out.println("-------------------- Listado Alumnado Ordenada --------------------");
                System.out.println();

                    /* --Una desventaja del iterator es que si o si, al modificarlo posteriormente a finalizar de introducir datos, tienes que volver a iterarlo desde el principio */

                Iterador = Alumnos.iterator();

                while (Iterador.hasNext()){
                    System.out.println(Iterador.next());
                }

                System.out.println();

                /* Salimos del bucle */

                break;

            } else {

                /* Añadimos al LinkedList si el usuario no ha introducido "fin" */

                Alumnos.add(StringAlumnos);

            }

        }
        while(true);

    }

    public static void Ejercicio2(){

        /* Ejercicio 2 */

        int random = (int) (Math.random()*100)+1;

        while (true) {

            ArrayList<Integer>NumsRand = new ArrayList<Integer>();


        }

    }
    
    public static void Ejercicio3(){



    }

    public static void Ejercicio4(){



    }
    
    public static void Ejercicio5(){



    }
    
    public static void Ejercicio6(){



    }

}