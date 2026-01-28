import java.util.Scanner;
import java.util.HashMap;

/* "--" Lo aclaro desde hoy hasta que acabe el curso, eso que e entrecomillado se refiere a que es un comentario mio personal*/
/* -- la diferencia entre ellos es que los normales los introduzco para que se aclare el código y el otro es que es MI opinion personal */

public class actividad_repaso {

    // Variable global para el diccionario
    static HashMap<String, String> userDatabase = new HashMap<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String NomUsuario;
        String Contrasenya;

        /* Pedimos el nombre del usuario al cliente */

        System.out.println();
        System.out.println("Introduce el nombre del usuario con este formato:");
        System.out.println("(Minimo tres carácteres) - @ - (Minimo tres carácteres) - . - (texto que desées)");
        System.out.println("Ej: AsdEd@AsD.MasTexto");
        NomUsuario = sc.nextLine();

        // Aplicamos la limpieza de espacios solicitada
        NomUsuario = limpiarUsuario(NomUsuario);

        // Validamos el usuario usando el metodo procedural
        if (!esUsuarioValido(NomUsuario)) {
            System.out.println();
            System.out.println("Introduce un nombre de usuario valido");
            System.out.println();
            System.exit(0);
        }

        /* Tu lógica original de validación de caracteres se mantiene intacta aquí 
           aunque ahora esté encapsulada o reforzada por los métodos procedurales.
        */
        for (int i = 0; i < NomUsuario.length(); i++) {
            char caracter = NomUsuario.charAt(i);
            
            if (!NomUsuario.contains("@") || !NomUsuario.contains(".")) {
                System.out.println();
                System.out.println("Introduce un nombre de usuario como el ejemplo");
                System.out.println();
                System.exit(0);
            }

            if (i == 0) {
                if(NomUsuario.length() < 3){
                    System.out.println();
                    System.out.println("Introduce un nombre de usuario valido");
                    System.out.println();
                    System.exit(0);
                } else if (NomUsuario.substring(0, 3).contains("@")) {
                    System.out.println();
                    System.out.println("Introduce al menos 3 o mas caracteres antes del @");
                    System.out.println();
                    System.exit(0);    
                }
            }

            if (caracter == '@') {
                if(NomUsuario.length() < 7){
                    System.out.println();
                    System.out.println("Introduce 3 o mas caracteres despues del @");
                    System.out.println();
                    System.exit(0);
                } else if (!NomUsuario.substring(i, NomUsuario.length()).contains(".")) {
                    System.out.println();
                    System.out.println("Introduce el punto luego de 3 caracteres");
                    System.out.println();
                    System.exit(0);    
                }
            }

            if (caracter == '.') {
                String errorIntroducido = NomUsuario.substring(0, i);
                if (!errorIntroducido.contains("@")) {
                    System.out.println();
                    System.out.println("Introduce con el orden correcto los caracteres");
                    System.out.println();
                    System.exit(0);
                } else if(NomUsuario.substring(i-3, i).contains("@")){
                    System.out.println();
                    System.out.println("Introduce el punto luego de introducir al menos 3 o mas caracteres");
                    System.out.println();
                }
            }

            if (!Character.isAlphabetic(caracter) && caracter != '@' && caracter != '.') {
                System.out.println();
                System.out.println("Introduce un caracter valido porfavor.");
                System.out.println();
                System.exit(0);
            }
        }

        System.out.println("Introduce la contraseña:");
        Contrasenya = sc.nextLine();

        // Validamos la contraseña con el método procedural
        if (esPasswordSegura(Contrasenya)) {
            registrarEnDiccionario(NomUsuario, Contrasenya);
        } else {
            System.out.println();
            System.out.println("Invalid password. It must have 8+ chars, 1 uppercase, 1 lowercase and 1 number.");
            System.out.println();
            System.exit(0);
        }

        /* Cerramos el scanner */
        sc.close();
    }

    // --- PROCEDURAL METHODS ---

    public static String limpiarUsuario(String u) {
        /* Removes all spaces from the username */
        return u.replace(" ", "");
    }

    public static boolean esUsuarioValido(String u) {
        /* Checks minimum structure: contains @ and . and length */
        return u.contains("@") && u.contains(".") && u.length() >= 7;
    }

    public static boolean esPasswordSegura(String p) {
        /* Checks for 8 chars, 1 upper, 1 lower and 1 digit */
        if (p.length() < 8) return false;
        
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;

        for (char c : p.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpper = true;
            if (Character.isLowerCase(c)) hasLower = true;
            if (Character.isDigit(c)) hasDigit = true;
        }

        return hasUpper && hasLower && hasDigit;
    }

    public static void registrarEnDiccionario(String u, String p) {
        /* Manages user storage in the HashMap */
        if (userDatabase.containsKey(u)) {
            userDatabase.put(u, p);
            System.out.println("User password has been updated.");
        } else {
            userDatabase.put(u, p);
            System.out.println("New user has been added.");
        }
    }
}