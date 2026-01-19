import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;

public class Ejercicios_de_ED{

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        //Ejercicio1();
        //Ejercicio2();
        //Ejercicio3();
        Ejercicio4();
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

        /* Creamos 2 Intgeres para crear el numero que generara numeros y los numeros aleatorios */

        int random = (int) (Math.random()*100)+1;
        int genRandom = (int) (Math.random()*10)+11;

        /* Creamos un ArrayList como nos dice el ejercicio */

        ArrayList<Integer>NumsRand = new ArrayList<Integer>();

        /* Ahora cada vez que "genRandom" genere un numero aleatorio para que 
        el for itere ese mismo numero de veces que llenará el ArrayList */

        for (int index = 0; index < genRandom; index++) {
            NumsRand.add(random);
            random = (int) (Math.random()*100)+1;
        }

        /* mostramos el resultado de este  */

        System.out.println(NumsRand);

        /* Creamos una variable para los resultados que nos pide el ejercicio */

        int resultado = 0;

        /* Sumamos todos los valores */

        for (int iterable_element : NumsRand) {
            resultado+=iterable_element;
        }

        /* Las mostramos */

        System.out.println();
        System.out.println("La suma de todos los numeros es: " + resultado);

        resultado = resultado / genRandom;

        /* La media de todos los numeros */

        System.out.println();
        System.out.println("La media de todos los numeros es: " + resultado);

        /* Ordenamos el ArrayList para facilitarnos los ultimos resultados */

        Collections.sort(NumsRand);

        /* Cojemos el primer resultado, ya que lo hemos ordenado sabremos que 100% sera el menor */

        System.out.println();
        System.out.println("El numero mas bajo es: " + NumsRand.getFirst());

        /* Cojemos el ultimo y sabremos 100% cual es el mayor de todos los numeros */

        System.out.println();
        System.out.println("El numero mas alto es: " + NumsRand.getLast());

    }
    
    public static void Ejercicio3() {

    System.out.println("Introduce una frase:");
    String frase = sc.nextLine();

    // Usamos una lista como pila (Stack)
    ArrayList<String> pila = new ArrayList<>();
    boolean error = false;

    for (int i = 0; i < frase.length(); i++) {
        String actual = String.valueOf(frase.charAt(i));

        // 1. Si es apertura, lo añadimos a la pila
        if (actual.equals("(") || actual.equals("[") || actual.equals("{")) {
            pila.add(actual);
        } 
        // 2. Si es cierre, comprobamos
        else if (actual.equals(")") || actual.equals("]") || actual.equals("}")) {
            
            // Si intentamos cerrar pero no hay nada abierto, hay un error
            if (pila.isEmpty()) {
                error = true;
                break;
            }

            String ultimoAbierto = pila.remove(pila.size() - 1); // Sacamos el último

            // Comprobamos si el cierre corresponde a la apertura
            if (actual.equals(")") && !ultimoAbierto.equals("(")) { error = true; break; }
            if (actual.equals("]") && !ultimoAbierto.equals("[")) { error = true; break; }
            if (actual.equals("}") && !ultimoAbierto.equals("{")) { error = true; break; }
        }
    }

    // Es válido si no hubo errores y la pila quedó vacía (todo lo que se abrió se cerró)
    if (!error && pila.isEmpty()) {
        System.out.println("SI");
    } else {
        System.out.println("NO");
    }
}

    public static void Ejercicio4(){

        /* Declaramos variables */

        ArrayList<Integer> NumerosBingo = new ArrayList<Integer>();
        ArrayList<Integer> NumerosMencionados = new ArrayList<Integer>();
        int numeroTurno;

        /* Hacemos un for para llenar "NumerosBingo" del 1 - 90 */

        for (int i = 1; i <= 90; i++) {
            NumerosBingo.add(i);
        }

        while (true) {

            /* Hacemos que cree un número aleatorio */
            numeroTurno = (int) (Math.random()*90)+1;
        
            /* Con un if probamos si el número aleatorio ya esta en la ArrayList */
            if (NumerosMencionados.contains(numeroTurno)) {
                /*Si esta hacemos que vuelva a crear uno nuevo */
                numeroTurno = (int) (Math.random()*90)+1;
            } else {
                /* Si no esta añadiremos el número  */
                NumerosMencionados.add(numeroTurno);
            }

            /*Si todos los números del 1 - 90 están introducidos rompera el while */
            if (NumerosMencionados.containsAll(NumerosBingo)) {
                break;
            }

        }

        /* Imprimirá el ArrayList */
        System.out.println(NumerosMencionados);        
            
    };
    
    public static void Ejercicio5(){



    }
    
    public static void Ejercicio6(){



    }

}