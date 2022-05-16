package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int qteNotas;
        System.out.print("Quantas notas você quer digitar? ");
        qteNotas = sc.nextInt();

        double[] notas = new double[qteNotas];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

        System.out.println("\n" + Arrays.toString(notas) + "\n");

        double total = 0;
        for (double nota : notas) {
            total += nota;
        }

        double media = total / notas.length;
        System.out.printf("Média do aluno = %.2f\n", media);

        if (media >= 6.0) {
            System.out.println("Aluno aprovado!\n");
        } else {
            System.out.println("Aluno Reprovado!\n");
        }

        sc.close();

    }
}
