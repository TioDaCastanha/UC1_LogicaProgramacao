package PilhaFila;

import javax.swing.*;

public class Desafio {
    public static void main(String[] args){
        String nome, login;
        boolean cadastro;

        nome = JOptionPane.showInputDialog("Cadastre seu Nome: ").toUpperCase();
        JOptionPane.showMessageDialog(null, "Olá "+ nome);

        do {
            login = JOptionPane.showInputDialog("Cadastre seu login: ");

            if (login.length() >= 1 && login.length() <= 10) {
                JOptionPane.showMessageDialog(null, "Login Cadastrado com Sucesso!!");
                cadastro = false;
            } else {
                JOptionPane.showMessageDialog(null, "Login incorreto, seu login deve ter entre 1 e 10 caracteres!");
                cadastro = true;
            }
        }while(cadastro);

    }
}
