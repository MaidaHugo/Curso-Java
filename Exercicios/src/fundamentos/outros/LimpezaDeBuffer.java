package fundamentos.outros;

import java.util.Scanner;

public class LimpezaDeBuffer {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        /*
         * System.out.print("Qual a sua idade? ");
         * int idade = teclado.nextInt();
         * teclado.nextLine(); // lê o "\n" que o teclado.nextInt() deixa para trás.
         * 
         * System.out.print("Qual o seu nome? ");
         * String nome = teclado.nextLine();
         * 
         * System.out.print("Qual seu sobrenome? ");
         * String sobrenome = teclado.nextLine();
         * 
         * System.out.printf("Idade: %d - Nome: %s - Sobrenome: %s \n", idade, nome,
         * sobrenome);
         */

        // Pode ser feito desta outra maneira

        System.out.print("Qual a sua idade? ");
        int idade = Integer.parseInt(teclado.nextLine());

        System.out.print("Qual o seu nome? ");
        String nome = teclado.nextLine();

        System.out.print("Qual seu sobrenome? ");
        String sobrenome = teclado.nextLine();

        System.out.printf("Idade: %d - Nome: %s - Sobrenome: %s \n", idade, nome, sobrenome);

        teclado.close();

    }

}
