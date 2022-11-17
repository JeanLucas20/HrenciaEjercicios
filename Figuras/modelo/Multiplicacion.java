package modelo;

public class Multiplicacion extends Operación{
    // Constructor
    public Multiplicacion(double x, double y){
        super(x,y);
    }

    // Métodoss
    public void multiplicar(){
        resultado = x * y;
    }
}
