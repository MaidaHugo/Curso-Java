package controle.exercicios;

import java.util.Scanner;

public class NumeroPrimo {

    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);

        // System.out.print("Digite um número: ");
        // int numero = sc.nextInt();

        // if (numero % 2 == 0 && numero != 2) {
        // System.out.println("Não é primo!");
        // } else if (numero % 3 == 0 && numero != 3) {
        // System.out.println("Não é primo!");
        // } else if (numero % 4 == 0) {
        // System.out.println("Não é primo!");
        // } else if (numero % 5 == 0 && numero != 5) {
        // System.out.println("Não é primo!");
        // } else if (numero % 6 == 0) {
        // System.out.println("Não é primo!");
        // } else if (numero % 7 == 0 && numero != 7) {
        // System.out.println("Não é primo!");
        // } else if (numero % 8 == 0) {
        // System.out.println("Não é primo!");
        // } else if (numero % 9 == 0) {
        // System.out.println("Não é primo!");
        // } else {
        // System.out.println("É primo!");
        // }

        // sc.close();

        Scanner sc = new Scanner(System.in);

        int contadorDeDivisores = 0;
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                contadorDeDivisores++;
            }
        }

        if (contadorDeDivisores == 0) {
            System.out.println("É primo!");
        } else {
            System.out.println("Não é primo!");
        }

        sc.close();
    }
}
