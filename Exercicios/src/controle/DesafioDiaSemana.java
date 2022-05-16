package controle;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DesafioDiaSemana {
    public static void main(String[] args) {
        // Domingo -> 1
        // Segunda -> 2
        // Ter?a -> 3
        // Quarta -> 4
        // Quinta -> 5
        // Sexta -> 6
        // S?bado -> 7

        Scanner sc = new Scanner(System.in, "UTF-8");

        System.out.print("Digite um dia da semana: ");
        String diaSemana = JOptionPane.showInputDialog("Digite o dia da semana: ");

        System.out.println();
        if (diaSemana.equalsIgnoreCase("domingo")) { // IgnoreCase para ignorar letras maiúsculas
            System.out.println("Dia 1");
        } else if (diaSemana.equalsIgnoreCase("segunda")) {
            System.out.println("Dia 2");
        } else if (diaSemana.equalsIgnoreCase("terça") || diaSemana.equalsIgnoreCase("terca")) {
            System.out.println("Dia 3");
        } else if (diaSemana.equalsIgnoreCase("quarta")) {
            System.out.println("Dia 4");
        } else if (diaSemana.equalsIgnoreCase("quinta")) {
            System.out.println("Dia 5");
        } else if (diaSemana.equalsIgnoreCase("sexta")) {
            System.out.println("Dia 6");
        } else if (diaSemana.equalsIgnoreCase("sábado") || diaSemana.equalsIgnoreCase("sabado")) {
            System.out.println("Dia 7");
        } else {
            System.out.println("Dia inválido!");
        }

        sc.close();
    }
}
