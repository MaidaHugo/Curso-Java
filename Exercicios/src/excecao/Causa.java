package excecao;

public class Causa {

    public static void main(String[] args) {
        try {
            metodoA(null);
        } catch (Exception e) {
            if (e.getMessage() != null) {
                System.out.println(e.getCause().getMessage());
            }
        }
    }

    static void metodoA(Aluno aluno) {
        try {
            metodoB(aluno);
        } catch (Exception causa) {
            throw new IllegalStateException(causa);
        }

    }

    static void metodoB(Aluno aluno) {
        if (aluno == null) {
            throw new NullPointerException("Aluno está NULOOOOO!!!!");
        }
        System.out.println(aluno.nome);
    }
}
