package Operadores;

import java.util.Scanner;

public class Aula03_01 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        float nota;
        int falta;
        boolean aprovado;

        System.out.print("Informe a Nota final o Aluno: ");
        nota = in.nextFloat();

        System.out.print("Informe a Quantidade de Faltas: ");
        falta = in.nextInt();

        aprovado = nota >= 7.0 && falta <= 2;

        System.out.print("Aluno foi aprovado? "+aprovado);

    }
}
