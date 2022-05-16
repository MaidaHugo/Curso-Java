package fundamentos.Exercicios;

import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu peso: ");
        double peso = sc.nextDouble();
        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();

        double imc = peso / Math.pow(altura, 2);

        System.out.printf("Seu IMC = %.2f \n", imc);

        sc.close();

    }
}
