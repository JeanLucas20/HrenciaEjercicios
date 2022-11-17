package modelo;

public class Suma extends Operación{
    // Constructor
    public Suma(double x, double y){
        super(x,y);
    }

    // Métodos
    public void sumar(){
        resultado = x + y;
    }
}
