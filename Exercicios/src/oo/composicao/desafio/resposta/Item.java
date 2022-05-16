package oo.composicao.desafio.resposta;

public class Item {

    Produto produto;
    int quantidade;

    Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public String toString() {
        return produto.nomeProduto;
    }

}
