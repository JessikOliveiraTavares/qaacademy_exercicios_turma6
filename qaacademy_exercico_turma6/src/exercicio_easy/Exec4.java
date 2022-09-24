package exercicio_easy;

import javax.swing.*;

//Faça um algoritmo para ler um número inteiro,
//armazenar em uma variável, calcular o dobro, e exibir.
public class Exec4 {
    public static void main(String[] args) {
//Declarar variável do tipo numérico : num1, result;

        int num1;
        int result;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));
        //    result= num1*2;
        result = num1*2;
        //Exibir: “O dobro é: ” + result;
        System.out.println("o dobro é:" +result);




    }
}
 //Inicio Algoritmo
//Declarar variável do tipo numérico : num1, result;
//num1 = Ler(6);
//result= num1*2;
//Exibir: “O dobro é: ” + result;
//Fim Algoritmo