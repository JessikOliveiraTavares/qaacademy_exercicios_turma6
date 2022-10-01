package ExercicioMedio;

public class Exerc1 {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println(i % 2);
                System.out.println(("o numero é: " + i + " é par"));

                System.out.println(("o numero é :" + i + "é impar"));
            }
            i++;
        }
//    } else {
//        System.out.println(i % 2);
//    }
    }
}
