import java.util.Scanner;

public class PostNavidad{

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        //cuadrado();
        //triangulo();
        ajedrez();
        
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
        }
        /* Sin Relleno */

            /* En caso que sea mayor a 2 imprime la linea de arriba */
  
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
        
            /* En caso que sea mayor a 2 imprime la linea de abajo */
           
        if (tamanoCuadrado!=1 && tamanoCuadrado!=2) {
            for (int j = 0; j < tamanoCuadrado; j++) {
             System.out.print("* ");
            }
        }

        System.out.println("");

    }

    public static void triangulo() {
        
        int tamanoTriangulo;
        System.out.println("Introduce el tamaño del triangulo con un número:");
        tamanoTriangulo = sc.nextInt();

        /* Triangulo incremental */

        for (int i = 1; i <= tamanoTriangulo; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        /* Pirámide */

        for (int i = tamanoTriangulo; i > 0; i--) {
            
            for (int j = i; j > 0; j--) {
                
                System.out.print(" ");

            }

            for (int j2 = i; j2 < tamanoTriangulo+1; j2++) {
                System.out.print("* ");

            }

            System.out.println("");

        }
    
    }

    public static void ajedrez(){

        String[][] tablero = new String[10][10];
        String Jugador1;
        String Jugador2;
        
        int contador=0;

        //mostrarTablero(tablero);

        System.out.println();
        System.out.println("Introduce el nombre de el/la Primer/a jugador/a:");
        Jugador1=sc.next();

        System.out.println();
        System.out.println("Introduce el nombre de el/la Segundo/a jugador/a:");
        Jugador2=sc.next();

        System.out.println();
        System.out.println(Jugador1 + " vs " + Jugador2);

        do{

            contador++;

            if (contador%2==1) {
                System.out.println();
                System.out.println("--------- Turno de " + Jugador1 + " ---------");
                System.out.println();
            } else if (contador%2==0) {
                System.out.println();
                System.out.println("--------- Turno de " + Jugador2 + " ---------");
                System.out.println();
            }
            
            mostrarTablero(tablero);

            jugadaTablero(tablero, contador);

            break;

        }while(true);

    }

    public static void mostrarTablero(String[][] tablero){

        /* Programamos el tablero base */

        /* Ponemos huecos vacios para rellenar la tabla */

        tablero[0][0] = "   ";
        tablero[0][9] = "   ";
        tablero[9][0] = "   ";
        tablero[9][9] = "   ";

            /* Primero ponemos las letras/numeros para ayudar a localizar las piezas */

        for (int i = 0; i <= tablero.length; i++) {
            if (i==0 || i==tablero.length-1) {
                
                tablero[i][1] = " a ";
                tablero[i][2] = " b ";
                tablero[i][3] = " c ";
                tablero[i][4] = " d ";
                tablero[i][5] = " e ";
                tablero[i][6] = " f ";
                tablero[i][7] = " g ";
                tablero[i][8] = " h ";
            
            }
            if (i==0 || i==tablero.length-1) {
                
                tablero[1][i] = " 1 ";
                tablero[2][i] = " 2 ";
                tablero[3][i] = " 3 ";
                tablero[4][i] = " 4 ";
                tablero[5][i] = " 5 ";
                tablero[6][i] = " 6 ";
                tablero[7][i] = " 7 ";
                tablero[8][i] = " 8 ";
            
            }  
        }

        /*Ahora pondremos las fichas en el tablero */

        /* Bando blanco */

        String[] PiezasBlancas = {" \u2656 "," \u2658 "," \u2657 "," \u2654 "," \u2655 "," \u2657 "," \u2658 "," \u2656 "}; 
        String[] PeonesBlancas = {" \u2659 "," \u2659 "," \u2659 "," \u2659 "," \u2659 "," \u2659 "," \u2659 "," \u2659 "};

        /* Y el bando negro */

        String[] PiezasNegras = {" \u265C "," \u265E "," \u265D "," \u265B "," \u265A "," \u265D "," \u265E "," \u265C "};
        String[] PeonesNegras = {" \u265F "," \u265F "," \u265F "," \u265F "," \u265F "," \u265F "," \u265F "," \u265F "};

        /* Para terminar, rellenaremos los espacioes vacios de la matríz con espacios en blanco o con algún signo */

        for (int i = 3; i < 7; i++) {
            for (int j = 1; j < tablero.length-1; j++) {
                tablero[i][j] = "   ";
            }
        }

        for (int i = 1; i <= PeonesBlancas.length; i++) {
            tablero[1][i]=PiezasBlancas[i-1];
            tablero[2][i]=PeonesBlancas[i-1];
            tablero[7][i]=PeonesNegras[i-1];
            tablero[8][i]=PiezasNegras[i-1];
        }

        /* Iteramos con 2 for nuestro tablero */

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                System.out.print(tablero[i][j]);
            }
            System.out.println("");
        }

    }

    public static void jugadaTablero(String[][] tablero,int contador){

        String posPieza = "";
        String posMov;
        int col = 0;
        int fila = 0;

        System.out.println();
        System.out.println("Selecciona la pieza que desees mover:");
        System.out.println("Ej: A1 , B5 , G7 , C4");
        System.out.println();
        
        posPieza=sc.next();
        fila = Integer.parseInt(posPieza.split("")[1]);

        switch (posPieza.split("")[0]) {
            case "A":
                col = 1;
                break;
            case "B":
                col = 2;
                break;
            case "C":
                col = 3;
                break;
            case "D":
                col = 4;
                break;
            case "E":
                col = 5;
                break;
            case "F":
                col = 6;
                break;
            case "G":
                col = 7;
                break;
            case "H":
                col = 8;
                break;
            default:
                System.out.println("Introduce un valor como los dichos previamente en el ejemplo.");
                break;
        }

        /* Cambiar ahora mas adelante */

        if (tablero[col][fila] == "   ") {
            
        }

    }

}