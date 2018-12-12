package boletin9_6;

import javax.swing.JOptionPane;

public class SoldoEmpleados {
    
    private float soldoEmpregado;
    private int sueldoMedio;
    private float soldoMenor1000 = 0.0f;
    private float numEmpregados = 0.0f;
    private int salir;
    
    public void soldoEmpregado(){
        do{
           soldoEmpregado = Float.parseFloat(JOptionPane.showInputDialog("Introduce el sueldo del empregado: "));
           if (soldoEmpregado <= 0)
               JOptionPane.showMessageDialog(null, "Introduce una cantidad mayor que cero para continuar");
        }while(soldoEmpregado <= 0);    
    }
    
    public void bagajeSoldos(){
        do{
            soldoEmpregado();
            if (soldoEmpregado >= 1000 && soldoEmpregado <= 1750)
                sueldoMedio ++;
            else if(soldoEmpregado < 1000){
                soldoMenor1000 ++;
            }
            numEmpregados++;    
            salir = Integer.parseInt(JOptionPane.showInputDialog("Introduce un 0 para salir del programa. Cualquier otro numero para continuar"));
        }while(salir != 0);
        JOptionPane.showMessageDialog(null,"Hay " +sueldoMedio+ " empregados que cobran un soldo entre os 1000 e os 1760€."
                + "\nAdemas, hay un " + soldoMenor1000/numEmpregados*100 + "% dos empregados que cobran menos de 1000€" );
        
    }
    
}
