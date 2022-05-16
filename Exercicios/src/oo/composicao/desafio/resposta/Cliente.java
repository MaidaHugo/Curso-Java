package oo.composicao.desafio.resposta;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    final String nome;
    final List<Compra> historicoDeCompras = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    void adicionarCompra(Compra compra) {
        historicoDeCompras.add(compra);
    }

    double obterValorTotal() {
        double total = 0;

        for (Compra compra : historicoDeCompras) {
            total += compra.obterValorTotal();
        }

        return total;
    }

}
