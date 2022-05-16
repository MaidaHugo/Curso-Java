package classe;

public class DataTeste {

    public static void main(String[] args) {

        var d1 = new Data(1, 12, 2022);

        var d2 = new Data();
        d2.ano = 2021;

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

    }
}
