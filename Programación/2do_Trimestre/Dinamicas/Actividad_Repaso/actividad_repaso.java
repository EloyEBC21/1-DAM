import java.util.Scanner;

/* "--" Lo aclaro desde hoy hasta que acabe el curso, eso que e entrecomillado se refiere a que es un comentario mio personal*/
/* -- la diferencia entre ellos es que los normales los introduzco para que se aclare el código y el otro es que es MI opinion personal */

public class actividad_repaso {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String NomUsuario;

        /* Pedimos el nombre del usuario al cliente */

        System.out.println();
        System.out.println("Introduce el nombre del usuario con este formato:");
        System.out.println("(Minimo tres carácteres) - @ - (Minimo tres carácteres) - . - (texto que desées)");
        System.out.println("Ej: AsdEd@AsD.MasTexto");
        NomUsuario=sc.nextLine();

        for (int i = 0; i < NomUsuario.length(); i++) {
            /* Comprobación de nombre de usuario */
        
            char caracter = NomUsuario.charAt(i);
            
            if (!NomUsuario.contains("@") || !NomUsuario.contains(".")) {

                /* Primero comprobamos si el usuario ha introducido '@' o '.' */

                System.out.println();
                System.out.println("Introduce un nombre de usuario como el ejemplo");
                System.out.println();
                break;
            }

            if (i==0) {
                /* En el primer ciclo */

                if(NomUsuario.length()<3){

                    /* Revisamos si almenos el nombre tiene una largaria de 3 o mas caracteres */

                    System.out.println();
                    System.out.println("Introduce un nombre de usuario valido");
                    System.out.println();
                    break;
                } else if (NomUsuario.substring(0, 3).contains("@")) {

                    /* Y luego revisamos si es de 3 o mas que contenga @ */
                    System.out.println();
                    System.out.println("Introduce al menos 3 o mas caracteres antes del @");
                    System.out.println();
                    break;    
                }
            }

            if (caracter=='@') {
                /* En caso que sea @ */

                if(NomUsuario.length()<7){
                    /* si el tamaño es menor a 7 directamente que saque error */
                        /* --Podria haber introducido en la de antes pero prefiero que esté aqui por motivos personales */

                    System.out.println();
                    System.out.println("Introduce 3 o mas caracteres despues del @");
                    System.out.println();
                    break;
                } else if (!NomUsuario.substring(i, NomUsuario.length()).contains(".")) {
                    /* Comprobamos que desde la posición que se encuentra @ hasta el final del nombre de usuario contiene '.' */

                    System.out.println();
                    System.out.println("Introduce el punto luego de 3 caracteres");
                    System.out.println("Ej:cHr@Chr'.'texto");
                    System.out.println();
                    break;    
                }
            }

            if (caracter=='.') {
                /* En caso que sea . */

                String errorIntroducido = NomUsuario.substring(0, i);
                if (!errorIntroducido.contains("@")) {
                    /* Revisamos que desde el principio hasta el . haya un @ */

                    System.out.println();
                    System.out.println("Introduce con el orden correcto los caracteres");
                    System.out.println();
                    break;
                } else if(NomUsuario.substring(i-3, i).contains("@")){
                    /* y ahora revisamos que lo que haya detrás de el punto haya 3 caracteres */
                    /* comprobando que no contenga @ en los 3 anteriores carácteres */

                    System.out.println();
                    System.out.println("Introduce el punto luego de introducir al menos 3 o mas caracteres");
                    System.out.println("Ej:cHr@Chr'.'texto");
                    System.out.println();
                }
            }

            if (!Character.isAlphabetic(caracter)&&caracter!='@'&&caracter!='.') {
                /* Comprobamos que cada caracter sea alfanumerico exceptuando por @ y . */

                System.out.println();
                System.out.println("Introduce un caracter valido porfavor.");
                System.out.println();
                break;
            }
        
        }

        /* Cerramos el scanner */
        sc.close();

    } 

}