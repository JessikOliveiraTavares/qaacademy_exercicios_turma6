package exercicio_easy;

import javax.swing.*;

//Faça um algoritmo para ler dois valores, armazenar em variáveis, e exibir os valores das variáveis, trocados.
public class Exec3 {
    public static void main(String[] args) {
//Declarar variáveis do tipo texto : nome, sobrenome;
        String nome, sobrenome;
        //nome = Ler(“Jessika”);
         nome= JOptionPane.showInputDialog("digite o nome");
        //sobrenome = Ler(“Oliveira”);
        sobrenome = JOptionPane.showInputDialog("digite o  sobrenome");

        //Exibir: “O nome é ” + sobrenome + nome;
        System.out.println("O nome é:" + sobrenome + nome);




    }
}

//Inicio Algoritmo
//Declarar variáveis do tipo texto : nome, sobrenome;
//nome = Ler(“Silas”);
//sobrenome = Ler(“Leão”);
//Exibir: “O nome é ” + sobrenome + nome;
