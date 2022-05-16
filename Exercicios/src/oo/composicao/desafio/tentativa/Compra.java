package oo.composicao.desafio.tentativa;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    double totalCompra;
    String nome;
    List<Item> carrinho = new ArrayList<>();

    void adicionarItem(Item item) {
        carrinho.add(item);
        totalCompra += item.precoQuantidade;
        nome = item.nomeItem;
    }

    double totalCompra() {
        return totalCompra;
    }

    void mostrarCarrinho() {
        for (Item item : carrinho) {
            System.out.println(item);
        }
    }

}
