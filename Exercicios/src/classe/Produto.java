package classe;

public class Produto {

    String nome;
    double preco;
    static double desconto = 0.25;

    Produto() { // Construtor padrão

    }

    Produto(String nomeInicial) {
        nome = nomeInicial;
    }

    Produto(String nomeInicial, double precoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
    }

    // *Esse método não precisa de parâmetro, porque o Objeto ja tem os dados
    double precoComDesconto() {
        return preco * (1 - desconto);
    }

    double precoComDesconto(double descontoDoGerente) {
        return preco * (1 - desconto - descontoDoGerente);
    }

}
