package Exo01;


import Obj.*;
/* ** Objet no 0 :
Type = colis
Nom : Vincent, Adresse : Av. Berthelot 75005 Paris, pas recommande
Poids : 0.741 Kgs
Son tarif d'affranchissement = 6.4 euros
** Objet no 1 :
Type = lettre
Nom : Dupont, Adresse : Rue Colbert 13001 Marseille, pas recommande, en urgence
Son tarif d'affranchissement = 1.13 euros
** Objet no 2 :
Type = lettre
Nom : Durand, Adresse : Rue Joliot-Curie 13013 Marseille, en recommande, pas en
urgence
Son tarif d'affranchissement = 2.03 euros
** Objet no 3 :
Type = colis
Nom : Dubois, Adresse : Bd Victor Hugo 83000 Toulon, en recommande
Poids : 1.387 Kgs
Son tarif d'affranchissement = 14.2 euros */

public class AppliMain02 {
    public static void main(String[] args)  {
        int choix;
        int type;
        int index =  0;
        int urgent;
        ObjetPostal[] envoi= new ObjetPostal[4];
        envoi[0]= new Colis(741f,"Vincent","Av. Berthelot","75005","Paris",false);
        Colis c = (Colis) envoi[0];
        c.setPoids(741f);
        
        
       
            
    }
}
