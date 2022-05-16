package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {

    public static void main(String[] args) {

        Ferrari c1 = new Ferrari();

        c1.ligarTurbo();
        c1.ligarAr();
        c1.desligarAr();

        c1.acelerar();
        c1.frear();
        System.out.println(c1);

        c1.acelerar();
        c1.frear();
        System.out.println(c1);

        c1.acelerar();
        System.out.println(c1);
        System.out.println(c1.nivelDoAr());

        Carro c2 = new Civic();
        for (int i = 0; i < 10; i++) {
            c2.acelerar();
        }

        c2.frear();
        c2.frear();
        c2.frear();

        System.out.println(c2);

    }

}
