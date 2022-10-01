package exercicio_easy;


//Declarar variavel do tipo numerica: valorInvestimento, taxajuros, valorJuros, valorTotal;

public class Exerc10 {
    public String calcularinvestimento(double investimento) {
        double taxa = 0.05, valor = 0, valorTotal = 0;
        int i = 1;
        while (i <= 10) {
            valor = investimento * taxa + valor;
            i = i + 1;

        }
        return "Valor dos Juros" + valor+ "valor investimento" + investimento + "valor total " + (valor + investimento);

    }
        }


//
//public class exerc10 {
//    public static void main(String[] args) {
//        double investimento, taxa = 0.05, valor = 0, valorTotal = 0;
//        int i = 1;
//
//        investimento = Double.parseDouble(JOptionPane.showInputDialog("digite o valor de investimeno"));
//        while (i <= 10) {
//            valor = investimento * taxa + valor;
//            i = i + 1;
//        }
//        System.out.println(("Valor dos Juros" + "Valor"));
//        System.out.println("valor investimento" + "investimeno");
//        System.out.println("valor total " + ("valor + investimento"));
//    }

