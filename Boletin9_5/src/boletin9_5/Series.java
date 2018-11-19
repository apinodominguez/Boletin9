package boletin9_5;

import javax.swing.JOptionPane;

public class Series {

    private double numElementos;
    private double fibonacci1 = 0;
    private double fibonacci2 = 1;
    
public double getElementos(){
    do{
        numElementos = Double.parseDouble(JOptionPane.showInputDialog("Introduce el numero de elementos de la serie"));
        if (numElementos <= 0){
            JOptionPane.showMessageDialog(null, "El numero de elementos de la serie no puede ser 0 o negativo");
        }
    }while(numElementos <=0);
    return numElementos;
}

public void seriePar(){
    for(int i = 1; i <= numElementos; i++){
        System.out.println(i*2);}
}

public void serieParImpar(){
    for(int i= 1; i <= numElementos; i++){
    if (i%2 == 0){
        System.out.println("+" +i);
    }
    else{
        System.out.print("-" +i);
    }
}
}

public void serieFibonacci(){
    for (int i = 0; i < numElementos; i++){
    if(i == 0)
      System.out.println("0,");
    else if(i == 1)
      System.out.println("1,");
    else{
        fibonacci2 = fibonacci2 + fibonacci1;
        fibonacci1 = fibonacci2 - fibonacci1;
        System.out.println(fibonacci2 + ",");
    }
}
}


}
