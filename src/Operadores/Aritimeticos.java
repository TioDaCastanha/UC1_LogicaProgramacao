package Operadores;

public class Aritimeticos {
    public static void main(String[] args){

        int x, y;
        double r;

        x = 3;
        y = 2;
        r = 0;

        r = x + y;
        System.out.println("Soma: "+ r);

        r = x - y;
        System.out.println("Subtração: "+ r);

        r = x * y;
        System.out.println("Multiplicação: "+ r);

        //Divisão entre inteiro resulta em um inteiro, sem o cast o resultado seria 1 com o cast resultado é 1,5
        r = (float)x / y;
        System.out.println("Divisão: "+ r);

        r = x % y;
        System.out.println("Resto: "+ r);


    }
}
