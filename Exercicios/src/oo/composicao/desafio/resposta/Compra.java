package oo.composicao.desafio.resposta;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    List<Item> carrinho = new ArrayList<>();

    void adicionarItem(Produto p, int qtde) {
        this.carrinho.add(new Item(p, qtde));
    }

    void adicionarItem(String nome, double preco, int qtde) {
        var produto = new Produto(nome, preco);
        this.carrinho.add(new Item(produto, qtde));
    }

    double obterValorTotal() {
        double total = 0;

        for (Item item : carrinho) {
            total += item.quantidade * item.produto.preco;
        }

        return total;
    }

    void mostrarCarrinho() {
        for (Item item : carrinho) {
            System.out.println(item);
        }
    }
}
