package exercicio_easy;

import javax.swing.*;

//Declarar variavel do tipo numerica: valorInvestimento, taxajuros, valorJuros, valorTotal;

public class exerc10 {
    public static void main(String[] args) {
        double investimento, taxa = 0.05, valor = 0, valorTotal = 0;
        int i = 1;

        investimento = Double.parseDouble(JOptionPane.showInputDialog("digite o valor de investimeno"));
        while (i <= 10) {
            valor = investimento * taxa + valor;
            i = i + 1;
        }
        System.out.println(("Valor dos Juros" + "Valor"));
        System.out.println("valor investimento" + "investimeno");
        System.out.println("valor total " + ("valor + investimento"));
    }

        }
