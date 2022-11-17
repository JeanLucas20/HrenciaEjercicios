package modelo;

public class Resta extends Operación{
    // Constructor
    public Resta(double x, double y){
        super(x,y);
    }

    // Métodoss
    public void restar(){
        resultado = x - y;
    }
}
