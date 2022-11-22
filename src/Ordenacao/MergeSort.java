package Ordenacao;

import javax.swing.*;
import java.util.Arrays;
import java.util.Random;

public class MergeSort {
    static Random random = new Random();

    public static void main(String[] args) {

        int[] lista = new int[random.nextInt(21)];

        preencherLista(lista, lista.length);
        mergeSort(lista,0, lista.length);

    }

    static void mergeSort(int[] lista, int inicio, int fim){
        if (inicio < fim - 1){
            int meio = (fim + inicio)/2;
            mergeSort(lista, inicio, meio);
            mergeSort(lista, meio, fim);
            ordenar(lista, inicio, meio, fim);
            System.out.println(Arrays.toString(lista));
        }
    }

    static void ordenar (int[] lista, int inicio, int meio, int fim){
        int[] novaLista = new int [fim - inicio];
        int indiceLeft = inicio;
        int indiceRight = meio;
        int cont = 0;


        while(indiceLeft < meio && indiceRight < fim){

            if(lista[indiceLeft] <= lista[indiceRight]){
                novaLista[cont] = lista[indiceLeft];
                cont++;
                indiceLeft++;
            }else {
                novaLista[cont] = lista[indiceRight];
                cont++;
                indiceRight++;
            }
        }


        while (indiceLeft < meio) {
            novaLista[cont] = lista[indiceLeft];
            cont++;
            indiceLeft++;
        }


        while(indiceRight < fim){
            novaLista[cont] = lista[indiceRight];
            cont++;
            indiceRight++;
        }

        for(cont = 0, indiceLeft = inicio; indiceLeft < fim; indiceLeft++, cont++){
            lista[indiceLeft] = novaLista[cont];
        }

    }

    public static void preencherLista(int[] lista, int size) {

        for (int i = 0; i < size; i++){
            lista[i] = random.nextInt(101);
        }

        JOptionPane.showMessageDialog(null,"Lista Preenchida com Sucesso!!");
    }

}
