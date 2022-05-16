package oo.heranca.aula;

public class Heroi extends Jogador {

    public Heroi(int x, int y) {
        super(x, y);
    }

    // Usando esse método não precisamos reescrever código
    public boolean atacar(Jogador oponente) {
        boolean ataque1 = super.atacar(oponente); // O super serve pra chamar o método da Super-Classe
        boolean ataque2 = super.atacar(oponente);
        return ataque1 || ataque2;
    }

}
