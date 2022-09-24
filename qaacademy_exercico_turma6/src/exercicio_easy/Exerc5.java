package exercicio_easy;
//Faça um algoritmo para ler três números inteiros, armazenar em variáveis, e exibir a soma, a subtração, multiplicação e a média dos três números digitados.

import javax.swing.*;

public class Exerc5 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        int media;
        int soma;
        int subtracao;
        int multiplicao;

        num1 = Integer.parseInt(JOptionPane.showInputDialog(("digite um numero")));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));
        soma = num1 + num2 + num3;
        subtracao = num1 - num2 - num3;
        multiplicao = num1 * num2 * num3;

        media = soma / 3;
        System.out.println("a soma é  " + soma);
        System.out.println("a subtracao é " + subtracao);
        System.out.println("a multiplicacao é " + multiplicao);
        System.out.println("a média é " + media);
    }}
//multiplicacao = numero1 * numero2 * numero3;
//media = soma / 3;
//Exibir: “A soma dos números digitados é: ”+soma;
//Exibir: “A subtração dos números digitados é: ”+ subtração;
//Exibir: “A multiplicacaodos números digitados é: ” +multiplicacao;
//Exibir: “A media dos números digitados é: ” +media;