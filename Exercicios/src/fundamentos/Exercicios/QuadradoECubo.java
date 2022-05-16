package fundamentos.Exercicios;

import java.util.Scanner;

public class QuadradoECubo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int x = sc.nextInt();

        int x2 = (int) Math.pow(x, 2);
        int x3 = (int) Math.pow(x, 3);

        System.out.println("Seu número ao quadrado = " + x2
                + "\nSeu número ao cubo = " + x3);

        sc.close();
    }
}
