package oo.composicao;

public class CarroTeste {

    public static void main(String[] args) {

        Carro ferrari = new Carro();
        System.out.println(ferrari.estaLigado());

        ferrari.ligar();
        System.out.println(ferrari.estaLigado());

        System.out.println(ferrari.motor.giros());

        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();

        System.out.println(ferrari.motor.giros());

        ferrari.frear();
        ferrari.frear();
        ferrari.frear();
        ferrari.frear();
        ferrari.frear();
        ferrari.frear();
        ferrari.frear();

        // Relação bidirecional
        System.out.println(ferrari.motor.carro.motor.carro.motor.carro.motor.giros());

        // !Faltou encapsulamento
        // ferrari.motor.fatorInjecao = -30;

    }

}
