package oo.encapsulamento;

public class PessoaTeste {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Hugo", "Maida", -24);
        // p1.idade = -30; Vai dar erro pois a variável é private
        // p1.alterarIdade(50);

        System.out.println(p1.getIdade());
        System.out.println(p1);
    }
}
