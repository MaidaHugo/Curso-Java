package test.consultas;

import infra.Dao;
import model.consulta.NotaFilme;

public class ObterMediaFilmes {

    public static void main(String[] args) {

        Dao<NotaFilme> dao = new Dao<>(NotaFilme.class);
        NotaFilme nota = dao.consultarUm("mediaGeralDosFilmes");

        System.out.println(nota.getMedia());

        dao.fechar();
    }

}
