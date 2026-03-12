import java.util.Scanner;

public class DivisionThrows {

    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        try {
            System.out.print("Introduce el dividendo: ");
            int n1 = sc.nextInt();
            System.out.print("Introduce el divisor: ");
            int n2 = sc.nextInt();

            /* Llamada al subprograma */
            int res = realizarDivision(n1, n2);
            System.out.println("Resultado: " + res);
        } catch (ArithmeticException e) {
            System.out.println("Error capturado en el main: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado");
        }
    }

    /* El metodo indica que puede lanzar una excepcion con 'throws' */
    public static int realizarDivision(int a, int b) throws ArithmeticException {
        try {
            if (b == 0) {
                /* Lanzamos la excepcion manualmente */
                throw new ArithmeticException("Division por cero");
            }
            return a / b;
        } catch (ArithmeticException e) {
            /* Re-lanzamos la excepcion para que la reciba el main */
            throw e;
        }
    }
}