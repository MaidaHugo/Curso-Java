package streams;

import java.util.function.Function;
import java.util.function.Predicate;

public class Produto {

    final String nome;
    final Double preco;
    final Double desconto;
    final Boolean frete;

    public Produto(String nome, Double preco, Double desconto, boolean frete) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
        this.frete = frete;
    }

    void adicionarProduto(Produto produto) {

    }

    public static Predicate<Produto> temFrete = p -> p.frete == true;

    public static Predicate<Produto> temPromocao = p -> p.desconto > 0;

    public static Function<Produto, String> freteGratis = p -> p.frete == false ? p.nome + " tem frete Gratis!"
            : p.nome + " tem frete de R$ 50,00";

    static Function<Produto, String> toString = p -> {
        if (p.frete == true && p.desconto > 0) {
            return p.nome + " tem frete de R$ 50,00 e está em promoção!!!";
        } else if (p.frete == true && p.desconto == 0) {
            return p.nome + " tem frete de R$ 50,00 mas não está em promoção";
        } else if (p.frete == false && p.desconto > 0) {
            return p.nome + " tem frete grátis e está em promoção!!!";
        } else {
            return p.nome + " tem frete grátis mas não está em promoção";
        }
    };

}
