package classe.desafio;

public class Jantar {
    public static void main(String[] args) {

        Comida c1 = new Comida("Feijão", 0.180);
        Comida c2 = new Comida("Arroz", 0.300);

        Pessoa p1 = new Pessoa("Fernando", 99.8);

        System.out.println(p1.apresentar());
        p1.comer(c1);

        System.out.println(p1.apresentar());
        p1.comer(c2);

        System.out.println(p1.apresentar());

        // System.out.println("Nome: " + p1.nome);
        // System.out.println("Peso: " + p1.peso + " kg\n");
        // System.out.println("Comida: " + c1.nome);
        // System.out.println("Peso da comida: " + c1.nome + " kg\n");
        // p1.comer(c1);
        // System.out.println("Peso após comer: " + p1.peso + " kg");

    }
}
