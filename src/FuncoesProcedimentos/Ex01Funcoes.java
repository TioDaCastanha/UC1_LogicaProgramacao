package FuncoesProcedimentos;

public class Ex01Funcoes {

    public static void main(String[] args){
        Aluno a = new Aluno();

        a.adicionar("João",10.0, 9.5, 8.9);
        System.out.println("Média: " + a.calcularMedia());
    }

    public static class Aluno {
        //Variáveis
        String nome;
        double nota1, nota2, nota3;

        //Procedimento
        void adicionar(String nomeAluno, double n1, double n2, double n3){
            nome = nomeAluno;
            nota1 = n1;
            nota2 = n2;
            nota3 = n3;
        }

        //Função
        double calcularMedia(){
            return (nota1 + nota2 + nota3) / 3;
        }
    }
}

