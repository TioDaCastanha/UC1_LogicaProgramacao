package VetoresMatrizes;

import javax.swing.*;

public class ExMatrizes {
    public static void main(String[] args){

        String[][] livros = new String[2][3];

        for (int linha = 0; linha < 2; linha++){
            for (int coluna = 0; coluna < 3; coluna++){
                livros[linha][coluna] = JOptionPane.showInputDialog("Livro L"+ (linha+1)+ " C"+ (coluna+1));
            }
        }

        for (int linha = 0; linha < 2; linha++){
            for (int coluna = 0; coluna < 3; coluna++){
                System.out.println(livros[linha][coluna]);
            }
        }
    }
}
