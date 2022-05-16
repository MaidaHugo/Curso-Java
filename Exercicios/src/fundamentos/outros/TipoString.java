package fundamentos.outros;

public class TipoString {

    public static void main(String[] args) {

        System.out.println("Olá Mundo!".charAt(2));

        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.startsWith("boa"));
        System.out.println(s.toLowerCase().startsWith("boa")); // Assim ele não considera letras maiusculas e minusculas
        System.out.println(s.toLowerCase().endsWith("tarde"));
        System.out.println(s.length()); // Mostra quantos caracteres tem uma string
        System.out.println(s.equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde")); // Ignora se letra é mauiscula ou minuscula

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12345.987;

        System.out.println(
                "Nome: " + nome + " Sobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalário: " + salario + "\n\n");

        // A concatenção acima pode ser substituida pela string de formatação

        System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f de salário ", nome, sobrenome, idade, salario);

        String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$ %.2f de salário ", nome, sobrenome, idade,
                salario);
        System.out.println(frase + "\n");

        // Mais algumas funções da String

        System.out.println("Frase qualquer".contains("qual"));
        System.out.println("Frase qualquer".indexOf("qual"));
        System.out.println("Frase qualquer".substring(6));
        System.out.println("Frase qualquer".substring(6, 10)); // Inclue o índicie inicial mas não o final
    }

}
