package fundamentos.conversao;

import java.util.Scanner;

public class DesafioConvercao {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro salário: R$ ");
        String salario1 = sc.nextLine();
        System.out.print("Digite o segundo salário: R$ ");
        String salario2 = sc.nextLine();
        System.out.print("Digte o terceiro salário: R$ ");
        String salario3 = sc.nextLine();

        double valor1 = Double.parseDouble(salario1.replace(",", "."));
        double valor2 = Double.parseDouble(salario2.replace(",", "."));
        double valor3 = Double.parseDouble(salario3.replace(",", "."));
        double media = (valor1 + valor2 + valor3) / 3;

        System.out.printf("Média salarial = %.2f %n", media);
        // System.out.println("Média salarial = " + String.format("%.2f",media)); // *
        // Outro modo de imprimir

        sc.close();

    }

}
