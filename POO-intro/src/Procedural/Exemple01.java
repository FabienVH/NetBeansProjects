package Procedural;

public class Exemple01 {
    public static void main(String[] args) {
        // infos sur la 1ere ville
        String nomVille01 = "Amiens";
        String cp01 ="80000";
        int populationVille01 = 294595;
        float surfaceVille01 = 49.46f;
        System.out.println("1) ville 01 :");
        String chaineTmp = decrire(nomVille01,cp01,populationVille01,surfaceVille01);
        System.out.println(chaineTmp);
        float densiteTmp = calculerDensite(surfaceVille01, populationVille01);
        System.out.println("sa densité au km² :"+densiteTmp);
        
        // infos sur la 2eme ville
        String nomVille02 = "Lyon";
        String cp02 ="69001";
        int populationVille02 = 2265375;
        float surfaceVille02 = 497.87f;
        System.out.println("2) ville 02 :");
        chaineTmp = decrire(nomVille02,cp02,populationVille02,surfaceVille02);
        System.out.println(chaineTmp);
        densiteTmp = calculerDensite(surfaceVille02, populationVille02);
        System.out.println("sa densité au km² :"+densiteTmp);
    }
    
    public static String decrire(String Nom,String CP,int population,float surface){
        String s = Nom.toUpperCase()+" - "+CP+" - nbHabitants= "+population+", surface = "+surface;
        return s;
    }
    
    public static float calculerDensite(float surface, int population){
       // float densite = population/ surface;
        return population/surface;
    }
}
