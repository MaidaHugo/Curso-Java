package oo.composicao;

import java.util.ArrayList;

public class Compra {

    String cliente;
    ArrayList<Item> listaDeItens = new ArrayList<>();

    double getValorTotal() {
        double total = 0;

        for (Item item : listaDeItens) {
            total += item.quantidade * item.preco;
        }
        return total;
    }

    String carrinho() {
        String nomeItem = "";

        for (Item nome : listaDeItens) {
            nomeItem = nome.nome;
            System.out.println(nomeItem);
        }
        return "";
    }

}
