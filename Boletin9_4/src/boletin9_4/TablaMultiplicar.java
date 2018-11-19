package boletin9_4;
import javax.swing.JOptionPane;

public class TablaMultiplicar {
    
    private double num;
    
    public void calcularTablaMultiplicar(){
        do{
            num = Double.parseDouble(JOptionPane.showInputDialog("Introduce un numero \nPulsa 0 para salir"));
            if(num != 0){
              for(int i=1; i <= 10; i++){
                  System.out.print(num*i);
              }System.out.print("\n");
            }
            
        }while(num != 0);
        }
}
