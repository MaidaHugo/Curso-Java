package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
    public static void main(String[] args) {
        /*
         * 1. Número para String binária... 6 => "110"
         * 2. Inverter a String... "110" => "011"
         * 3. Converter de voltar para inteiro => "011" => 3
         */

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // Function<Integer, String> toBinario = n -> Integer.toBinaryString(n);
        UnaryOperator<String> inverter = s -> new StringBuilder(s).reverse().toString();
        Function<String, Integer> toInteger = s -> Integer.parseInt(s, 2);

        nums.stream()
                .map(Integer::toBinaryString)
                .map(inverter)
                .map(toInteger)
                .forEach(System.out::println);

    }

}
