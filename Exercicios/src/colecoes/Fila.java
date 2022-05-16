package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        fila.add("Ana");
        fila.offer("Bia");
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");
        fila.offer("Hugo");

        // System.out.println(fila.peek());
        // System.out.println(fila.peek());
        // System.out.println(fila.element());

        // System.out.println("\n" + fila.poll());
        // System.out.println(fila.remove());
        // System.out.println(fila.poll());
        // System.out.println(fila.poll());
        // System.out.println(fila.poll());
        // System.out.println(fila.poll());
        // System.out.println(fila.poll());
        // System.out.println(fila.poll());
        // System.out.println(fila.poll());
        // System.out.println(fila.poll());
        // System.out.println(fila.poll());

        var tamanho = fila.size();
        for (int i = 0; i < tamanho; i++) {
            System.out.println(fila.poll());
        }

        fila.add("Ana");
        fila.offer("Bia");
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");
        fila.offer("Hugo");

        System.out.println("---------------");

        while (fila.isEmpty() == false) {
            System.out.println(fila.poll());
        }

    }

}
