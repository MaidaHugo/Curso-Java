package test.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.basico.Usuario;

public class NovoUsuario {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("exercicios-jpa"); // Cria um EntityManager
        EntityManager em = emf.createEntityManager();

        Usuario novoUsuario = new Usuario("Maria", "maria@hotmail.com");

        // Um persist funciona com transação, então precisamos iniciar ela e depois
        // comitar
        em.getTransaction().begin();
        em.persist(novoUsuario);
        em.getTransaction().commit();

        em.close();
        emf.close();

    }
}
