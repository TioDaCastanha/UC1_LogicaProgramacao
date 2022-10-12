package VetoresMatrizes;

import javax.swing.*;

public class Vetores {
    public static void main(String[] args){

        String[] livros = new String[5];
        int indice = 0;

        livros[0] = "O Senhor dos Aneis";
        livros[1] = "Harry Potter";
        livros[2] = "O Hobbit";
        livros[3] = "Narnia";
        livros[4] = "Eragon";

        indice = Integer.parseInt(JOptionPane.showInputDialog("Qual livro deseja pegar?"));
        JOptionPane.showMessageDialog(null, livros[indice]);

    }
}