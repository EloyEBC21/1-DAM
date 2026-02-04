import java.util.Scanner;

public class actWordle {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        /*
        Indicar un nº de intentos
        .charAt .indexOf() .toUpperCase()
        */

        String adivinar = "GATOS";
        String intento = "";
        int intentos = 0;   /* Declaramos variables */
        
        while (true) {

        System.out.println();
        System.out.println("Introduce una palabra de 5 letras");
        String palabra = sc.next().toUpperCase(); 

        intento = comprobarPalabra(palabra,intentos);

        char[] pistas = comparar(intento, adivinar);

        mostrarResultado(intento, pistas);

        if (adivinar.equals(intento)) {
            finalizarJuego(true, adivinar);
            break;
        } else if(intentos>=7){
            finalizarJuego(false, adivinar);
            break;
        }

        intentos++;
        }

    }

    public static String comprobarPalabra(String palabra, int intento){

        /*
        Comprueba si está dentro del nº de intentos
        Comprueba que la palabra tenga 5 letras
        */

        if (intento<6) {
            
            while (true) { 
                if (palabra.length()!=5) {
                    System.out.println("Introduce una palabra con 5 letras");
                    palabra = sc.next().toUpperCase();
                } else {break;}
            }

        }

        return palabra;

    }

    public static char[] comparar(String intento, String palabra){

        /*Compara la palabra del intento con la palabra oculta */
        /* Muestra:
        O -> para letra y posición correcta
        X -> para letra incorrecta
        ? -> para letra correcta en posición incorrecta
        */

        /* Llenamos un array con los char del string "intento" */
        char[] comprobarIntento = new char[5];
        for (int i = 0; i < 5; i++) {
            comprobarIntento[i] = intento.charAt(i);
        }

        /* Llenamos un array con los char del string "intento" */
        char[] comprobarPalabra = new char[5];
        for (int i = 0; i < 5; i++) {
            comprobarPalabra[i] = palabra.charAt(i);
        }

        char[] pistas = new char[5];

        /* Comprobamos los array */
        for (int i = 0; i < pistas.length; i++) {   /* Este caso es para llenar automaticamente todas las ranuras X como base */
            pistas[i]='X';
        }

        for (int i = 0; i < pistas.length; i++) {   /* De esta forma comprobamos los casos que las letras posicionadamente correctas se muestren */
            if (comprobarIntento[i]==comprobarPalabra[i]) {
                pistas[i]='O';
            }
        }

        for (int i = 0; i < pistas.length; i++) {
            if (pistas[i]!='O') {                   /* Y aqui solamente introduciremos '?' si ya sabemos que esa casilla no es 'O' */
                for (int j = 0; j < pistas.length; j++) {
                    if (comprobarIntento[i] == comprobarPalabra[j]) {
                        pistas[i] = '?';
                        break;
                    }
                }
            }
        }

        return pistas;
    }

    public static void mostrarResultado(String intento, char[] pistas){

        /* Muestra por pantalla el intento, si la palabra es GATOS y ponga SALMO */
        /*
        [S][A][L][M][O]
        [?][O][X][X][?]
        */

        for (int i = 0; i < intento.length(); i++) {
            System.out.print("[" + intento.charAt(i) + "]");
        }

        System.out.println();

        for (char c : pistas) {
            System.out.print("[" + c + "]");
        }
        
        System.out.println();

    }

    public static void finalizarJuego(boolean finalizar, String palabra){

        /* Indica si ha ganado y si no "oh que pena la palabra era: palabra" */

        if (!finalizar) {
            System.out.println();
            System.out.println("oh que pena la palabra era: " + palabra);
        } else {
            System.out.println();
            System.out.println("¡Has ganado!");
        }

    }

}