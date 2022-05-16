package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Número de alunos: ");
        int numeroDeAlunos = sc.nextInt();

        System.out.print("Número de notas: ");
        int numeroDeNotas = sc.nextInt();

        double[][] notas = new double[numeroDeAlunos][numeroDeNotas];
        System.out.println();

        double total = 0;
        for (int i = 0; i < numeroDeAlunos; i++) {
            System.out.println("Aluno " + (i + 1));
            for (int j = 0; j < numeroDeNotas; j++) {
                System.out.print("Digite a nota " + (j + 1) + ": ");
                notas[i][j] = sc.nextDouble();
                total += notas[i][j];
            }
            System.out.println();
        }

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Aluno " + (i + 1));
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println("Nota " + (j + 1) + ": " + notas[i][j]);
            }
            System.out.println();
        }

        double media = total / (numeroDeAlunos * numeroDeNotas);
        System.out.printf("Média da turma é %.2f\n\n", media);

        for (double[] notasDoAluno : notas) {
            System.out.println(Arrays.toString(notasDoAluno));
        }

        sc.close();

    }
}
