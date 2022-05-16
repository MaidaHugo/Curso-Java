package model.heranca;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "tipo", length = 2, discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("AL")
public class Aluno {

    @Id
    private Long matricula;

    private String nome;

    public Aluno() {

    }

    public Aluno(Long matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public Long getId() {
        return matricula;
    }

    public void setId(Long id) {
        this.matricula = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
