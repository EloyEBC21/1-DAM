public class Cafetera {

    int capMax, cantAct;

    public Cafetera(){ 
        /* Constructor Base para definir la capaciad Máxima y cantidad Actual */
        this.capMax = 1000;
        this.cantAct= 50;
    }

    public Cafetera(int capMax){
        this.cantAct=capMax; 
        this.capMax=capMax;
    }

    public Cafetera(int capMax, int cantAct){

        if (cantAct > capMax){
            this.cantAct=capMax;
            this.capMax=cantAct;
        } else {
            this.cantAct=cantAct;
            this.capMax = capMax;
        }

    }
    
    public int getCapMax() {
        return capMax;
    }

    public void setCapMax(int capMax) {
        this.capMax = capMax;
    }

    public int getCantAct() {
        return cantAct;
    }

    public void setCantAct(int cantAct) {
        this.cantAct = cantAct;
    }

    public void llenarCafetera(){ 
        this.cantAct = capMax;
    }

    public void servirTaza(int cantidad){
        this.cantAct -= cantidad;
    }

    public void vaciarCafetera(){
        this.cantAct = 0;
    }

    public void agregarCafe(int cantidad){
        this.cantAct += cantidad;
    }

}