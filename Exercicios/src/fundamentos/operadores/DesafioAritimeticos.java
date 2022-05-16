package fundamentos.operadores;

public class DesafioAritimeticos {

    public static void main(String[] args) {

        double a = (6 * (3 + 2));
        double numeradorA = Math.pow(a, 2);
        double resultadoA = numeradorA / (3 * 2);
        double b = ((1 - 5) * (2 - 7)) / 2;
        double resultadoB = Math.pow(b, 2);
        double numerador = resultadoA - resultadoB;
        double resultadoNumerador = Math.pow(numerador, 3);
        double denominador = Math.pow(10, 3);
        double resultado = resultadoNumerador / denominador;

        System.out.println((int) resultado);

    }
}
