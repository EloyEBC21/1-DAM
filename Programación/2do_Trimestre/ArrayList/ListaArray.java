import java.util.Scanner;
import java.util.ArrayList;

public class ListaArray{

    public static ArrayList<String> alumnos;
    
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        String comprobante;

        do {
            
            System.out.println("Introduce el nombre del siguiente alumno");
            System.out.println("----------------------------------------");
            System.out.println("Si desea terminar, introduzca 'Fin' ");
            comprobante=sc.next().toUpperCase();
            
            if (comprobante=="FIN") {
                
                break;

            } else {

                alumnos.add(comprobante);

            }


        } while (true);

    }

}