package exercicio_easy;



public class Exerc8 {
    public String calcularImposto(double salario) {
        double ir = 0;
        if (salario <= 1903.08) {
            return "insento";
        }


        if (salario >= 1903.08 && salario <= 2826.65) {

            ir = (salario * 0.075) - 142.80;
            return "Salario Bruto" + salario + "-salario liquido" + salario + "imposto a pagar" + ir;
        }

        if (salario >= 2826.65 && salario <= 3751.65) {

            ir = (salario * 0.015) - 354.80;
            return "Salario Bruto" + salario + "-salario liquido" + salario + "imposto a pagar" + ir;
        }

        if (salario >= 3751.65 && salario <= 4664.68) {

            ir = (salario * 0.225) - 636.13;
            return "Salario Bruto" + salario + "-salario liquido" + salario + "imposto a pagar" + ir;
        }

        if (salario > 4664.68) {

            ir = (salario * 0.275) - 869.36;


            return "Salario Bruto" + salario + "-salario liquido" + salario + "imposto a pagar" + ir;



        }
        return "salario invalido";

    }
}











//
//    public static void main(String[] args) {
//        double salario, ir;
//        salario = Double.parseDouble(JOptionPane.showInputDialog("digite o seu salario"));
//
//        if (salario <= 1903.08) {
//            System.out.println("é insento");
//        }
//        if (salario >= 1903.08 && salario <= 2826.65) ;
//        {
//            ir = (salario * 0.075) - 142.80;
//        }
//        if (salario >= 2826.65 && salario <= 3751.65) ;
//        {
//            ir = (salario * 0.015) - 354.80;
//        }
//        if (salario >= 3751.65 && salario <= 4664.68) ;
//        {
//            ir = (salario * 0.225) - 636.13;
//        }
//        if (salario > 4664.68) ;
//        ir = (salario * 0.275) - 869.36;
//
//
//        System.out.println("salario bruto:" + salario);
//        System.out.println("salario liquido:" +(salario-ir));
//        System.out.println("Imposto a pagar:" + ir);
//    }
//}


//        Declarar variavel do tipo número: salario;
//        salario= ler (2.000);
//                Exibir: “O valor do Imposto de Renda é ISENTO”;
//        Fim Se
//               Se (salario >=1903,98 && salario <=2826.65)
//               ir= (salario *0.075)-142.80;
//       Fim Se
//               Se (salario >=2826.66 && salario <=3751.05)
//               ir= (salario *0.15)-354.80;
//       Fim Se
//              Se (salario >=3751.06 && salario <=4664.68)
//               ir= (salario *0.225)-636.13;
//       Fim Se
//               Se (salario > 4664.68)
//               ir= (salario *0.275)-869,36;
//       Fim Se
//               Exibir: “O valor do salario bruto é:” + salario;
//               Exibir: “O valor do salario liquido é:” + salario - ir;
//               Exibir: “O valor do Imposto de Renda é:” + ir;