
import java.util.Scanner;

public class Recursividad{

    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args){

        int[] a =  { 1 , 2 , 3 , 4 };
        int i = 0;
        long x = 2;
        long n = 10;

        System.out.println(sumaArray(a, i));
        System.out.println(potencia(x, n));

    }

    /* Actividad 1 */

    public static int sumaArray(int[] a, int i) {
    
    if (i >= a.length) {
    
        return 0;
    
    }

    return a[i] + sumaArray(a, i + 1);
    
    }
    
    /* Actividad 2 */

    public static long potencia(long x, long n) {
    
    if (n == 0) {
        return 1;
    }

    long half = potencia(x, n / 2);
    long result = half * half;

    
    if (n % 2 != 0) {
        result = x * result;
    }

    return result;
}

    /* Actividad 3 */

    public static int busquedaBinaria(int[] a, int izq, int der, int clave) {

    if (izq > der) {
        
        return -1;
    
    }

    int mid = izq + (der - izq) / 2;

    if (a[mid] == clave) {
    
        return mid;
    
    } 
    
    else if (clave < a[mid]) {
    
        return busquedaBinaria(a, izq, mid - 1, clave);
    
    } 
    
    else {
    
        return busquedaBinaria(a, mid + 1, der, clave);
    
    }

}

}