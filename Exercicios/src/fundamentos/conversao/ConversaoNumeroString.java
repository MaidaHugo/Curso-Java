package fundamentos.conversao;

public class ConversaoNumeroString {

    public static void main(String[] args) {

        Integer num1 = 10_000;
        System.out.println(num1.toString().length());

        int num2 = 100_000;
        System.out.println(Integer.toString(num2));

        System.out.println(("" + num2).length()); // Podemos fazer dessa forma, mas não é muito prática e nem útil

    }

}
