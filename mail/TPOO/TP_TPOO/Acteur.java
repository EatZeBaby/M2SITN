
/**
 * Write a description of class Acteur here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.List;
import java.util.ArrayList;


public class Acteur
{
    private String prenomActeur;
    private String nomActeur;
    private List<Film> listeFilms;

    /**
     * Constructor for objects of class Acteur
     */
    public Acteur()
    {
      this.prenomActeur = "Anne";
      this.nomActeur = "Dorval";
      this.listeFilms = new ArrayList<Film>();
    }

  
     // Getter
    public String getNomActeur()
    {
        return this.nomActeur;
    }
    
    
    public String getPrenomActeur()
    {
        return this.prenomActeur;
    }
    
    
    public List getListeFilms()
    {
        return this.listeFilms;
    }
    

    // Méthode pour ajouter un film à la liste de films
    public void ajouterFilm(Film unFilm)
    {
       this.listeFilms.add(unFilm);
       System.out.println("Le film " + unFilm.infoFilms()+ " a été ajouté ");
    }

    public void afficherListeFilms()
    {
      for (Film film : listeFilms) 
      {
        System.out.println(film.infoFilms());
      }
    }

}
