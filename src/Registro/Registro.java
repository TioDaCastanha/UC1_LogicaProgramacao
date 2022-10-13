package Registro;

public class Registro {
    public static void main(String[] args){

        Produto produto = new Produto();

        produto.numero = 1;
        produto.nome = "Ventilador";
        produto.valor = 125;

        System.out.println("Código do produto: "+ produto.numero);
        System.out.println("Nome do Produto: "+ produto.nome);
        System.out.println("Valor do Produto: "+ produto.valor);

    }

    public static class Produto {

        private int numero;
        private String nome;
        private float valor;

    }
}
