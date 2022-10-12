package TiposEstruturas;

import java.util.Locale;
import java.util.Scanner;

public class ExemploSA02_4 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        String resposta;
        boolean semChuva = true, comDinheiro = true;

        System.out.println("---Cheklist para Diversão---");
        System.out.println("");

        while(semChuva == true && comDinheiro == true){

            System.out.print("Está chovendo? S ou N: ");
            resposta = in.nextLine();

            //Para comparar conteúdo de uma Variável string usar o equalIgnoreCase
            if (resposta.equalsIgnoreCase("s")){
                System.out.println("Começou a chover, vamos embora!!");
                semChuva = false;
            }else {
                System.out.println("Ainda temos dinheiro? S ou N: ");
                resposta = in.nextLine();
                if (resposta.equalsIgnoreCase("n")){
                    System.out.println("Dinheiro Acabou e a Diversão Também!!");
                    comDinheiro = false;
                }
            }
        }


    }
}
