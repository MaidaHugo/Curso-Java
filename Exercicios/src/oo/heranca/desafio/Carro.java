package oo.heranca.desafio;

public class Carro {

    final int VELOCIDADE_MAXIMA;
    protected int velocidadeAtual;
    private int delta = 5;

    protected Carro(int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void acelerar() {
        if ((velocidadeAtual + getDelta()) > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += getDelta();
        }
    }

    public void frear() {
        if (velocidadeAtual >= getDelta()) {
            velocidadeAtual -= 5;
        } else {
            velocidadeAtual = 0;
        }

    }

    public String toString() {
        return String.format("Velocidade atual = %d Km/h ", velocidadeAtual);
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    void teste() {

    }

}
