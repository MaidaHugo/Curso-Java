package fundamentos;

import javax.swing.JOptionPane;

public class DesafioCalculadora {

    public static void main(String[] args) {
        // Ler num1
        // Ler num 2
        // operação: + - * / %

        String num1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
        String num2 = JOptionPane.showInputDialog("Digite o segundo número: ");
        String operacao = JOptionPane.showInputDialog("Qual operação deseja fazer: ");

        Double x = Double.parseDouble(num1);
        Double y = Double.parseDouble(num2);

        // Lógica
        double resultado = "+".equals(operacao) ? x + y : 0;
        resultado = "-".equals(operacao) ? x - y : resultado;
        resultado = "*".equals(operacao) ? x * y : resultado;
        resultado = "/".equals(operacao) ? x / y : resultado;
        resultado = "%".equals(operacao) ? x % y : resultado;

        System.out.printf("%.2f %s %.2f = %.2f %n", x, operacao, y, resultado);

    }
}
