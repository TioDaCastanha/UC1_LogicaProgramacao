package FuncoesProcedimentos;

import java.util.Scanner;

public class FuncaoComParametros {

    private static int velocidade;
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args){

        int distancia, tempo;

        System.out.println("Informe a distância: ");
        distancia = in.nextInt();
        System.out.println("Informe o tempo: ");
        tempo = in.nextInt();

        velocidade_media(distancia, tempo);

    }

    public static void velocidade_media(int distancia, int tempo){
        velocidade = distancia /tempo;
        System.out.println("A velocidade é: " + velocidade+"Km/h");

    }

}
