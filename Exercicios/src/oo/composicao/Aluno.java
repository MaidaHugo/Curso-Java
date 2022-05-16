package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    final String nomeAluno;
    final List<Curso> listaCursos = new ArrayList<>();

    public Aluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    void adicionarCurso(Curso curso) {
        this.listaCursos.add(curso);
        curso.listaAlunos.add(this);
    }

    Curso obterCursoPorNome(String nome) {
        for (Curso curso : this.listaCursos) {
            if (curso.nomeCurso.equalsIgnoreCase(nome))
                ;
            return curso;
        }
        return null;
    }

    public String toString() {
        return nomeAluno;
    }

}
