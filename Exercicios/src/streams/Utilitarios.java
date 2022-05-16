package streams;

import java.util.function.UnaryOperator;

public class Utilitarios {

    private Utilitarios() {
        // Usando esse construtor privado não deixamos Utilitarios ser instanciado, sem
        // a necessidade
        // de transformar a classe em uma interface
    }

    public final static UnaryOperator<String> maiuscula = n -> n.toUpperCase();
    public final static UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";

    public final static String grito(String n) {
        return n + "!!! ";
    }

    public static String reverse(String string) {
        var sb = new StringBuilder(string);
        return sb.reverse().toString();
    }

    static public boolean isPar(Integer i) {
        if (i % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
