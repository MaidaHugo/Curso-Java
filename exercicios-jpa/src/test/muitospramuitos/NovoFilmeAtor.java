package test.muitospramuitos;

import infra.Dao;
import model.muitospramuitos.Ator;
import model.muitospramuitos.Filme;

public class NovoFilmeAtor {

    public static void main(String[] args) {

        Filme filmeA = new Filme("Star Wars Ep 4", 8.7);
        Filme filmeB = new Filme("Indiana Jones", 8.0);

        Ator atorA = new Ator("Harrison Ford");
        Ator atrizB = new Ator("Carrie Fisher");

        filmeA.adicionarAtor(atorA);
        filmeA.adicionarAtor(atrizB);

        filmeB.adicionarAtor(atorA);

        Dao<Filme> dao = new Dao<>();
        dao.incluirAtomico(filmeA);

    }

}
