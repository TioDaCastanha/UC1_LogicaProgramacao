package Operadores;

public class Logico {
    public static void main(String[] args){

        /*

        int idade;
        boolean adulto;

        idade = 19;

        //Condicional E (&&) só é verdadeiro quando as duas operações dão verdadeiro
        adulto = ((idade >= 18) && (idade <= 65));
        System.out.println("Você é um adulto? "+ adulto);


        int dia;
        boolean fome;
        boolean pedirPizza;

        fome = true;
        dia = 2;

        //Condicional OU (||) para ser verdadeiro basta uma das operações ser verdadeira
        pedirPizza = ((fome == true) || (dia > 5));
        System.out.println("Partiu Pizza? "+ pedirPizza);

        */

        boolean quer;
        boolean doContra;

        quer = true;

        //Condicional NÃO (!) Inverte resultado. Se verdadeiro vira falso e vice versa
        doContra = !quer;

        System.out.println("Você quer sair? "+ doContra);


    }
}
