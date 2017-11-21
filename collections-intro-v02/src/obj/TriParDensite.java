package obj;

import java.util.Comparator;

public class TriParDensite implements Comparator<Ville>{

    @Override
    public int compare(Ville obj, Ville cible) {
        float d01 = obj.getDensite();
        float d02 = cible.getDensite();
        float delta = d01 - d02;
        if(delta < 0){
            return -1;
        }else if(delta > 0){
            return 1;
        }else{
            return 0;
        }
    }
    
}
