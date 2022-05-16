package lambdas;

public class Produto {

    final String nome;
    final Double preco;
    final Double desconto;

    public Produto(String nome, Double preco, Double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        double precoFinal = preco * (1 - desconto);
        return nome + " custa R$" + String.format("%.2f", precoFinal);
    }

}
