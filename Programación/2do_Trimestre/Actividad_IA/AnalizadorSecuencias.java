import java.util.Scanner;

public class AnalizadorSecuencias {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        /* Pedimos al usuario el número de casos de prueba */
        int casos = teclado.nextInt();

        /* Se iterará el programa las veces introducidas por el usuario */
        for (int i = 0; i < casos; i++) {
            int contadorMayor = 0;
            int contadorMenor = 0;

            /* Pedimos la cantidad de números que tendrá esta línea */
            int cantidadNumeros = teclado.nextInt();

            /* Si el usuario dice que habrá al menos un número, empezamos a comparar */
            if (cantidadNumeros > 0) {
                int numeroActual = teclado.nextInt();

                /* Analizamos el resto de números de la línea */
                for (int j = 1; j < cantidadNumeros; j++) {
                    int numeroSiguiente = teclado.nextInt();

                    /* Comparación lógica según el pseudocódigo */
                    if (numeroSiguiente > numeroActual) {
                        contadorMayor++;
                    } else if (numeroSiguiente < numeroActual) {
                        contadorMenor++;
                    }

                    /* Actualizamos el número actual para la siguiente comparación */
                    numeroActual = numeroSiguiente;
                }
            }

            /* Mostramos los resultados de la línea analizada */
            System.out.println("Mayores: " + contadorMayor + " - Menores: " + contadorMenor);
        }

        teclado.close();
    }
}