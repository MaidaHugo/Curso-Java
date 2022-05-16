package fundamentos.Exercicios;

import java.util.Scanner;

public class AreaTriangulo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Base do triângulo = ");
        double base = sc.nextDouble();
        System.out.print("Altura do triângulo = ");
        double altura = sc.nextDouble();

        double area = (base * altura) / 2;

        System.out.printf("Área = %.2f m2 \n", area);

        sc.close();
    }

}
