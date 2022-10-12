package Operadores;

import javax.swing.*;
import java.util.Scanner;

public class ExamploSA2_2 {
    public static void main(String[] args){

        String nome;
        float peso, altura, imc;
        boolean pesoIdeal;

        peso = 0;
        altura = 0;
        imc = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("----Calculando o IMC----");
        System.out.println("");

        System.out.print("Digite seu nome: ");
        nome = in.nextLine();

        //Leitura dos inputs em Float com correção de caracter da , para o .
        peso = Float.parseFloat(JOptionPane.showInputDialog("Informe seu Peso: ").replace(',','.'));
        altura = Float.parseFloat(JOptionPane.showInputDialog("Informe sua Altura: ").replace(',','.'));

        imc = peso / (altura * altura);

        pesoIdeal = (imc >= 18.5 && imc <= 25);

        //Se o pesoIdeal for true entra na estrutura IF (sem a necessidade de adicionar operador relacional).
        if (pesoIdeal){
            System.out.printf("Parabéns %s você está no seu peso Ideal: %.2f", nome, imc);
        } else {
            System.out.printf("%s, você não está no seu peso ideal, procure um especialista!! Seu imc é %.2f", nome, imc);
        }

    }
}
