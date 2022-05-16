package test.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.basico.Usuario;

public class AlterarUsuario3 {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Usuario usuario = em.find(Usuario.class, 7L);
        em.detach(usuario); // Isso eu tiro o objeto do modo gerencial, assim não acontecerá nenhuma mudança
        usuario.setNome("Leo");
        usuario.setEmail("leonardo@hotmail.com");

        em.merge(usuario);

        em.getTransaction().commit();

        em.close();
        emf.close();

    }
}
