package test.umpramuitos;

import infra.Dao;
import model.basico.Produto;
import model.umpramuitos.ItemPedido;
import model.umpramuitos.Pedido;

public class NovoPedido {

    public static void main(String[] args) {

        Dao<Object> dao = new Dao<>();

        Pedido pedido = new Pedido();
        Produto produto = new Produto("Geladeira", 2789.89);
        ItemPedido item = new ItemPedido(pedido, produto, 10);

        dao.abrirTransacao()
                .incluir(produto)
                .incluir(pedido)
                .incluir(item)
                .fecharTransacao()
                .fechar();
        ;

    }

}
