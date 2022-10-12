package Variaveis;

import javax.swing.*;

public class Atividade02 {
    public static void main(String[] args) {

        float n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a 1ª Nota: "));
        float n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a 2ª Nota: "));
        float n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite a 3ª Nota: "));

        float media = (n1+n2+n3)/3;

        JOptionPane.showMessageDialog(null, "A sua média é: "+media);
    }
}
