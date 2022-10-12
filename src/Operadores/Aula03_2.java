package Operadores;

import java.util.Scanner;

public class Aula03_2 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        float nota1, nota2, media;

        System.out.print("Informe nota 1: ");
        nota1 = in.nextFloat();

        System.out.print("Informe nota 2: ");
        nota2 = in.nextFloat();

        media = (nota1 + nota2)/2;

        if (media >= 7){
            System.out.print("Parabens você está Aprovado!!");
        }else if (media < 7 && media >= 5) {
            System.out.print("Você ficou de Recuperação!! Dê o seu Melhor");
        }else {
            System.out.print("Reprovado!! Tente Semestre que Vem.");
        }

    }

}
