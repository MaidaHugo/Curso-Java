package controle.exercicios;

import java.util.Scanner;

public class NumeroMaior {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            int numero = sc.nextInt();
            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("O maior número digitado foi: " + maior);

        sc.close();
    }

}
