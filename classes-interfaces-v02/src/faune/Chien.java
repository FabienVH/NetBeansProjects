package faune;


public class Chien extends Animal {
    private String pelage;

    public Chien() {
    }

    public Chien(String pelage, String nom, float poids, String genre) {
        super(nom, poids, genre);
        //setNom(nom);
        this.pelage = pelage;
        
    }

    public String getPelage() {
        return pelage;
    }

    public void setPelage(String pelage) {
        this.pelage = pelage;
    }

    @Override
    public String toString() {
        return "chien : nom = "+ getNom()
                +", genre = "+getGenre()+", pelage= "+pelage;
    }
    
    @Override
    public void seDeplacer(){
        System.out.println(getNom()+" cours super vite.");
        super.seDeplacer(); // on execute la methode seDeplacer() de la classe mere        
    }
    
    @Override
    public void manger(){
        System.out.println("je mange des croquettes.");
    }
    
    public String faireDuBruit(int decibel){
        return "j'aboie à "+decibel+" décibels.";
    }
    
}
