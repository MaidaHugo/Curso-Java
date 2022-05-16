package test.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.basico.Usuario;

public class ObterUsuarios {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("exercicios-jpa"); // Cria um EntityManager
        EntityManager em = emf.createEntityManager();

        String jpql = "select u from Usuario u";

        // TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
        // query.setMaxResults(5);
        // List<Usuario> usuarios = query.getResultList();

        List<Usuario> usuarios = em.createQuery(jpql, Usuario.class)
                .setMaxResults(25)
                .getResultList();

        for (Usuario usuario : usuarios) {
            System.out.println("ID: " + usuario.getId() + " Nome: " + usuario.getNome());
        }

        em.close();
        emf.close();

    }
}
