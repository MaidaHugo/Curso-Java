package controle;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String texto = "";
        do {
            System.out.println("Você precisa " +
                    "falar as palavras mágicas...");
            System.out.print("Qer sair? ");
            texto = entrada.nextLine();
        } while (!texto.equalsIgnoreCase("por favor") && !texto.equalsIgnoreCase("sim"));

        System.out.println("Obrigado!");
        entrada.close();
    }
}
