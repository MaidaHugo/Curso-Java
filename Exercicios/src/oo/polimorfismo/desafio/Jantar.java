package oo.polimorfismo.desafio;

public class Jantar {
    public static void main(String[] args) {

        Pessoa convidado = new Pessoa(99.65);

        Alimento ingrediente1 = new Arroz(0.2);
        Alimento ingrediente2 = new Feijao(0.1);
        // Alimento ingrediente3 = new Alimento(0.3);

        System.out.println(convidado.getPeso());

        convidado.comer(ingrediente1);
        convidado.comer(ingrediente2);
        // convidado.comer(ingrediente3);

        System.out.println(convidado.getPeso());

        Alimento sobremesa = new Sorvete(0.3);
        convidado.comer(sobremesa);
        System.out.println(convidado.getPeso());

    }

}
