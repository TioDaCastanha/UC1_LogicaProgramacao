package PilhaFila;

import java.util.LinkedList;
import java.util.Queue;

public class fila {
    public static void main(String[] args){

        Queue<String> fila = new LinkedList<>();

        fila.add("Verde");
        fila.add("Azul");
        fila.add("Laranja");
        fila.add("Vermelho");

        System.out.println(fila);

        //Pode se usar o .peek, .element ou .poll

        //peek retorna null e element da exception se a lista estiver vazia mas não removem o primeiro elemento.
        System.out.println("Atendimento com Peek/Element: "+ fila.peek());

        System.out.println(fila);

        //Pool remove o primeiro elemento e mostra.
        System.out.println("Atendimento com Pool: "+ fila.poll());

        System.out.println(fila);

        System.out.println("Atendimento com Pool: "+ fila.poll());

        System.out.println(fila);
    }

}
