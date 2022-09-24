package ExercicioMedio;

import javax.swing.*;

public class Exerc2{
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







//Declarar Variavel do tipo numerica: valorInvestimento,
//taxaJuros = 0.05, valorJuros, valorTotal, i =1, valorJuros;
//valorInvestimento = Ler (“1000,00”);
//valorTotal = valorInvestimento;
//
//Enquanto (i<=10)
//valorTotal = (valorTotal*taxaJuros) +valorTotal;
//i=i+1; //i++
//Fim Enquanto
//
//valorJuros = valorTotal - valorInvestimento;
//
//Exibir: “Você investiu: ”+valorInvestimento;
//Exibir: “Rendeu : ”+valorJuros + “de Juros”;
//Exibir: “O Valor total são : ”+valorTotal;