package TiposEstruturas;

import javax.swing.*;

public class ExemploSomaPares {
    public static void main(String[] args){

        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        System.out.println(somaPares(num));

    }

    //Função Recursiva para a Soma dos Pares antecessores de um numero
    public static int somaPares (int num) {
        if (num == 0){
            return 0;
        }else if (num % 2 == 0){
            return num + somaPares(num - 1);
        }else {
            return somaPares(num - 1);
        }
    }

}
