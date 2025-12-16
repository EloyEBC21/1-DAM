import java.util.Scanner;
import java.util.ArrayList;

public class ListaArray{

    public static ArrayList<String> alumnos = new ArrayList<String>();
    
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        String comprobante;

        do {
            
            System.out.println();
            System.out.println("Introduce el nombre del siguiente alumno");
            System.out.println();
            System.out.println("----------------------------------------");
            System.out.println();
            System.out.println("Si desea terminar, introduzca 'FIN' ");
            System.out.println();
            System.out.println("----------------------------------------");
            System.out.print("Nombre alumn@:");

            comprobante=sc.next();
            
            if (comprobante.equalsIgnoreCase("fin") ) {
                
                break;

            } else {

                alumnos.add(comprobante);

            }

        } while (true);

        System.out.println();
        System.out.println(alumnos.isEmpty());
        System.out.println();
        System.out.println(alumnos.size());
        System.out.println();
        if (!alumnos.isEmpty()) {
            
            System.out.println("El primer índice es: " + alumnos.get(0));
            System.out.println();
            System.out.println("El segundo índice es: " + alumnos.get(alumnos.size()-1));

            System.out.print("Introduce el nombre del alumno que deseas buscar:");
            comprobante=sc.next();
            System.out.println(alumnos.contains(comprobante)); 

            System.out.print("Introduce el numero del alumno que deseas buscar en orden que hayas introducido previamente (ej: 1 = Jesús - 2 = Marta - 3 = Cristian): ");
            int indice = sc.nextInt();
            
                /* "int indiceMax = indice.size()-1;"  Me salta error por lo que me toca hacer una chapuza para saber la largária del ArrayList*/
            
            int indiceMax = 0;
            
            for (String trampa : alumnos) {
                indiceMax++;
            }

            if (indice-1 > indiceMax-1 || indice-1 < 0) {
                
                System.out.println("A la proxima introduce un número dentro del rango.");

            } else {

                System.out.println(alumnos.get(indice-1));

            }
            
        }

    }

}