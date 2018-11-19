package boletin9_3;

import javax.swing.JOptionPane;

public class AreaTriangulo {
    
    private double base;
    private double altura;
    
    public double getBase(){
        do{
        base = Double.parseDouble(JOptionPane.showInputDialog("Introduce la base del triangulo"));
        if (base < 0)
            JOptionPane.showMessageDialog(null, "La base no puede ser negativa");
        }while (base < 0);
        return base;
    }
    
    public double getAltura(){
        do{
        altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce la base del triangulo"));
        if (altura < 0)
            JOptionPane.showMessageDialog(null, "La base no puede ser negativa");
        }while (altura < 0);
        return altura;
    }
    
    public void calcularTriangulo(){
        getAltura(); getBase(); 
        double area = base * altura / 2;
        JOptionPane.showMessageDialog(null, "El area del triangulo es de: " +area+ "m²");
    }
}
