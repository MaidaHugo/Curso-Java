package fundamentos.Exercicios;

import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit:  ");
        int f = sc.nextInt();

        int c = (5 * (f - 32)) / 9;

        System.out.printf("Temperatura em Celsius = %d ºC \n ", c);

        sc.close();

    }
}
