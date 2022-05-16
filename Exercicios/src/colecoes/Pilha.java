package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<>();
        livros.add("O Pequeno Principe");
        livros.push("D. Quixote");
        livros.push("O Hobbit");

        for (String livro : livros) {
            System.out.println(livro);
        }

    }

}
