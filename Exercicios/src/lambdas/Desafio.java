package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {

        // * Lógica

        Function<Produto, Double> precoComDesconto = Produto -> Produto.preco * (1 - Produto.desconto);

        UnaryOperator<Double> imposto = precoComImposto -> precoComImposto >= 2500.00
                ? precoComImposto * 1.085
                : precoComImposto;

        UnaryOperator<Double> frete = precoComFrete -> {
            if (precoComFrete >= 3000) {
                return precoComFrete + 100.00;
            } else {
                return precoComFrete + 50.00;
            }
        };

        UnaryOperator<Double> arredondar = precoAredondado -> Double
                .parseDouble(String.format("%.2f", precoAredondado));

        Function<Double, String> formatar = precoFormatado -> ("R$" + precoFormatado).replace(".", ",");

        // * Execução
        Produto p = new Produto("iPad", 3235.89, 0.13);

        final String precoFinal = precoComDesconto
                .andThen(imposto)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(p);

        System.out.println("O preço final é : " + precoFinal);
    }

}
