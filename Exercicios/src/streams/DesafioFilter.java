package streams;

import java.util.Arrays;
import java.util.List;

public class DesafioFilter {
    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 3500.00, 0.1, false);
        Produto p2 = new Produto("Monitor", 2800.99, 0.15, true);
        Produto p3 = new Produto("Teclado", 350.80, 0.0, false);
        Produto p4 = new Produto("Mouse", 210.50, 0.05, true);
        Produto p5 = new Produto("Cadeira", 1248.75, 0.2, false);

        List<Produto> listaDeProdutos = Arrays.asList(p1, p2, p3, p4, p5);

        listaDeProdutos.stream()
                .filter(Produto.temPromocao)
                .map(Produto.toString)
                .forEach(System.out::println);
        ;
    }
}
