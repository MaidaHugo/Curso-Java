package classe;

public class Teste {

    public static void main(String[] args) {

        Produto p1 = new Produto();
        Produto p2 = new Produto();

        p1.nome = "Caneta";
        p2.nome = "Caneta";

        System.out.println(p1.nome == p2.nome);

    }

}
