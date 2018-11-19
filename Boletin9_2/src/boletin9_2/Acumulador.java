package boletin9_2;

import javax.swing.JOptionPane;

public class Acumulador {

public void calcularSumaMultiplicacion(){
    double sumas = 0, multiplicacion = 1;
    for (int i = 10; i<= 90; i++){
        sumas = sumas + i;
        multiplicacion = multiplicacion * i;
    }
    JOptionPane.showMessageDialog(null,"El valor de la suma de los numeros entre 10 y 90 es: " +sumas+ "\ny el valor de la multiplicacion es: " +multiplicacion);
}    
}
