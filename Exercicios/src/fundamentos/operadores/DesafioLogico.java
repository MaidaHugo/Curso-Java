package fundamentos.operadores;

public class DesafioLogico {

    public static void main(String[] args) {

        // Trabalho na terça (V ou F)
        // Trabalho na quinta (V ou F)

        boolean trabalhoTer = false;
        boolean trabalhoQuin = false;

        boolean TV50 = trabalhoQuin && trabalhoTer;
        boolean TV32 = trabalhoTer ^ trabalhoQuin;
        boolean sorvete = trabalhoQuin || trabalhoTer;

        System.out.println("Comprou a TV de 50\"? "
                + Boolean.toString(TV50).replace("true", "Comprou").replace("false", "Não comprou"));
        System.out.println("Comprou a TV de 32\"? "
                + Boolean.toString(TV32).replace("true", "Comprou").replace("false", "Não comprou"));
        System.out.println("Tomou sorvete? "
                + Boolean.toString(sorvete).replace("true", "Tomou").replace("false", "Não tomou"));

        // Operador Unário
        System.out
                .println("Mais saudavel? " + Boolean.toString(!sorvete).replace("false", "Não, pois comeu sorvete")
                        .replace("true", "Sim, pois não comeu sorvete"));

    }
}
