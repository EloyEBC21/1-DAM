import java.util.Scanner;
import java.util.InputMismatchException;

public class ValidarNum{

    public static Scanner sc = new Scanner(System.in); 

    public static void main(String[] args) {
        
        /* Leer un entero */

        try {
            System.out.println("Leer int");
            int numIntNormal = sc.nextInt();
            System.out.println("Has introducido correctamente el numero: " + numIntNormal);
        } catch (Exception e) {
            System.out.println("Error: Has introducido algo diferente a un entero");
        }
        
        /* Leer un entero positivo */

        try {
            System.out.println("Leer int positivo");
            int numIntNormal = sc.nextInt();
            comprobanteInt(numIntNormal);
            System.out.println("Has introducido correctamente el numero: " + numIntNormal);
        } catch (ArithmeticException a){
            System.out.println(a.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: Has introducido algo diferente a un entero positivo");
        } 

        /* Leer un entero en un rango determinado */

        try {
            System.out.println("Leer int entre 0 - 4444");
            int numIntNormal = sc.nextInt();
            comprobanteInt(numIntNormal);
            System.out.println("Has introducido correctamente el numero: " + numIntNormal);
        } catch (ArithmeticException a){
            System.out.println(a.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: Has introducido algo diferente a un entero.");
        }


        /* Leer un numero real */

        try {
            System.out.println("Leer num real (Double)");
            Double numDoubleNormal = sc.nextDouble();
            System.out.println("Has introducido correctamente el numero: " + numDoubleNormal);
        } catch (InputMismatchException e) {
            System.out.println("Error: Has introducido algo diferente a un Double ej: 4,4.");
        }

        /* Leer un rango real entre un rango */

        try {
            System.out.println("Leer num real (Double) entre 0 - 4444,4444");
            Double numDoubleNormal = sc.nextDouble();
            comprobanteDouble(numDoubleNormal);
            System.out.println("Has introducido correctamente el numero: " + numDoubleNormal);
        } catch (ArithmeticException a){
            System.out.println(a.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: Has introducido algo diferente a un Double ej: 4,4.");
        }

    }

    public static void comprobanteInt(int numIntNormal) throws ArithmeticException{

        if (numIntNormal<0 && numIntNormal>4444) {
            throw new ArithmeticException("Has introducido un número erróneo, introduce un número correspondiendo al enunciado.");
        }

    }

    public static void comprobanteDouble(Double numDouebleNormal) throws ArithmeticException{

        if (numDouebleNormal<0 && numDouebleNormal>4444) {
            throw new ArithmeticException("Has introducido un número erróneo, introduce un número correspondiendo al enunciado.");
        }

    }

}