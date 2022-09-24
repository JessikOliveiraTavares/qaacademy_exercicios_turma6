package exercicio_easy;

import javax.swing.*;

public class Exerc6 {  //inicio da clase
    public static void main(String[] args) {
int nota1;
int nota2;
int media;
int soma;


nota1 = Integer.parseInt(JOptionPane.showInputDialog("digite uma nota"));
        nota1 = Integer.parseInt(JOptionPane.showInputDialog("digite uma nota"));
        nota2 = Integer.parseInt(JOptionPane.showInputDialog("digite uma nota"));
        soma = nota1 +nota2;
        media = (nota1+nota2)/2;
        if (media >5){

            System.out.println("Aprovado");
        }
        if (media >5){

            
            System.out.println("reprovado");
        }
        if (media == 5) {
            System.out.println("Exame");
        }


    }
}




//Início Algoritmo
//        Declarar variavel do tipo número: nota1,nota2,media;
//        nota1= Ler (6)
//        nota2= Ler (8)
//        media = (nota1+nota2) / 2;
//       Se (média > 5)
//                   Exibir na tela Aprovado;
//       Fim Se
//       Se (média < 5)
//                   Exibir na tela Reprovado;
//       Fim Se
//       Se (média == 5)
//                  Exibir na tela Exame;
//       Fim Se
//Fim Algoritmo