package controle.exercicios;

import java.util.Random;
import java.util.Scanner;

public class JogoDaAdvinhacao {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random numeroAleatorio = new Random();

        // int tentativas = 10;
        int continuar = 0;

        System.out.println("Bem vindo ao jogo da advinhação!".toUpperCase());
        System.out.println(
                "Seu objetivo é descobrir em qual número de 0 a 100 eu estou pensando, você têm 10 tentativas.\nBoa Sorte!\n");

        do {

            if (continuar != 0) {
                System.out.println("\nOlá novamente!\n");
            }
            int numeroSorteado = numeroAleatorio.nextInt(101);
            int numeroUsuario = 0;

            for (int i = 10; i > 0; i--) {

                System.out.println("Tentativas restantes: " + i);
                // tentativas--;
                System.out.print("Advinhe o número de 0 a 100: ");
                numeroUsuario = sc.nextInt();

                if (numeroSorteado > numeroUsuario && numeroUsuario != 1709 && numeroUsuario <= 100
                        && numeroUsuario >= 0) {
                    System.out.println("O número correto é maior que " + numeroUsuario + "!\n");
                } else if (numeroSorteado < numeroUsuario && numeroUsuario != 1709 && numeroUsuario <= 100
                        && numeroUsuario >= 0) {
                    System.out.println("O número correto é menor que " + numeroUsuario + "!\n");
                } else if (numeroSorteado == numeroUsuario) {
                    System.out.println("\nVocê acertou!\nParabéns!!!!");
                    break;
                } else if (numeroUsuario == 1709) {
                    System.out.println("\nNumero correto: " + numeroSorteado + "");
                    System.out.println("Senha de desenvolvedor digitada. Jogo interrompido.\n");
                    break;
                } else if (numeroUsuario > 100 || numeroUsuario < 0 && numeroUsuario != 1709) {
                    System.out.println("Número invalido!\n");
                    i++;
                }
            }

            if (numeroSorteado != numeroUsuario && numeroUsuario != 1709) {
                System.out.println("\nVocê perdeu!");
                System.out.println("O número correto era " + numeroSorteado + "\n");
            }

            System.out.println("Digite 0 para sair, ou qualquer outro número para continuar");
            continuar = sc.nextInt();

        } while (continuar != 0);

        sc.close();
    }
}
