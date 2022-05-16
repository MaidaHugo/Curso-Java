package fundamentos.outros;

public class Temperatura {
    public static void main(String[] args) {
        final int AJUSTE = 32;
        final double MULTIPLICADOR = 5.0 / 9.0;

        double fahrenheit = 86;
        double celsius = (fahrenheit - AJUSTE) * MULTIPLICADOR;

        System.out.println("Temperatura em Celsius = " + celsius + "º");

        fahrenheit = 150;
        celsius = (fahrenheit - AJUSTE) * MULTIPLICADOR;

        System.out.println("Temperatura em Celsius = " + celsius + "º");

    }

}
