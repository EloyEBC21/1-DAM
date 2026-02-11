import java.util.Scanner;

public class appCafetera{

    public static Cafetera cafe = new Cafetera();
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    
        System.out.println();
        System.out.println("La cantidad actual es: " + cafe.getCantAct());
        System.out.println("La capacidad maxima es: " + cafe.getCapMax());
        System.out.println();
 
        cafe.vaciarCafetera();

        System.out.println("La cantidad actual despues del vacio: " + cafe.getCantAct());
        System.out.println();

        cafe.llenarCafetera();

        System.out.println("La cantidad actual despues de llenarla: " + cafe.getCantAct());
        System.out.println();

        cafe.vaciarCafetera();

        while (true) {

            System.out.println("Introduce la cantidad que desees agregar a la cafetera:");
            int cantidad = sc.nextInt();
            int comprobamos = cafe.getCantAct() + cantidad;

            if (comprobamos<=cafe.capMax) {
                cafe.agregarCafe(cantidad);
                break;
            } else { System.out.println("Has inttroducido demasiado cafe, introduce menos. La cantidad actual es: " + cafe.cantAct + " y la cafetera soporta: " + cafe.capMax);}
        }

        System.out.println("Cantidad Actualizada: " + cafe.getCantAct() + " granos de café añadidos.");

    }
    
}