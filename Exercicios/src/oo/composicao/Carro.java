package oo.composicao;

public class Carro {

    // Motor motor = new Motor();
    Motor motor;

    Carro() {
        this.motor = new Motor(this);
    }

    void acelerar() {
        if (motor.fatorInjecao < 2.6) { // O If protege pra não ultrapassar o giro máximo, ele para na rotação minima do
                                        // motor
            motor.fatorInjecao += 0.4;
        }
    }

    void frear() {
        if (motor.fatorInjecao > 0.5) { // O If protege pra não ter giros negativos, ele para na rotação minima do motor
            motor.fatorInjecao -= 0.4;
        }
    }

    void ligar() {
        motor.ligado = true;
    }

    void desligar() {
        motor.ligado = false;
    }

    boolean estaLigado() {
        return motor.ligado;
    }
}
