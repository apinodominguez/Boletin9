package boletin9_1;

import javax.swing.JOptionPane;

public class ConjuntoNumeros {
    
//    private short i;
//    private short positivos = 0;
//    private short negativos = 0;
//    private short ceros = 0;
    
    public void calcularConjuntoNumeros(){
        short positivos =0,negativos =0,ceros=0;
        for (int i = 0; i < 10; i++){
            double num = Double.parseDouble(JOptionPane.showInputDialog("Introduce un numero"));
            if (num > 0){
             positivos ++;
            }
            else if (num < 0){
            negativos ++;
            }
            else{
             ceros ++;
            }
        }
        JOptionPane.showMessageDialog(null,"Hay " +positivos+ " numeros positivos, " +negativos+ " numeros negativos y " +ceros+ " ceros");
    }
    
}
