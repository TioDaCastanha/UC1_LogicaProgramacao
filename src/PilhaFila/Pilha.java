package PilhaFila;

import java.util.Stack;

public class Pilha {
    public static void main(String[] args){

        Stack<String> pilha = new Stack<>();

        //Pode se usar .push ou .addElement
        pilha.push("Verde");
        pilha.push("Azul");
        pilha.push("Laranja");

        System.out.println(pilha);

        System.out.println(pilha.peek());

        System.out.println(pilha);
        //.peek só mostra e .pop mostra e remove o topo.
        System.out.println(pilha.pop());

        System.out.println(pilha);
    }
}
