package fundamentos.outros;

public class TiposPrimitivos {

    public static void main(String[] args) {
        // Informações do funcionario

        // Tipos númericos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_134_845_223l; // Precisa colocar um L no final, para informar que não é mais um
                                                // inteiro

        // Tipos numéricos reais
        float salario = 11_445.44F; // Precis colocar um F para indicar para o Java que é um float
        double vendasAcumuladas = 2_991_797_103.01;

        // Tipo booleano
        boolean estaDeFerias = false; // False

        // Tipo caractere
        char status = 'A'; // ativo

        // Dias de empres
        System.out.println(anosDeEmpresa * 365);

        // Numéro de viagens
        System.out.println(numeroDeVoos / 2);

        // Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + ": ganha -> " + salario);
        System.out.println("Férias? " + estaDeFerias);
        System.out.println("Status: " + status);

    }

}
