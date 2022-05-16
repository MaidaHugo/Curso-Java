package fundamentos.operadores;

import java.util.Scanner;

public class TesteComTernarios {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nota 1: ");
        double nota1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        double nota2 = sc.nextDouble();
        double media = (nota1 + nota2) / 2;
        String reprovado = media >= 5.0 ? "de recuperação" : "reprovado";
        String resultadoFinal = media >= 7.0 ? "aprovado" : reprovado;

        sc.nextLine(); // Limpeza de Buffer
        System.out.print("O aluno teve bom comportamento? ");
        String comportamento = sc.next().toLowerCase().replace("sim", "true").replace("teve", "true");
        Boolean bomComportamento = Boolean.parseBoolean(comportamento);
        boolean passouPorMedia = media >= 7.00;
        Boolean temDesconto = bomComportamento && passouPorMedia;
        String resultadoDesconto = temDesconto ? "Sim." : "Não.";

        System.out.println("RESULTADO: Média = " + media);
        System.out.println("O aluno está " + resultadoFinal);
        System.out.println("Tem desconto? " + resultadoDesconto);

        sc.close();

    }
}
