package fundamentos.operadores;

public class Relacionais {

    public static void main(String[] args) {

        int a = 97;
        int b = 'a';

        System.out.println(a == b);
        System.out.println(3 > 4);
        System.out.println(3 >= 3);
        System.out.println(3 < 7);
        System.out.println(3 != 7);

        /*
         * String nota;
         * String comportamento;
         * Scanner sc = new Scanner(System.in);
         * 
         * System.out.print("Nota do aluno: ");
         * nota = sc.next().replace(",", ".");
         * Double media = Double.parseDouble(nota);
         * System.out.print("Qual foi seu comportamento: ");
         * comportamento = sc.next().toLowerCase().replace("bom", "true");
         * Boolean bomComportamento = Boolean.parseBoolean(comportamento);
         * 
         * boolean passouPorMedia = media >= 7;
         * boolean temDesconto = bomComportamento && passouPorMedia;
         * 
         * System.out.println("Tem desconto? " +
         * Boolean.toString(temDesconto).replace("true", "Tem desconto")
         * .replace("false", "Não tem desconto"));
         * 
         * sc.close();
         */
    }
}
