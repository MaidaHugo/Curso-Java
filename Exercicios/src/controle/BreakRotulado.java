package controle;

public class BreakRotulado {

    public static void main(String[] args) {

        externo: for (int i = 0; i < 3; i++) { // Externo é o nome que dado ao primeiro laço, isso chama rotular
            for (int j = 0; j < 3; j++) {
                if (i == 1) {
                    break externo; // !Evitar ao máximo usar o break rotulado, pois ele causa confusão
                }
                System.out.printf("[%d,%d]", i, j);
            }
            System.out.println();
        }
        System.out.println("\nFim!");

    }
}
