package test.umpraum;

import infra.Dao;
import model.umpraum.Assento;
import model.umpraum.Cliente;

public class ObterClienteAssento {

    public static void main(String[] args) {

        Dao<Cliente> daoCliente = new Dao<>(Cliente.class);

        Cliente cliente = daoCliente.obterPorID(1L);
        System.out.println(cliente.getAssento().getNome());

        daoCliente.fechar();

        Dao<Assento> daoAssento = new Dao<>(Assento.class);
        Assento assento = daoAssento.obterPorID(4L);
        System.out.println(assento.getCliente().getNome());

        daoAssento.fechar();
    }
}
