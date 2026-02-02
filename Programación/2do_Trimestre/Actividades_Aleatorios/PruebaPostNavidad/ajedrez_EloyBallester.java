import java.util.Scanner;
import java.util.ArrayList; 
import java.util.List;      

public class ajedrez_EloyBallester{

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        ajedrez();
        
    }

    public static void ajedrez(){

        String[][] tablero = new String[10][10];
        String Jugador1;
        String Jugador2;
        
        int contador=0;

        /* Listas para guardar el historial de jugadas */
        List<String> jugadasJ1 = new ArrayList<>();
        List<String> jugadasJ2 = new ArrayList<>();

        /* Inicialización previa del tablero antes de entrar al bucle de turnos */
        inicializarTablero(tablero);

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

            /* Pasamos las listas al método para que las rellene */
            jugadaTablero(tablero, contador, jugadasJ1, jugadasJ2);

        }while(true);

    }

    public static void inicializarTablero(String[][] tablero) {
        /* Programamos el tablero base */

            /* Primero ponemos las letras/numeros para ayudar a localizar las piezas */

        for (int i = 0; i <= tablero.length; i++) {
            
            tablero[0][0] = "   ";
            tablero[0][9] = "   ";
            tablero[9][0] = "   ";
            tablero[9][9] = "   ";
            
            if (i==0 || i==tablero.length-1) {

                tablero[i][1] = " a ";
                tablero[i][2] = " b ";
                tablero[i][3] = " c ";
                tablero[i][4] = " d ";
                tablero[i][5] = " e ";
                tablero[i][6] = " f ";
                tablero[i][7] = " g ";
                tablero[i][8] = " h ";

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

        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 9; j++) {
                tablero[i][j] = "   ";
            }
        }

        for (int i = 1; i < PeonesNegras.length+1; i++) {
            tablero[1][i]=PiezasBlancas[i-1];
            tablero[2][i]=PeonesBlancas[i-1];
            tablero[7][i]=PeonesNegras[i-1];
            tablero[8][i]=PiezasNegras[i-1];
        }        
    }

    public static void mostrarTablero(String[][] tablero){
        /* Iteramos con 2 for nuestro tablero */

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                System.out.print(tablero[i][j]);
            }
            System.out.println("");
        }

    }
    
    public static void jugadaTablero(String[][] tablero, int contador, List<String> j1, List<String> j2){

        String posPieza = "";
        String posMov = "";
        int col = 0;
        int fila = 0;

        System.out.println();
        System.out.println("Selecciona la pieza que desees seleccionár:");
        System.out.println("Ej: A1 , B5 , G7 , C4. Escribe 'FIN' para terminar.");
        System.out.println();
        
        posPieza=sc.next();

        if (posPieza.equalsIgnoreCase("FIN")) {
            System.out.println("\n--- RESUMEN DE LA PARTIDA ---");
            System.out.println("Jugadas del Jugador 1: " + j1);
            System.out.println("Jugadas del Jugador 2: " + j2);
            System.out.println("-----------------------------");
            System.exit(0);
        }

        posPieza = posPieza.toUpperCase();
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

        int colOrig = col;
        int filaOrig = fila;

        System.out.println();
        System.out.println("Selecciona a que casilla desees mover la pieza" + tablero[filaOrig][colOrig] + ": " );
        System.out.println();
            
        posMov = sc.next();

        if (posMov.equalsIgnoreCase("FIN")) {
            System.out.println("\n--- RESUMEN DE LA PARTIDA ---");
            System.out.println("Jugadas del Jugador 1: " + j1);
            System.out.println("Jugadas del Jugador 2: " + j2);
            System.out.println("-----------------------------");
            System.exit(0);
        }

        posMov = posMov.toUpperCase();
        fila = Integer.parseInt(posMov.split("")[1]);

        switch (posMov.split("")[0]) {
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
                System.out.println("Introduce un valor correcto");
                break;
        }

        /* Guardamos la jugada en la lista que corresponda según el contador */
        String registro = posPieza + " -> " + posMov;
        if (contador % 2 == 1) {
            j1.add(registro);
        } else {
            j2.add(registro);
        }

        /* Realizamos los movimientos */
        tablero[fila][col] = tablero[filaOrig][colOrig];
        tablero[filaOrig][colOrig] = "   ";

    }

}