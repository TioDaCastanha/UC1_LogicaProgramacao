package FuncoesProcedimentos;

import java.util.Scanner;

public class Procedimento {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        String nome;
        int matricula;

        System.out.print("Informe seu nome: ");
        nome = in.nextLine();
        System.out.print("Informe sua matrícula: ");
        matricula = in.nextInt();

        System.out.print(nome);
        pulaLinha();
        System.out.print(matricula);

    }

    public static void pulaLinha(){
        System.out.println(" ");
        System.out.println(" ");
    }

}
