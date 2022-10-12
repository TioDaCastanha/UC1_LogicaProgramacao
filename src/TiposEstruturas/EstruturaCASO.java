package TiposEstruturas;

import java.util.Scanner;

public class EstruturaCASO {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int porta;

        System.out.println("----Casa dos Desesperados----");
        System.out.print("");

        System.out.print("Escolha uma porta de 1 a 5: ");
        porta = in.nextInt();

        //Sempre lembrar de inserir o break para interromper o switch.
        switch (porta) {
            case 1:
                System.out.println("Um Crocodilo apareceu e te devorou!!");
                break;
            case 2:
                System.out.println("Gorila na casa, tu virou refém!!");
                break;
            case 3:
                System.out.println("Vampiro doidão, Teu sangue sugou!!");
                break;
            case 4:
                System.out.println("Deu fuga!! Aproveita enquanto pode xD");
                break;
            case 5:
                System.out.println("Chama o Exorcista, tu foi possuído!!");
                break;
            default:
                System.out.println("Essa porta não existe!! Poupe nosso tempo :D");
                break;
        }

    }
}
