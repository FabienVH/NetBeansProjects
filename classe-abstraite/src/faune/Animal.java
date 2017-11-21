package faune;

import java.util.Date;

/*
    une classe abstract est classe sans instance.
    on s'interdit d'avoir des objets de classe Animal
*/
public abstract class Animal {
    private String nom;
    private float poids;
    private String genre;
    private Date dateNaissance;

    public Animal() {
    }

    public Animal(String nom, float poids, String genre) {
        this.nom = nom;
        this.poids = poids;
        this.genre = genre;
    }

    public Animal(String nom, float poids, String genre, Date dateNaissance) {
        this.nom = nom;
        this.poids = poids;
        this.genre = genre;
        this.dateNaissance = dateNaissance;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getPoids() {
        return poids;
    }

    public void setPoids(float poids) {
        this.poids = poids;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    @Override
    public String toString() {
        return "nom=" + nom + ", genre=" + genre;
    }
    
    public void seDeplacer(){
        System.out.println(nom + " se deplace!");
    }
    
    /*
        une methode abstraite est une methode sans corps
        une methode abtraite doit etre definie dans les classes concretes
        regle : une classe qui possede une methode abtraite est forcément une classe abstraite
        Une abstraite n'est pas obligé d'avoir une methode abstraite
    */
    public abstract  void manger();
}
