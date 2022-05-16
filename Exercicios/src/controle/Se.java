package controle;

import java.util.Scanner;

public class Se {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a média: ");
        double media = sc.nextDouble();

        if (media < 7 && media >= 4.5) // Podemos usar apenas uma sentença de código
            System.out.println("Recuperação!");

        // Para executarmos um bloco de código usamos {_}
        if (media <= 10 && media >= 7.0) {
            System.out.println("Aprovado!");
            System.out.println("Parabéns!");
        }

        boolean criterioReprovacao = media < 4.5 && media >= 0;

        if (criterioReprovacao)
            System.out.println("Reprovado!");

        sc.close();
    }
}
