package oo.composicao;

public class CompraTeste {

    public static void main(String[] args) {

        Compra compra1 = new Compra();
        compra1.cliente = "João Pedro";
        compra1.listaDeItens.add(new Item("Caneta", 20, 7.45));
        compra1.listaDeItens.add(new Item("Borracha", 12, 3.89));
        compra1.listaDeItens.add(new Item("Caderno", 3, 18.79));

        System.out.print("Produtos no carrinho:\n");
        System.out.println(compra1.carrinho() + "Quantidade de produtos:"
                + compra1.listaDeItens.size() + "\n");
        System.out.println("Total da compra: R$ " + compra1.getValorTotal());

    }

}
