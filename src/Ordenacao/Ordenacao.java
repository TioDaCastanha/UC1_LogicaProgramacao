package Ordenacao;

import java.util.ArrayList;
import java.util.Collections;

public class Ordenacao {
    public static void main(String[] args){

        ArrayList<String> diario = new ArrayList<>();
        ArrayList<Integer> dias = new ArrayList<>();

        diario.add("Maria");
        diario.add("João");
        diario.add("André");
        diario.add("Henrique");
        diario.add("Bruno");
        diario.add("Gabriela");

        //Lista Sem ordenação
        System.out.println(diario);

        //Classe Collections para Ordenação
        Collections.sort(diario);

        //Lista ordenada
        System.out.println(diario);

        dias.add(10);
        dias.add(6);
        dias.add(3);
        dias.add(12);
        dias.add(1);
        dias.add(5);

        System.out.println(dias);

        Collections.sort(dias);

        System.out.println(dias);

    }
}
