/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dauphine.sitn.cdai.annee2014.cours4.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author dsobral
 */
@Entity
public class Livres implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private Integer id;

    @Basic(optional = false)
    @Column(name = "TITRE")
    private String titre;

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getTitre() {
        return titre;
    }
    @Basic(optional = false)
    @Column(name = "AUTEUR")
    private String auteur;

    public Livres() {
    }

    public Livres(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Livres)) {
            return false;
        }
        Livres other = (Livres) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Livres[ id=" + id + " ]";
    }

    /**
     * @return the auteur
     */
    public String getAuteur() {
        return auteur;
    }

    /**
     * @param auteur the auteur to set
     */
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public Livres(Integer id, String titre, String auteur) {
        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
    }

}
