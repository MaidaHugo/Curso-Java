package test.umpramuitos;

import infra.Dao;
import model.umpramuitos.ItemPedido;
import model.umpramuitos.Pedido;

public class ObterPedido {

    public static void main(String[] args) {

        Dao<Pedido> dao = new Dao<>(Pedido.class);

        Pedido pedido = dao.obterPorID(1L);

        for (ItemPedido item : pedido.getItens()) {
            System.out.println(item.getQuantidade());
            System.out.println(item.getProduto().getNome());
        }

        dao.fechar();

    }
}
