package jogo;

public class Jogo {

    static int numeroUsuario;
    static int numeroSorteado;
    static int continuar = 0;
    static boolean casosEspeciais = false;
    static boolean numeroInvalido = false;

    static void verificador(int numeroUsuario, int numeroSorteado) {
        if (numeroSorteado > numeroUsuario && numeroUsuario != 1709 && numeroUsuario <= 100
                && numeroUsuario >= 0) {
            System.out.println("O número correto é maior que " + numeroUsuario + "!\n");
        } else if (numeroSorteado < numeroUsuario && numeroUsuario != 1709 && numeroUsuario <= 100
                && numeroUsuario >= 0) {
            System.out.println("O número correto é menor que " + numeroUsuario + "!\n");
        } else if (numeroSorteado == numeroUsuario) {
            System.out.println("\nVocê acertou!\nParabéns!!!!");
        }
    }

    static void perdeu() {
        if (Jogo.numeroSorteado != Jogo.numeroUsuario && Jogo.numeroUsuario != 1709) {
            System.out.printf("\nVocê perdeu!\nO número correto era %d\n", numeroSorteado);
        }

    }

    static String cabecalho(int i) {
        return String.format("Tentativas restantes: %d \nAdivinhe o número de 0 a 100:", i);
    }

    static String senha() {
        return String.format("\nNumero correto: %d\nSenha de desenvolvedor digitada. Jogo interrompido!\n",
                numeroSorteado);
    }

    static String deNovo(int x) {
        String novamente;
        if (continuar != 0) {
            novamente = "\nOlá novamente!\n";
        } else {
            novamente = "";
        }
        return String.format("%s", novamente);
    }

    static String bemVindo() {
        return String.format("Bem vindo ao jogo da adivinhação!\n".toUpperCase() +
                "Seu objetivo é descobrir em " +
                "qual número de 0 a 100 eu estou pensando," +
                " você têm 10 tentativas.\nBoa Sorte!\n");
    }

    static String continuar() {
        return String.format("Digite 0 para sair, ou qualquer outro número para continuar");
    }

    static boolean casosEspeciais() {
        if (Jogo.numeroUsuario == Jogo.numeroSorteado) {
            casosEspeciais = true;
        } else if (Jogo.numeroUsuario == 1709) {
            System.out.println(Jogo.senha());
            casosEspeciais = true;
        } else if (Jogo.numeroUsuario > 100 || Jogo.numeroUsuario < 0) {
            System.out.println("Número Inválido!\n");
            numeroInvalido = true;
        }
        return casosEspeciais;
    }

}