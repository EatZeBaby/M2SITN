/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dauphine.sitn.cdai.annee2014.cours4.manager;


import dauphine.sitn.cdai.annee2014.cours4.entity.Livres;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;

/**
 *
 * @author dchamail
 */
public class LivresJpaController implements Serializable {

    public LivresJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Livres livres) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(livres);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

}
