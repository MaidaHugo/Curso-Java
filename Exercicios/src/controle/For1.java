package controle;

public class For1 {

    public static void main(String[] args) {

        // * for (a; b; c) => a = Definição da variável / b = Expreção / c = Incremento
        for (int contador = 0; contador <= 20; contador += 2) {
            System.out.printf("i = %d \n", contador);
        }

        int x = 2;
        for (; x < 10;) { // Não necessariamente precisamos colocar todas as partes dentro do for
            System.out.println("x = " + x);
            x++;
        }

        // ! Laço infinito
        // for(;;){
        // System.out.println("Fim!");
        // }

    }
}
