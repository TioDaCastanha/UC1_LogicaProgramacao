package VetoresMatrizes;

import javax.swing.*;

public class ExVetores {
    public static void main(String[] args){

        String[] livros = new String[5];

        for (int i = 0; i < livros.length; i++){
            livros[i] = JOptionPane.showInputDialog("Informe o Título do Livro:");
        }

        for (int i = 0; i < livros.length; i++){
            JOptionPane.showMessageDialog(null, livros[i]);
        }


    }
}
