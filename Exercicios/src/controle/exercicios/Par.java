package controle.exercicios;

import java.util.Scanner;

public class Par {

    /**
     * 1. Criar um programa que receba um número e verifique se ele está entre 0 e
     * 10 e é par;
     */

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();

        String intervalo = "Não";
        if (numero >= 0 && numero <= 10) {
            intervalo = "Sim";
        }

        System.out.printf("Está dentro do intervalo: %s\n", intervalo);

        String par = "Não";
        if (numero % 2 == 0) {
            par = "Sim";
        }

        System.out.printf("É par: %s\n", par);

        entrada.close();

    }

}
