package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {

    public static void main(String[] args) {

        // Set<String> listaDeAprovados = new HashSet<>();
        Set<String> listaDeAprovados = new TreeSet<>();
        listaDeAprovados.add("Ana");
        listaDeAprovados.add("Carlos");
        listaDeAprovados.add("Luca");
        listaDeAprovados.add("Pedro");

        for (String candidato : listaDeAprovados) {
            System.out.println(candidato);
        }

        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(120);
        nums.add(6);

        for (int n : nums) {
            System.out.println(n);
        }

    }

}
