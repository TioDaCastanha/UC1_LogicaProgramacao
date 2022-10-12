package PilhaFila;

import java.util.LinkedList;
import java.util.Queue;

public class fila {
    public static void main(String[] args){

        Queue<String> fila = new LinkedList<String>();

        fila.add("Verde");
        fila.add("Azul");
        fila.add("Laranja");
        fila.add("Vermelho");

        System.out.println(fila);

        //Pode se usar o .peek ou .element (peek retorna null e element da exception se a lista estiver vazia).
        System.out.println("Atendimento: "+ fila.element());
    }

}
