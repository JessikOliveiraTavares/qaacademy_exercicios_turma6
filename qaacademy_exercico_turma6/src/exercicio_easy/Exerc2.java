package exercicio_easy;

import javax.swing.*;
import java.awt.*;

//faça um algoritimo para ler e ixibir uma palavra
public class Exerc2 {
    public static void main(String[] args) {
        //Declarar variável do tipo texto varPalavra;
        String palavra;
        //Palavra = Ler (“Curso”);
        palavra = JOptionPane.showInputDialog("digite sua palavra aqui!");
        //Exibir: “A palavra é: ” + varPalavra;
        System.out.println("A Palavra é:" + palavra);
    }
}

//Inicio do algoritmo
//Declarar variável do tipo texto varPalavra;
//varPalavra = Ler (“Curso”);
//Exibir: “A palavra é: ” + varPalavra;
//Fim do algoritmo
