package Variaveis;

import javax.swing.*;

public class ExemploSA2 {
    public static void main(String[] args) {

        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro Número: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Segundo Numero: "));

        int result = n1 + n2;

        JOptionPane.showMessageDialog(null, "O Resultado é "+ result);
    }
}
