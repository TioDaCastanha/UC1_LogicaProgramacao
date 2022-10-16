package FuncoesProcedimentos;

public class Funcao {

    public static void main(String[] args){
        Calculo calculo = new Calculo();

        System.out.println("Soma: " + calculo.soma(10,20));
        System.out.println("Divisão: " + calculo.divisao(100, 25));

    }


    public static class Calculo {

        int soma(int x, int y) {
            return x + y;
        }

        double divisao(int x, int y) {
            return (double) x / y;
        }

    }
}
