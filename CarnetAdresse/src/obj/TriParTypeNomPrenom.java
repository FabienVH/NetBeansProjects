package obj;

import java.util.Comparator;

public class TriParTypeNomPrenom implements Comparator <Connaissance>{
    @Override
         public int compare(Connaissance obj, Connaissance cible) {       
        String type01 = obj.getType();
        String type02 = cible.getType();
        int delta = 0;
        if(type01 != null && type02 == null){
            return 1;
        }
        if(type01 == null && type02 != null){
            return -1;
        }
        if(type01== null && type02 == null){
            delta = 0;
        }
        if(type01 != null && type02 != null){
            delta = type01.compareToIgnoreCase(type02);
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
        if (res == 0){
                    String prenom01 = obj.getPrenom();
                    if(prenom01 == null){
                        return -1;
                    }
                    String prenom02 = cible.getPrenom();
                    if(prenom02 == null){
                        return 1;
                    }
                    int res2 = prenom01.compareToIgnoreCase(prenom02);
                    return res2;
            
        }else{
        
        return res; 
        }
    
        }     
}
