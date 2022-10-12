package TiposEstruturas;

import java.util.Scanner;

public class EstruturaSE {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int idade;

        System.out.print("Informe sua idade: ");
        idade = in.nextInt();

        // Else if

        if (idade < 13){
            System.out.println("Dirija-se a Sala das Crianças");
        }else
            if (idade >= 13 && idade < 18){
                System.out.println("Dirija-se a Sala dos Adolecentes");
            }else
                if (idade >= 18 && idade < 65){
                    System.out.println("Dirija-se a Sala dos Adultos");
                }else {
                    System.out.println("Dirija-se a Sala dos Idosos");
                }

    }
}
