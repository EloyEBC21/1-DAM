//import java.util.Scanner;
//
//public class SimulacroExamen{
//
//    public static Scanner sc = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        
//        //historiaMiedo();
//        TransporteCalabaza();
//
//    }
//
//    public static void historiaMiedo(){
//
//        System.out.println("Introduce la fecha en formato DD/MM");
//
//        String introFecha = sc.next();
//        String separador="/";
//        String[] DDMM = introFecha.split(separador);
//        
//        
//
//    }
//
//    public static void TransporteCalabaza(){
//
//        /* En el primer parámetro sera las veces que se realizará */
//
//        int vecesIteracion = sc.nextInt();
//
//        /* Iteraremos las vezes que hallamos introducido */
//
//        for (int i = 0; i < vecesIteracion; i++) {
//
//            /* Primero comprobaremos cuanto pesaje tenemos ed máximo */
//            int maxPesaje = sc.nextInt();
//
//            /* Ahora miraremos cuantas calabazas hay en el huerto  */
//            int numCalabazas = sc.nextInt();
//
//            /* Por último comprobaremos lo que pesa cada calabaza */
//            String pesajeCalabaza = sc.next();
//            String[] pesajeCalabazaArray = pesajeCalabaza.split(" ");
//            double pesajeAlmacenado = 0;
//
//            /* Almacenamos el resultado suamndo todos los valores entre si */
//            for (int j = 0; j < pesajeCalabazaArray.length; j++) {
//                
//                pesajeAlmacenado = pesajeAlmacenado + Double.parseDouble(pesajeCalabazaArray[j]);
//
//            }
//
//            /* Comprobamos si es posible el transporte */
//            if (maxPesaje < pesajeAlmacenado) {
//                
//                System.out.println("NO");
//
//            } else {
//
//                System.out.println("SI");
//
//            }
//
//        }
//
//    }
//
//}