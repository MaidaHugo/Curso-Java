package classe;

public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 4356.89);

        var p2 = new Produto();
        p2.nome = "Caneta preta";
        p2.preco = 100.00;

        Produto.desconto = 0.5;

        System.out.println(p1.nome + " = R$ " + p1.precoComDesconto());
        System.out.println(p2.nome + " = R$ " + p2.precoComDesconto());

        double precoFinal1 = p1.precoComDesconto();// p1.preco * (1 - p1.desconto);
        double precoFinal2 = p2.precoComDesconto(); // p2.preco * (1 - p2.desconto);
        double totalCarrinho = (precoFinal1 + precoFinal2);

        System.out.printf("\nTotal do carrinho = R$ %.2f\n", totalCarrinho);

    }
}
