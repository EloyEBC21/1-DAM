public class Fraccion{

    int numerador, denominador;

    /* Constructores */

    public Fraccion(int numerador , int denominador){
        this.numerador=numerador;
        this.denominador=denominador;
    }
 
    /* Getters y Setters */

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    /* Métodos */

    public void Invertir(){
        int ayudante = denominador;
        this.denominador = numerador;
        this.numerador = ayudante;
    }

    public void Simplificar() {
    /* Empezamos probando con el primer número primo: el 2 */
    int i = 2;

    /* Intentamos dividir hasta que el divisor sea mayor que los números de la fracción */
    while (i <= numerador && i <= denominador) {
        
        /* Si ambos números se pueden dividir por 'i', lo hacemos */
        if (numerador % i == 0 && denominador % i == 0) {
            numerador = numerador / i;
            denominador = denominador / i;
            /* No aumentamos 'i' porque el mismo número podría servir de nuevo */
        } else {
            /* Si no divide a ambos, pasamos al siguiente número */
            i++;
        }
    }
}

    public void Multiplicar(int NewDenominador, int NewNumerador){

        int OldDenominador = this.denominador;
        int OldNumerador = this.numerador;

        OldDenominador=this.denominador*NewDenominador;
        OldNumerador=this.numerador*NewNumerador;

        System.out.println();
        System.out.println(" " + OldNumerador + " ");
        System.out.println("---------");
        System.out.println(" " + OldDenominador + " ");
        System.out.println();

    }

    public void Dividir(int NewDenominador, int NewNumerador){

        int OldDenominador = this.denominador;
        int OldNumerador = this.numerador;

        OldDenominador=this.denominador/NewNumerador;
        OldNumerador=this.numerador/NewDenominador;

        System.out.println();
        System.out.println(" " + OldNumerador + " ");
        System.out.println("---------");
        System.out.println(" " + OldDenominador + " ");
        System.out.println();

    }

    public String toString(){
        return numerador + " / " + denominador
        ;
    }

}