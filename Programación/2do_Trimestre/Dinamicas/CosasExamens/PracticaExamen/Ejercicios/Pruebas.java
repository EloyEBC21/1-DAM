public class Pruebas{

    public static void main(String[] args){

        int[] Ordenar = {7,1,8,3,5,10};
        int auxiliar = 0;

        for (int l : Ordenar) {
            System.out.print(l + " ");
        }

        System.out.println();

        for (int j = 0; j < Ordenar.length; j++) {
           
            for (int i = 1; i < Ordenar.length; i++) {
            
                if (Ordenar[i-1]<Ordenar[i]) {
                    auxiliar=Ordenar[i-1];
                    Ordenar[i-1]=Ordenar[i];
                    Ordenar[i]=auxiliar;
                }
            
        }

        }

        for (int i : Ordenar) {
            System.out.print(i + " ");
        }

    }

}

