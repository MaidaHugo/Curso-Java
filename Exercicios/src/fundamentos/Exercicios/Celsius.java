package fundamentos.Exercicios;

import java.util.Scanner;

public class Celsius {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        int c = sc.nextInt();

        double f = 1.8 * c + 32;

        System.out.printf("Temperatura em Fahrenheit = %.2f ºF \n", f);

        sc.close();
    }
}
