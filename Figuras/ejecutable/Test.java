package ejecutable;

import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

import modelo.Suma;

public class Test {
    public static void main(String[] args) {
        // Input
        double x = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer número: "));
        double y = Integer.parseInt(JOptionPane.showInputDialog("Digite un segundo número: "));

        // Processing
        Suma pSuma = new Suma(x, y);
        pSuma.sumar();
        JOptionPane.showMessageDialog(null, "La suma de: "+ x+ " y "+ y+ " es: "+ pSuma.mostrarResultado(), "Resultado", 1);
        System.exit(0);
    }
}
