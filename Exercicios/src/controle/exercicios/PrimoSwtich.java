package controle.exercicios;

import java.util.Scanner;

public class PrimoSwtich {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer contadorDeDivisores = 0;
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                contadorDeDivisores++;
            }
        }

        String divisor = Integer.toString(contadorDeDivisores);

        switch (divisor) {
            case "0":
                System.out.println("É primo!");
                break;
            default:
                System.out.println("Não é primo!");
        }

        sc.close();
    }
}
