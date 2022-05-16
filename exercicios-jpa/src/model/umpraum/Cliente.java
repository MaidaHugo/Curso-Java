package model.umpraum;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    /*
     * OneToOne eu trago o relacionamento de tabelas para os paradigmas
     * da POO .Cascade serve pra criar uma operação em cascata, nesse caso
     * eu não preciso inserir um assento para inserir um cliente
     */
    @OneToOne(cascade = { CascadeType.PERSIST })
    @JoinColumn(name = "assento_id", unique = true) // Essa notação impede a criação de uma FK duplicada
    private Assento assento;

    public Cliente() {

    }

    public Cliente(String nome, Assento assento) {
        this.nome = nome;
        this.assento = assento;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Assento getAssento() {
        return assento;
    }

    public void setAssento(Assento assento) {
        this.assento = assento;
    }

}
