package classe.desafio;

public class Pessoa {

    String nome;
    double peso;
    double pesoComido;

    Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    void comer(Comida comida) {
        if (comida != null) { // Garante que não de erro se não tiver uma comida valida
            this.peso += comida.peso;
        }

    }

    String apresentar() {
        return "Olá eu sou " + nome + " e peso " + peso + " Kg";
    }

}
