package test.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.basico.Usuario;

public class AlterarUsuario2 {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("exercicios-jpa"); // Cria um EntityManager
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Usuario usuario = em.find(Usuario.class, 7L);
        usuario.setNome("Leonardo");
        usuario.setEmail("leoonardo@hotmail.com");

        // em.merge(usuario);

        em.getTransaction().commit();

        em.close();
        emf.close();

    }
}