package jogo;

import java.util.Random;
import java.util.Scanner;

public class JogoTeste {
    public static void main(String[] args) {
        // Var
        Random sorteador = new Random();
        Scanner sc = new Scanner(System.in);
        Jogo.numeroSorteado = sorteador.nextInt(101);
        // Body
        System.out.println(Jogo.bemVindo());
        do {
            System.out.print(Jogo.deNovo(Jogo.continuar));
            for (int i = 10; i > 0; i--) {
                System.out.println(Jogo.cabecalho(i));
                Jogo.numeroUsuario = sc.nextInt();
                Jogo.verificador(Jogo.numeroUsuario, Jogo.numeroSorteado);
                if (Jogo.casosEspeciais() == true) {
                    break;
                } else if (Jogo.numeroInvalido == true) {
                    i++;
                }
            }
            Jogo.perdeu();
            System.out.println(Jogo.continuar());
            Jogo.continuar = sc.nextInt();
        } while (Jogo.continuar != 0);
        sc.close();
    }
}
