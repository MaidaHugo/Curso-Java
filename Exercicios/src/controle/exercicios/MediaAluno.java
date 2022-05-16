package controle.exercicios;

import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a primeria nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Informe a segunda nota: ");
        double nota2 = sc.nextDouble();
        double media = (nota1 + nota2) / 2;

        System.out.printf("Média = %.2f\n", media);
        if (media >= 7.0) {
            System.out.println("Aprovado!");
        } else if (media >= 4) {
            System.out.println("Recuperação!");
        } else {
            System.out.println("Reprovado!");
        }

        sc.close();

    }
}
