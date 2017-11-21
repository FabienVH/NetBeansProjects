package faune;

import mesinterfaces.Penible;
import mesinterfaces.Voyageur;


public class Voisin implements Voyageur, Penible{
    private String nom;
    private String prenom;

    public Voisin() {
    }

    public Voisin(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return nom + " " + prenom;
    }

    @Override
    public String voyager() {
    return nom + " " + prenom+ " part en vacances très souvent";
    }    

    @Override
    public String bricoler() {
        return nom + " bricole tous les dimanches matin";
    }

    @Override
    public String chanter(int decibel) {
        String msg = nom + " chante à "+decibel+" décibels";
        return msg;
    }
}
