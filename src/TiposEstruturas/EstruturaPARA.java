package TiposEstruturas;

import javax.swing.*;
import java.util.Scanner;

public class EstruturaPARA {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int quantidade;
        int i;

        System.out.print("Digite um valor: ");
        quantidade = in.nextInt();

        //Indice do For pode ser criado e inicializado dentro da estrutura. Se criado dentro da estrutura ao fim da execução da estrutura ela é eliminada, se criada fora ela é persinstente até o fim da execução do programa.
        for (i = 0;i <= quantidade; i++) {
            System.out.printf("Bom dia pela %d ª vez!!\n", i);
        }

    }
}
