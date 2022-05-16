package oo.composicao.desafio.tentativa;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    String nomeCliente;
    double totalGasto;
    List<Compra> historicoCompras = new ArrayList<>();

    Cliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    void adicionarCompra(Compra compra) {
        historicoCompras.add(compra);
        totalGasto += compra.totalCompra;

    }

    double totalGasto() {
        return totalGasto;
    }

}
