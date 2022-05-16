package fundamentos.Exercicios;

import java.util.Scanner;

public class Bhaskara {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Equação: ax² + bx + c = 0");
        System.out.print("Digite o valor de A: ");
        int a = sc.nextInt();
        System.out.print("Digite o valor de  B:");
        int b = sc.nextInt();
        System.out.print("Digite o valor de C: ");
        int c = sc.nextInt();

        System.out.printf("\nSua equação: %dx² + %dx + %d = 0 \n", a, b, c);

        double delta = Math.pow(b, 2) - 4 * a * c;
        double x1 = (-b + Math.sqrt(delta)) / 2 * a;
        double x2 = (-b - Math.sqrt(delta)) / 2 * a;

        System.out.println("\nDelta = " + delta + "\nX1 = " + x1 + "\nX2 = " + x2);

        sc.close();
    }
}
