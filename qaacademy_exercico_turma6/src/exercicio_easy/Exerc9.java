package exercicio_easy;



public class Exerc9 {
    public static void main(String[] args) {
int numeroDigitado;
int i=1;
        numeroDigitado=Integer.parseInt(JOptionPane.showInputDialog("digite um valor"));
        while (i<=10){
            System.out.println(numeroDigitado+"x"+i+"="+numeroDigitado*i);
            i=i+1;
        }

    }
}









//Declarar variavel do tipo texto: numeroDigitado, i=1;
//        numeroDigitado: Ler (2)
//        Enquanto (i <= 10)
//        Exibir mensagem: “Numero” +numeroDigitado+ “x” + i + “=” + numeroDigitado*i;
//        i = i + 1;
//        Fim Enquanto