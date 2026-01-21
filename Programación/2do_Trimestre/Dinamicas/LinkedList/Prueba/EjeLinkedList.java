import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;
public class EjeLinkedList{
    public static void main (String[] args){
    
            //Creamos LinkedList
    
        LinkedList<String> meses = new LinkedList<String>();
    
        //Añadimos los elementos
    
        meses.add("Enero"); meses.add("Febrero"); meses.add("Marzo");
        meses.add("Abril"); meses.add("Mayo"); meses.add("Junio");
        meses.add("Julio"); meses.add("Agosto"); meses.add("Septiembre");
        meses.add("Octubre"); meses.add("Noviembre"); meses.add("Diciembre");
    
        //Iteramos la estructura con Iterator
    
        Iterator<String> itll = meses.iterator();
    
        while (itll.hasNext()){
    
            System.out.println(itll.next()); 
        
        }

        //Obtenemos el primer mes, el último y el del medio

            System.out.printf("El primer mes es %s\n",meses.getFirst());

        System.out.printf("El ultimo mes es %s\n",meses.getLast());

        System.out.printf("El mes del medio es %s\n", meses.get(meses.size()/2));

        //Ordenamos

        Collections.sort(meses);

        //Iteramos la estructura con foreach

        for (String mes : meses) {

            System.out.println(mes);

        }

    }
}