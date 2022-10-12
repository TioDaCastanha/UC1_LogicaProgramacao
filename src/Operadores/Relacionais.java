package Operadores;

public class Relacionais {
    public static void main(String[] args){

        int x, y;
        boolean r;

        x = 3;
        y = 3;

        r = x > y;
        System.out.println("X é maior que Y? "+ r);

        r = x < y;
        System.out.println("X é menor que Y? "+ r);

        r = x == y;
        System.out.println("X é igual a Y? "+ r);

        r = x <= y;
        System.out.println("X é menor ou igual a Y? "+ r);

        r = x >= y;
        System.out.println("X é maior ou igual a Y? "+ r);

        r = x != y;
        System.out.println("X é diferente de Y? "+ r);


    }
}
