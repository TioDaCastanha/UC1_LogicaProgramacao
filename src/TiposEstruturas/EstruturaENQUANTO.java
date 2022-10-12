package TiposEstruturas;

import java.util.Scanner;

public class EstruturaENQUANTO {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int metros = 0;
        int numero;

        System.out.println("---Programa do Robozineo---");
        System.out.print("Digite 1 para o Robo andar!! ");
        numero = in.nextInt();

        while(numero == 1){
            metros = metros + 1;
            System.out.printf("Robo andou %d metros\n", metros);
            System.out.print("Digite 1 para o robo continuar andando!! ");
            numero = in.nextInt();
        }

        System.out.println("Encerrando as funções do robôzineo!! Adeus.");

    }
}
