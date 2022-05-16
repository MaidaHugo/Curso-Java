package controle.exercicios;

import java.util.Scanner;

public class LetraPorLetra {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = sc.next();

        for (int i = 0; i < palavra.length(); i++) {
            System.out.println(palavra.toUpperCase().charAt(i));
        }

        sc.close();
    }
}
