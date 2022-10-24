package TiposEstruturas;

import javax.swing.*;

public class Recursividade {
    public static void main(String[] args){

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));
        System.out.println(fatorial(numero));

    }

    public static int fatorial (int numero){
        if (numero <= 2){
            return 2;
        }else {
            return numero * fatorial(numero - 1);
        }
    }


}
