package test.basico;

import infra.Dao;
import model.basico.Produto;

public class NovoProduto {

    public static void main(String[] args) {

        Produto produto = new Produto("Monitor 23", 789.98);

        Dao<Produto> dao = new Dao<>(Produto.class);
        dao.incluirAtomico(produto).fechar();

        System.out.println("Id do produto: " + produto.getId());

    }

}
