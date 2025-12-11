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

    }

}