import java.util.Scanner;

public class PostNavidad{

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        //cuadrado();
        triangulo();
        
    }

    public static void cuadrado(){

        int tamanoCuadrado;
        System.out.println("Introduce que tán grande quieres el cuadrado:");
        tamanoCuadrado = sc.nextInt();

        /* Cuadrado */

        for (int a = 0; a < tamanoCuadrado; a++) {
            for (int j = 0; j < tamanoCuadrado; j++) {
                System.out.print("*");
            }
            System.out.println();

        /* Sin Relleno */

  
        if (tamanoCuadrado!=1 && tamanoCuadrado!=2) {
            for (int j = 0; j < tamanoCuadrado; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        if (tamanoCuadrado==1) {

            /* Caso de 1 */
            
            System.out.println("*");
            
        } else if (tamanoCuadrado==2) {

            /* Caso de 2 */

            for (int k = 0; k < 2; k++) {
                for (int l = 0; l < 2; l++) {
                    System.out.print("* ");
                }
                    System.out.println(" ");
            }

        } else {

            /* Todos los demas casos */

            for (int i = 1; i < tamanoCuadrado-1; i++) {
                for (int j = 0; j < tamanoCuadrado; j++) {
                    if (j==0 || j == tamanoCuadrado-1) {
                        System.out.print("* ");
                    } else{
                        System.out.print("  ");
                    }
                }
                System.out.println(" ");
            }
            
        }
        
           
        if (tamanoCuadrado!=1 && tamanoCuadrado!=2) {
            for (int j = 0; j < tamanoCuadrado; j++) {
             System.out.print("* ");
            }
        }

    }

    }

    public static void triangulo() {
        
        int tamanoTriangulo;
        System.out.println("Introduce el tamaño del triangulo con un número:");
        tamanoTriangulo = sc.nextInt();

        /* Triangulo incremental */

//        for (int i = 1; i <= tamanoTriangulo; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println("");
//        }

        /* Pirámide */

        for (int i = tamanoTriangulo; i > 0; i--) {
            
            for (int j = i; j > 0; j--) {
                
                System.out.print("* ");

                

            }

            
            
            System.out.println("");

        }
    
    }

}