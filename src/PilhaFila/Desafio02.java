package PilhaFila;

import javax.swing.*;

public class Desafio02 {
    public static void main(String[] args){
        int golsAdversario, golsBrasil, pontos = 0;

        for (int i = 0; i < 3; i++){
            golsBrasil = Integer.parseInt(JOptionPane.showInputDialog("Quantos gols nosso time Fez na partida "+ (i+1) + " :"));
            golsAdversario = Integer.parseInt(JOptionPane.showInputDialog("Quantos gols o time adversário Fez na partida "+ (i+1) + " :"));
            if (golsBrasil > golsAdversario){
                pontos += 3;
            } else if (golsBrasil < golsAdversario){
                pontos += 0;
            } else {
                pontos += 1;
            }
        }
        System.out.println("A Pontuação total do nosso time foi: "+ pontos);

    }
}
