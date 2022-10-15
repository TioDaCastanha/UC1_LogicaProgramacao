package FuncoesProcedimentos;

import java.util.Scanner;

public class Ex02Funcao {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args){

        velocidade_media(1,50,2);
        velocidade_media(2, 100, 3);
        velocidade_media(3, 80, 4);

    }

    public static void velocidade_media(int volta,int distancia, int tempo){
        float velocidade = (float) distancia / tempo;
        System.out.println("A velocidade média da "+ volta+"ª  é: " + velocidade +"Km/h");

    }

}
