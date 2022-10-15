package FuncoesProcedimentos;

import java.util.Scanner;

public class Ex01Funcao {

    private static String nome;
    private static String sobrenome;

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Informe o nome: ");
        nome = in.nextLine();
        System.out.print("Informe o sobrenome: ");
        sobrenome = in.nextLine();

        juntar();

    }

    public static void juntar() {
        String juntar = nome + " " + sobrenome;
        System.out.println(juntar);
    }
}
