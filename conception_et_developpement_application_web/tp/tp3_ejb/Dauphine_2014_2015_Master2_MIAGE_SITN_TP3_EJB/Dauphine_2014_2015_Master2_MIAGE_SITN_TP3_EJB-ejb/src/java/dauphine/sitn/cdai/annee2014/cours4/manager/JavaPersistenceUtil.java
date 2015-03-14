/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dauphine.sitn.cdai.annee2014.cours4.manager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author dchamail
 */
public class JavaPersistenceUtil {

    private static EntityManagerFactory emf;

    static {
        emf = Persistence.createEntityManagerFactory("Cours4_JPA_testPU");
    }

    public static EntityManagerFactory getEmf() {
        return emf;
    }
}
