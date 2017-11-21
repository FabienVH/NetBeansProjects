package obj;

import java.util.Comparator;

public class TriParCPNom implements Comparator<Ville>{

    @Override
    public int compare(Ville obj, Ville cible) {
        String cp01 = obj.getCp();
        String cp02 = cible.getCp();
        int delta = 0;
        if(cp01 != null && cp02 == null){
            return 1;
        }
        if(cp01 == null && cp02 != null){
            return -1;
        }
        if(cp01== null && cp02 == null){
            delta = 0;
        }
        if(cp01 != null && cp02 != null){
            delta = cp01.compareToIgnoreCase(cp02);
        }
        if(delta != 0){
            return delta;
        }
        
        // si les cp sont les memes
        String nom01 = obj.getNom();
        if(nom01 == null){
            return -1;
        }
        String nom02 = cible.getNom();
        if(nom02 == null){
            return 1;
        }
        int res = nom01.compareToIgnoreCase(nom02);
        return res;
    }
    
}
