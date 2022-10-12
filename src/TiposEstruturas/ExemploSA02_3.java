package TiposEstruturas;

import java.util.Scanner;

public class ExemploSA02_3 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int tipoa, tipob, tipoc,desconhecido, quantidade;

        //Contadores precisam ser inicializados com 0.
        tipoa = 0;
        tipob = 0;
        tipoc = 0;
        desconhecido = 0;

        System.out.println("----Controle de Peças----");
        System.out.println("");

        System.out.print("Informe quantas peças serão inseridas: ");
        quantidade = in.nextInt();

        //Loop para a quantidade de peças que vão ser inseridas
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Informe o Tipo de peça: ");

            //Seletor de tipos
            switch (in.nextInt()){
                case 1:
                    tipoa = tipoa + 1;
                    break;
                case 2:
                    tipob = tipob + 1;
                    break;
                case 3:
                    tipoc = tipoc + 1;
                    break;
                default:
                    desconhecido = desconhecido + 1;
                    break;
            }
        }

        System.out.println("---Fim da Contagem---");
        System.out.println("Confira Abaixo o Resultado Final!");
        System.out.printf("Total de peças Tipo A: %d\n", tipoa);
        System.out.printf("Total de peças Tipo B: %d\n", tipob);
        System.out.printf("Total de peças Tipo C: %d\n", tipoc);
        System.out.printf("Peças sem Categoria no Sistema: %d", desconhecido);

    }
}
