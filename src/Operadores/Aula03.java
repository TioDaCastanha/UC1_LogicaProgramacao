package Operadores;

import java.util.Scanner;

public class Aula03 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        String senha, verificarSenha;
        boolean resultado;

        verificarSenha = "Alan2022";

        System.out.print("Informe a Senha: ");
        senha = in.next();

        resultado = senha.equals(verificarSenha);

        System.out.print("Senha foi digitada corretamente? "+ resultado);

    }
}
