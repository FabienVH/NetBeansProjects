package faune;

import mesinterfaces.Voyageur;

public class Pigeon extends Animal implements Voyageur{
    private int endurance;
    private int envergure;

    public Pigeon() {
        
    }
    
// equivalent à 
//    public Pigeon() {
//        super(); // ici on execute le constructeur correspandant de la classe mere
//    }

    public Pigeon(int endurance, String nom, float poids, String genre) {
        super(nom, poids, genre);
        this.endurance = endurance;
    }

    public Pigeon(int endurance, int envergure, String nom, float poids, String genre) {
        super(nom, poids, genre);
        this.endurance = endurance;
        this.envergure = envergure;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public int getEnvergure() {
        return envergure;
    }

    public void setEnvergure(int envergure) {
        this.envergure = envergure;
    }
    
    @Override
    public void seDeplacer(){
        System.out.println("je peux voler pendant "+endurance+" minutes");
    }

    @Override
    public void manger() {
        System.out.println("je mange des graines.");
    }

    @Override
    public String voyager(){
        return "je vais au sud tous les hivers!";
    }
    
}
