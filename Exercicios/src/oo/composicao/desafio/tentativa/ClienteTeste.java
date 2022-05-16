package oo.composicao.desafio.tentativa;

// Criar 1 cliente, com 2 compras, com 2 itens associados a produtos diferentes

public class ClienteTeste {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Pedro");

        // * Primeira compra
        Compra c1 = new Compra();
        Produto p1 = new Produto("Escova de dente", 10.80);
        Item item1 = new Item(p1, 2);
        item1.precoQuantidade(p1);

        Produto p2 = new Produto("Desodorante", 12.20);
        Item item2 = new Item(p2, 3);
        item2.precoQuantidade(p2);

        c1.adicionarItem(item1);
        c1.adicionarItem(item2);

        cliente1.adicionarCompra(c1);

        // * Segunda compra
        Compra c2 = new Compra();
        Produto p3 = new Produto("Televisão", 3200.00);
        Item item3 = new Item(p3, 1);
        item3.precoQuantidade(p3);

        Produto p4 = new Produto("Geladeira", 1300.50);
        Item item4 = new Item(p4, 1);
        item4.precoQuantidade(p4);

        c2.adicionarItem(item3);
        c2.adicionarItem(item4);

        cliente1.adicionarCompra(c2);

        // System.out.println("Seu carrinho: ");

        // c1.mostrarCarrinho();

        // *Impressão

        System.out.println("Bem vindo " + cliente1.nomeCliente + "!");

        System.out.println("\nCompra 1:");
        c1.mostrarCarrinho();
        System.out.printf("Total da compra = R$ %.2f\n", c1.totalCompra());

        System.out.println("\nCompra 2:");
        c2.mostrarCarrinho();
        System.out.printf("Total da compra = R$ %.2f\n", c2.totalCompra());

        // * Histórico de compras
        System.out.println("\nHistórico de compras!");
        System.out.println("Número de compras: " + cliente1.historicoCompras.size());
        System.out.printf("Total gasto em nossa loja: R$ %.2f\n\n", cliente1.totalGasto());

    }
}
