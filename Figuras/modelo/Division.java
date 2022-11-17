package modelo;

public class Division extends Operación{
    // Constructor
    public Division(double x, double y){
        super(x,y);
    }

    // Métodoss
    public void dividir(){
        resultado = x / y;
    }
}
