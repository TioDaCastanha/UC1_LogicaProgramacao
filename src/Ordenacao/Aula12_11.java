package Ordenacao;

import java.util.ArrayList;

public class Aula12_11 {
    static ArrayList<Integer> lista = new ArrayList<>();
    static int troca = 0;

    public static void main(String[] args) {

        lista.add(15);
        lista.add(4);
        lista.add(10);
        lista.add(2);
        lista.add(20);

        for (int i = 0; i < lista.size(); i++){
            ordenar(lista.size() - 1);
        }

        System.out.print(lista);

    }

    public static Integer ordenar(int i){
        if (i == 0){
            return verificar(troca, i);
       }else {
            return verificar(troca, ordenar(i - 1));
       }
    }

   public static Integer verificar(int troca, int i){
        if (i + 1 < lista.size()) {
            if (lista.get(i) > lista.get(i + 1)) {
                troca = lista.get(i);
                lista.set(i, lista.get(i + 1));
                lista.set(i + 1, troca);
                return i + 1;
            } else {
                return i + 1;
            }
        } else {
            return i;
        }

    }

}
