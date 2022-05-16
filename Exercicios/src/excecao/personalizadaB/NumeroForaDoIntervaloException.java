package excecao.personalizadaB;

public class NumeroForaDoIntervaloException extends Exception {

    private String nomeDoAtributo;

    NumeroForaDoIntervaloException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage() {
        return String.format("O atributo %s está fora do intervalo", nomeDoAtributo);
    }

}
