import java.util.Scanner;
import java.util.InputMismatchException;

public class DivisionEspecifica {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        try {
            System.out.print("Introduce el dividendo: ");
            int num1 = sc.nextInt();
            System.out.print("Introduce el divisor: ");
            int num2 = sc.nextInt();

            int resultado = num1 / num2;
            System.out.println("Resultado: " + resultado);
        } 
        /* Error cuando el dato no es un numero entero */
        catch (InputMismatchException e) {
            System.out.println("InputMismatchException");
        } 
        /* Error cuando se divide por cero */
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } 
        /* Error general para cualquier otro caso imprevisto */
        catch (Exception e) {
            System.out.println("Problemas con la division");
        }
    }
}