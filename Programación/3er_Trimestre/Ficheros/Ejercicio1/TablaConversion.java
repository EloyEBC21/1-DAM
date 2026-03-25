import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TablaConversion {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        try {
            File file = new File("tabla.txt");

            if (file.createNewFile()) {
                System.out.println("Fichero creado: " + file.getName());
            } else {
                System.out.println("El fichero ya esta creado");    
                /* Eliminamos System.in.close() para no bloquear el teclado */
            }

            /* Eliminamos el FileReader ya que solo vamos a escribir datos */
            PrintWriter pw = new PrintWriter(file);

            System.out.println("Introduce un número como ejemplo, Ej: 123 - 1024 - 19231");
            int unidad = sc.nextInt();

            /* Usamos println para que cada texto se escriba en una línea nueva */
            pw.println("------------------------------------");
            pw.println("Has introducido " + unidad + " MB");
            pw.println("------------------------------------");
            pw.println(unidad + " MB en B es -> " + (unidad * 1000000L) + " B -> " + (unidad * 1000) + " KB -> " + (unidad / 1000.0) + " GB -> " + (unidad / 1000000.0) + " TB");
            pw.println("------------------------------------");

            /* Es obligatorio cerrar el archivo para que los datos se guarden en el disco */
            pw.close(); 
            System.out.println("Datos guardados con éxito en tabla.txt");

        } catch (IOException a) {
            System.out.println("Error: No puedo crear o escribir en el fichero");
        }
    }
}