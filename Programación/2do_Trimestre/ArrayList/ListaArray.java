//import java.util.Scanner;
//import java.util.ArrayList;
//
//public class ListaArray{
//
//    public static Scanner sc = new Scanner(System.in);
//
//    public static void main(String[] args){
//
//        //alumnoEjercicio();
//        listaCompras();
//
//    }
//
//    public static void alumnoEjercicio(){
//
//        ArrayList<String> alumnos = new ArrayList<String>();
//
//        String comprobante;
//
//        do {
//            
//            System.out.println();
//            System.out.println("Introduce el nombre del siguiente alumno");
//            System.out.println();
//            System.out.println("----------------------------------------");
//            System.out.println();
//            System.out.println("Si desea terminar, introduzca 'FIN' ");
//            System.out.println();
//            System.out.println("----------------------------------------");
//            System.out.print("Nombre alumn@:");
//
//            comprobante=sc.next();
//            
//            if (comprobante.equalsIgnoreCase("fin") ) {
//                
//                break;
//
//            } else {
//
//                alumnos.add(comprobante);
//
//            }
//
//        } while (true);
//
//        System.out.println();
//        System.out.println(alumnos.isEmpty());
//        System.out.println();
//        System.out.println(alumnos.size());
//        System.out.println();
//        if (!alumnos.isEmpty()) {
//            
//            System.out.println("El primer índice es: " + alumnos.get(0));
//            System.out.println();
//            System.out.println("El segundo índice es: " + alumnos.get(alumnos.size()-1));
//
//            System.out.print("Introduce el nombre del alumno que deseas buscar:");
//            comprobante=sc.next();
//            System.out.println(alumnos.contains(comprobante)); 
//
//            System.out.print("Introduce el numero del alumno que deseas buscar en orden que hayas introducido previamente (ej: 1 = Jesús - 2 = Marta - 3 = Cristian): ");
//            int indice = sc.nextInt();
//            
//                /* "int indiceMax = indice.size()-1;"  Me salta error por lo que me toca hacer una chapuza para saber la largária del ArrayList*/
//            
//            int indiceMax = 0;
//            
//            for (String trampa : alumnos) {
//                indiceMax++;
//            }
//
//            if (indice-1 > indiceMax-1 || indice-1 < 0) {
//                
//                System.out.println("A la proxima introduce un número dentro del rango.");
//
//            } else {
//
//                System.out.println(alumnos.get(indice-1));
//
//            }
//            
//        }
//
//    }
//
//    public static void listaCompras(){
//
//        ArrayList<String> listaCompra = new ArrayList<>();
//
//        do {
//
//            String comprobante;
//            
//            System.out.println();
//            System.out.println("Introduce el siguiente producto del listado.");
//            System.out.println();
//            System.out.println("----------------------------------------");
//            System.out.println();
//            System.out.println("Si desea terminar, introduzca 'FIN' ");
//            System.out.println();
//            System.out.println("----------------------------------------");
//            System.out.print("Nombre producto:");
//
//            comprobante=sc.next();
//            
//            if (comprobante.equalsIgnoreCase("fin") ) {
//                
//                break;
//
//            } else {
//
//                listaCompra.add(comprobante);
//
//            }
//
//        } while (true);
//
//        for (String listaProducto : listaCompra) {
//            
//            System.out.println(listaProducto);
//
//        }
//
//        System.out.println(" Introduce el nombre del producto deseado a eliminar:");
//        String comprobante = sc.next();
//        if (listaCompra.contains(comprobante)) {
//            System.out.println("--------------------------------------------------------------------------------");
//            System.out.println();
//            System.out.println(" El producto " + comprobante + " está en la lista.");
//            System.out.println(" eliminando");
//            for (int i = 5; i > 0; i--) {
//                System.out.print(".");
//            }
//            System.out.println();
//            System.out.println("Eliminado");
//            
//            System.out.println("--------------------------------------------------------------------------------");
//            System.out.println();
//        } else {
//
//            System.out.println("--------------------------------------------------------------------------------");
//            System.out.println();
//            System.out.println("El producto " + comprobante + " NO esta en la lista");
//            System.out.println();
//            System.out.println("--------------------------------------------------------------------------------");
//
//        }
//
//        System.out.println(" Introduce la posicion del producto deseado en la lista a eliminar:");
//        String comprobanteNum = sc.next();
//        if (listaCompra.contains(comprobanteNum)) {
//            System.out.println("--------------------------------------------------------------------------------");
//            System.out.println();
//            System.out.println(" El producto " + comprobanteNum + " está en la lista.");
//            System.out.println(" eliminando");
//            for (int i = 5; i > 0; i--) {
//                System.out.print(".");
//            }
//            System.out.println("--------------------------------------------------------------------------------");
//            System.out.println();
//        } else {
//
//            System.out.println("--------------------------------------------------------------------------------");
//            System.out.println();
//            System.out.println("El producto " + comprobanteNum + " NO esta en la lista");
//            System.out.println();
//            System.out.println("--------------------------------------------------------------------------------");
//
//        }
//
//    }
//
//}