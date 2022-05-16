package infra;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class Dao<E> {

    private static EntityManagerFactory emf;
    private EntityManager em;
    private Class<E> classe;

    // um bloco estático é automaticamente chamado pela jvm no momento em que a
    // classe é carregada
    static {
        try {
            emf = Persistence
                    .createEntityManagerFactory("exercicios-jpa");
        } catch (Exception e) {
            // login
        }
    }

    public Dao() {
        this(null);
    }

    public Dao(Class<E> classe) {
        this.classe = classe;
        em = emf.createEntityManager();
    }

    public Dao<E> abrirTransacao() {
        em.getTransaction().begin();
        return this;
    }

    public Dao<E> fecharTransacao() {
        em.getTransaction().commit();
        return this;
    }

    public Dao<E> incluir(E entidade) {
        em.persist(entidade);
        return this;
    }

    public Dao<E> incluirAtomico(E entidade) {
        return this.abrirTransacao().incluir(entidade).fecharTransacao();
    }

    public E obterPorID(Object id) {
        return em.find(classe, id);
    }

    public List<E> obterTodos() {
        return this.obterTodos(10, 0);
    }

    public List<E> obterTodos(int limit, int offset) {
        if (classe == null) {
            throw new UnsupportedOperationException("Classe nula!");
        }

        String jpql = "select e from " + classe.getName() + " e";
        TypedQuery<E> query = em.createQuery(jpql, classe);
        query.setMaxResults(limit);
        query.setFirstResult(offset);
        return query.getResultList();
    }

    public List<E> consultar(String nomeConsulta, Object... params) {
        TypedQuery<E> query = em.createNamedQuery(nomeConsulta, classe);

        for (int i = 0; i < params.length; i += 2) { // 2 em 2 pois sempre teremos o valor do parâmetro e o parâmetro
            query.setParameter(params[i].toString(), params[i + 1]);
        }

        query.setMaxResults(1);
        return query.getResultList();
    }

    public E consultarUm(String nomeConsulta, Object... params) {
        List<E> lista = consultar(nomeConsulta, params);
        return lista.isEmpty() ? null : lista.get(0);
    }

    public void fechar() {
        em.close();
    }

}
