import java.util.Scanner;

public class AnalizadorSecuencias {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        /* Pedimos el número de casos inicial */
        int casos = teclado.nextInt();
        
        /* Usamos una variable para ir guardando todos los resultados y mostrarlos al final */
        String resultadosFinales = "";

        /* Bucle para procesar cada caso */
        for (int i = 0; i < casos; i++) {
            int contadorMayor = 0;
            int contadorMenor = 0;

            /* Pedimos la cantidad de números de la secuencia actual */
            int cantidadNumeros = teclado.nextInt();

            if (cantidadNumeros > 0) {
                int numeroActual = teclado.nextInt();

                for (int j = 1; j < cantidadNumeros; j++) {
                    int numeroSiguiente = teclado.nextInt();

                    if (numeroSiguiente > numeroActual) {
                        contadorMayor++;
                    } else if (numeroSiguiente < numeroActual) {
                        contadorMenor++;
                    }
                    /* El siguiente se convierte en el actual para la próxima comparación */
                    numeroActual = numeroSiguiente;
                }
            }

            /* Acumulamos el resultado de este caso en nuestra variable de texto */
            resultadosFinales += "Mayores: " + contadorMayor + " - Menores: " + contadorMenor + "\n";
        }

        /* Una vez terminados todos los casos, mostramos todo el bloque de resultados */
        System.out.println("\n--- RESULTADOS FINALES ---");
        System.out.print(resultadosFinales);

        teclado.close();
    }
}