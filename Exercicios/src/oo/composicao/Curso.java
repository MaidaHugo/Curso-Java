package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    String nomeCurso;
    final List<Aluno> listaAlunos = new ArrayList<>(); // Final faz com que não possamos alterar o endereço e memoria
                                                       // desa
                                                       // lista podemos alterar seus elementos

    public Curso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    void adicionarAluno(Aluno aluno) {
        this.listaAlunos.add(aluno);
        aluno.listaCursos.add(this);
    }

}
