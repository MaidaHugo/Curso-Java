package oo.composicao.desafio.tentativa;

public class Item {

    Integer quantidade;
    double precoQuantidade;
    String nomeItem;

    Item(Produto produto, int quantidade) {
        this.quantidade = quantidade;
        nomeItem = produto.nomeProduto;
    }

    double precoQuantidade(Produto produto) {
        precoQuantidade = quantidade * produto.preco;
        return precoQuantidade;
    }

    public String toString() {
        return nomeItem;
    }

}
