package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {

    private boolean ligarTurbo;
    private boolean ligarAr;

    public Ferrari() {
        this(315);
    }

    private Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
        setDelta(15);
    }

    @Override
    public void ligarTurbo() {
        ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
    }

    @Override
    public void ligarAr() {
        ligarAr = true;
    }

    @Override
    public void desligarAr() {
        ligarAr = false;
    }

    @Override
    public int getDelta() {
        if (ligarTurbo && !ligarAr) {
            return 35;
        } else if (ligarTurbo && ligarAr) {
            return 30;
        } else if (!ligarAr && !ligarTurbo) {
            return 20;
        } else {
            return 15;
        }
    }

    // @Override // Serve para a IDE validar que estou sobrescrevendo um método
    // void acelerar() {
    // for (int i = 0; i < 3; i++) {
    // super.acelerar();
    // }
    // }

}
