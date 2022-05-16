package fundamentos.operadores;

public class Ternario {

    public static void main(String[] args) {

        double media = 4.6;
        String reprovado = media >= 5.0 ? "de recuperação" : "reprovado";
        String resultado = media >= 7.0 ? "aprovado" : reprovado;

        System.out.println("O aluno está " + resultado);

        boolean bomComportamento = true;
        boolean passouPorMedia = media >= 7;
        boolean temDesconto = bomComportamento && passouPorMedia;
        String resultadoDesconto = temDesconto ? "Sim." : "Não";

        System.out.println("Tem desconto? " + resultadoDesconto);

    }
}
