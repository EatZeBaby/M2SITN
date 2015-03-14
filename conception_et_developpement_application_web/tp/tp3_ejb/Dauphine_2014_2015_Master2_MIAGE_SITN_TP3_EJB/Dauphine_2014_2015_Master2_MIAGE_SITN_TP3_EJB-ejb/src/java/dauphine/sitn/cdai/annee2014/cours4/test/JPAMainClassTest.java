/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dauphine.sitn.cdai.annee2014.cours4.test;

import dauphine.sitn.cdai.annee2014.cours4.entity.Livres;
import dauphine.sitn.cdai.annee2014.cours4.manager.JavaPersistenceUtil;
import dauphine.sitn.cdai.annee2014.cours4.manager.LivresJpaController;

/**
 *
 * @author DSOBRAL
 */
public class JPAMainClassTest {

    public static void main(String[] args) {

        LivresJpaController ljc = new LivresJpaController(JavaPersistenceUtil.getEmf());

        Livres LivreToto = new Livres(3, "Titre", "Auteur");
        ljc.create(LivreToto);

    }
}
