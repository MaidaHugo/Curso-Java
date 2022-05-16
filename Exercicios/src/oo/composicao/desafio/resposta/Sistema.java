package oo.composicao.desafio.resposta;

public class Sistema {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Pedro Henrique");

        Compra compra1 = new Compra();
        compra1.adicionarItem("Caneta", 1, 100);
        compra1.adicionarItem(new Produto("Notebook", 2000), 2);

        Compra compra2 = new Compra();
        compra2.adicionarItem("Caderno", 10, 10);
        compra2.adicionarItem(new Produto("Impressora", 1000), 1);

        cliente.adicionarCompra(compra1);
        cliente.historicoDeCompras.add(compra2);

        System.out.println("Compra 1: ");
        compra1.mostrarCarrinho();

        System.out.printf("Total da compra: R$ %.2f\n", compra1.obterValorTotal());

        System.out.println("\nCompra 2: ");
        compra2.mostrarCarrinho();
        System.out.printf("Total da compra: R$ %.2f\n", compra1.obterValorTotal());

        System.out.println("\nHistórico de compras: ");
        System.out.println("Compras feitas em nossa loja: " + cliente.historicoDeCompras.size());
        System.out.printf("Valor total gasto: R$ %.2f\n", cliente.obterValorTotal());
        System.out.println();
    }

}
