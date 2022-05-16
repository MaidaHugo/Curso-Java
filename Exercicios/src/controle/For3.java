package controle;

public class For3 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) { // Não é possível acessar a variável i, pois ele foi declarada dentro do laço
            for (int j = 0; j < 10; j++) {
                System.out.printf("[%d %d]", i, j);
            }
            System.out.println();
        }

    }
}
