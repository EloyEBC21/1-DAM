import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;
public class EDLinkedList{
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

    }

}
//Continúa en la siguiente hoja