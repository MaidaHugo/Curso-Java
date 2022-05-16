package colecoes;

public class UsuarioEmail {

    String nome;
    String email;

    public boolean equals(Object objeto) {

        if (objeto instanceof UsuarioEmail) {
            UsuarioEmail outro = (UsuarioEmail) objeto;
            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);
            return nomeIgual && emailIgual;
        } else {
            return false;
        }
    }

}
