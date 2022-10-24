package TiposEstruturas;

import javax.swing.*;

public class ExFibonacci {
    public static void main(String[] args){

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));
        System.out.println(fibonacci(numero));

    }

    public static int fibonacci (int numero){
        if (numero <= 1){
            return numero;
        }else{
            return fibonacci(numero - 1) + fibonacci(numero - 2);
        }
    }

}

