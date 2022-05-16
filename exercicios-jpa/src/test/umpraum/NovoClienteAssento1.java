package test.umpraum;

import infra.Dao;
import model.umpraum.Assento;
import model.umpraum.Cliente;

public class NovoClienteAssento1 {

    public static void main(String[] args) {

        Assento assento = new Assento("16A");
        Cliente cliente = new Cliente("Carlos", assento);

        Dao<Object> dao = new Dao<>();

        dao.abrirTransacao()
                .incluir(assento)// Se for na mesma transação não importa a ordem de inclusão
                .incluir(cliente)
                .fecharTransacao()
                .fechar();

    }

}
