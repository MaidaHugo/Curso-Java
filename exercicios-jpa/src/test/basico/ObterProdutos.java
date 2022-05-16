package test.basico;

import java.util.List;

import infra.ProdutoDao;
import model.basico.Produto;

public class ObterProdutos {

    public static void main(String[] args) {

        ProdutoDao dao = new ProdutoDao();
        List<Produto> produtos = dao.obterTodos();

        for (Produto produto : produtos) {
            System.out.println("Id: " + produto.getId() + " - Nome: " + produto.getNome());
        }

        double precoTotal = produtos
                .stream()
                .map(p -> p.getPreco())
                .reduce(0.0, (t, p) -> t + p)
                .doubleValue();
        System.out.println("O valor total é R$ " + precoTotal);

        dao.fechar();
    }

}
