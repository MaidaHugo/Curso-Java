package controle.exercicios;

import java.util.Scanner;

public class NumerosPositivos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;

        int numero = 0;
        while (numero >= 0) {
            System.out.print("Digite um número: ");
            numero = sc.nextInt();
            if (numero > 0)
                soma += numero;
            System.out.println("Soma = " + soma);

        }

        sc.close();
    }
}
