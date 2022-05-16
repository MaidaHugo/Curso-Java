package colecoes;

public class Equals {

    public static void main(String[] args) {

        UsuarioEmail u1 = new UsuarioEmail();
        u1.nome = "Pedro Silva";
        u1.email = "pedro.silva@uzemeial.com.br";

        UsuarioEmail u2 = new UsuarioEmail();
        u2.nome = "Pedro Silva";
        u2.email = "pedro.silva@uzemeial.com.br";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));

    }

}
