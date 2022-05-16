package controle;

public class DesafioFor {

    public static void main(String[] args) {

        System.out.println("Gabarito:");
        String valor = "#";
        for (int i = 1; i <= 5; i++) {
            System.out.println(valor);
            valor += "#";
        }

        System.out.println("\nResposta:");
        for (String i = "#"; !i.equals("######"); i += "#") {
            System.out.println(i);
        }

    }
}
