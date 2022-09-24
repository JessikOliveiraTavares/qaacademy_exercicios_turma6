package exercicio_easy;
//Faça um algoritmo para ler três números inteiros, armazenar em variáveis, e exibir a soma, a subtração, multiplicação e a média dos três números digitados.

import javax.swing.*;

public class Exerc5 {
    public double digiteumnumero(double num1,double num2,double num3 ) {
        System.out.println("a soma dos numeros é " + (num1 + num2 + num3));
        System.out.println(" a multiplicacao dos numeros é" + (num1 * num2 * num3));
        System.out.println(" a subtracao dos numeros é" + (num1 - num2 - num3));
        System.out.println(" a medias dos valores é" + (num1 + num2 + num3) / 3);

        return num1 + num2 + num3;


    }
    }