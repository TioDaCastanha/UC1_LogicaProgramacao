package Busca;

import java.util.ArrayList;
import java.util.Random;

public class Busca {
    public static void main(String[] args){

        ArrayList<String> corTeste = new ArrayList<>();
        Random random = new Random();
        ArrayList<Boolean> verificaTeste = new ArrayList<>();
        ArrayList<Integer> testeDescartado = new ArrayList<>();

        //Adiciona as cores a randomicamente a lista
        for (int i = 0; i < 12; i++){
            if(random.nextInt(2) == 1){
                corTeste.add("Verde");
            }else{
                corTeste.add("Vermelho");
            }
        }

        //Verifica quais posições atenderam a condição
        for (int i = 0; i < corTeste.size(); i++){
            if(corTeste.get(i).equals("Verde")){
                verificaTeste.add(true);
            }else{
                verificaTeste.add(false);
            }
        }

        //Armazena a posição dos testes Falsos
        for (int i = 0; i < verificaTeste.size(); i++){
            if (verificaTeste.get(i) == false){
                testeDescartado.add(i);
            }
        }

        //Exibe a Lista das Cores
        System.out.println(corTeste);

        //Exibe os Descartados
        System.out.println("\nTestes Descartados: "+ testeDescartado);

    }
}
