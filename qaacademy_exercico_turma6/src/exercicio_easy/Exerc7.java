package exercicio_easy;


public class Exerc7 {

    public String calcularinss(double salario) {
        double inss;
        if (salario <= 1045.00) {
            inss = salario * 0.075;

            return "o valor que voce de inss será:" + inss;

        }


        if (salario >= 1045.00 && salario <= 2089.60) {
            inss = salario * 0.09;

            return "o valor que voce de inss será:" + inss;
        }

        if (salario >= 2089.60 && salario <= 3134.40) {
            inss = salario * 0.12;
            return "o valor que voce de inss será:" + inss;
        }

        if (salario >= 3134.40 && salario <= 6101.06) {
            inss = salario * 0.14;
            return "o valor que voce de inss será:" + inss;
        }
return null;

    }
}



//    public static void main(String[] args) {
//        double salario, inss;
//        salario = Double.parseDouble(JOptionPane.showInputDialog("digite o seu salario"));
//        if (salario <= 1045.00) {
//            inss = salario * 0.075;
//            System.out.println(("o valor que voce de inss será:" + inss));
//        }
//        if (salario >= 1045.00 && salario <= 2089.60) {
//            inss = salario * 0.09;
//            System.out.println(("o valor que voce de inss será:" + inss));
//
//        }
//        if (salario >= 2089.60 && salario <= 3134.40) {
//            inss = salario * 0.12;
//            System.out.println(("o valor que voce de inss será:" + inss));
//
//        }
//        if (salario >= 3134.40 && salario <= 6101.06) {
//            inss = salario * 0.14;
//            System.out.println(("o valor que voce de inss será:" + inss));
//        }
//    }

    //faça um algoritimo para ler e ixibir uma palavra




//        Declarar variavel do tipo número: salario, inss1,inss2,inss3,inss4;
//        salario= ler (2.200);
//        inss1= ler(salario*0.075)
//        inss2= ler(salario*0.09)
//        inss3= ler(salario*0.12)
//        inss4= ler(salario*0.14)
//        Se (salario <=1045.00)
//              Exibir: “O valor a ser pago é:” + inss1
//        Fim Se
//               Se (salario >=1045.01 && salario  <=2089.60)
//              Exibir: “O valor a ser pago é:” + inss2
//        Fim Se
//               Se (salario >=2089.61 && salario <=3134.40)
//              Exibir: “O valor a ser pago é:” + inss3
//        Fim Se
//             Se (salario >=3134.41 && salario <=6101.06)
//              Exibir: “O valor a ser pago é:” + inss4
//        Fim Se        Declarar variavel do tipo número: salario, inss1,inss2,inss3,inss4;
//        salario= ler (2.200);
//        inss1= ler(salario*0.075)
//        inss2= ler(salario*0.09)
//        inss3= ler(salario*0.12)
//        inss4= ler(salario*0.14)
//        Se (salario <=1045.00)
//              Exibir: “O valor a ser pago é:” + inss1
//        Fim Se
//               Se (salario >=1045.01 && salario  <=2089.60)
//              Exibir: “O valor a ser pago é:” + inss2
//        Fim Se
//               Se (salario >=2089.61 && salario <=3134.40)
//              Exibir: “O valor a ser pago é:” + inss3
//        Fim Se
//             Se (salario >=3134.41 && salario <=6101.06)
//              Exibir: “O valor a ser pago é:” + inss4
//        Fim Se