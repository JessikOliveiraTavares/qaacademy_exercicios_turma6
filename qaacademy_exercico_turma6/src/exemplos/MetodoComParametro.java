package exemplos;

public class MetodoComParametro {
    public static void main(String[] args) {
        correrNaRua("correr","andar");
        andarNaRua("acao", "exercicio");
        andardeBicicleta("ir","bicicleta");
        passeioNoParque("passeio","parque");
        andarDePatins("ir", "patins");
        saoPaulo("ir","saoPaulo");
        barueri("trabalhar","barueri");
        jandira("visitar","jandira");
        cotia("correr","cotia");
        itapevi("morar","itapevi");



    }

    public static void correrNaRua(String correr,String andar) {
        System.out.println("correr andar");

    }

    public static void andarNaRua(String acao, String exercicio) {
        System.out.println("acao + exercicio");
    }

    public static void andardeBicicleta(String andar, String Bicicleta) {
        System.out.println(" andar + bicicleta");
    }

    public static void passeioNoParque(String passear,String parque) {
        System.out.println(" o passeio é Parque");
    }

    public static void andarDePatins(String ir, String patins) {
        System.out.println("andar + Patins");
    }
    public static String saoPaulo(String ir ,String saoPaulo) {
        return "saoPaulo";

    }

    public static String barueri( String trabalhar, String barueri) {
        return "barueri";



    }

    public static String itapevi(String morar,String itapevi) {
        return "itapevi";

    }

    public static String jandira(String visitar, String jandira) {
        return "jandira";
    }

    public static String cotia(String correr, String cotia) {
        return "cotia";
    }
}



