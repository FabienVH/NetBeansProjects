package Obj;
//2. Définir une classe Lettre, sous-classe de ObjetPostal, et qui possède, hormis les données 
//héritées, une donnée de type booléen qui indique si la lettre doit être expédiée en urgence ou pas. 
//Cette classe sera munie d'un constructeur, et une méthode qui calculera le prix d'affranchissement 
//de la façon suivante : 
//- le prix d'affranchissement normal est 0.53 euros, 
//- si la lettre doit être expédiée en recommandé, il y a un surcoût de 1.5 euros, 
//- si la lettre doit être expédiée en urgence, il y a également un surcoût de 0.6 euros. 
//La méthode toString sera redéfinie de façon à communiquer, hormis toutes les informations 
//contenues dans la classe ObjetPostal, le fait que la lettre doive être expédiée en urgence ou pas.
public class Lettre extends ObjetPostal {
    private boolean urgence;

    public Lettre() {
    }

    public Lettre(String nomDestinataire, String adresseDestinataire, String cpDestinataire, String villeDestinataire, boolean recommande) {
        super(nomDestinataire, adresseDestinataire, cpDestinataire, villeDestinataire, recommande);
    }

    public boolean isUrgence() {
        return urgence;
    }

    public void setUrgence(boolean urgence) {
        this.urgence = urgence;
    }
    
  //Cette classe sera munie d'un constructeur, et une méthode qui calculera le prix d'affranchissement 
//de la façon suivante : 
//- le prix d'affranchissement normal est 0.53 euros, 
//- si la lettre doit être expédiée en recommandé, il y a un surcoût de 1.5 euros, 
//- si la lettre doit être expédiée en urgence, il y a également un surcoût de 0.6 euros. 
//La méthode toString sera redéfinie de façon à communiquer, hormis toutes les informations 
//contenues dans la classe ObjetPostal, le fait que la lettre doive être expédiée en urgence ou pas.
    
    

  
    public float PrixAffranchissementLettre(){
        float prix = 0.53f;
        if (isRecommande() == true){
            prix += 1.5f;
        }
        if (urgence == true){
            prix += 0.6f;
        }
        return prix;
    }

    
    public String toString() {
        return "Lettre{" + "urgence=" + urgence +" '} nom:"+ getNomDestinataire()+"\nadresse:"+getAdresseDestinataire()+getCpDestinataire()+getVilleDestinataire() ;
    }
    

 } 

