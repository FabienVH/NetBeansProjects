package procedural;

public class Exemple01 {

    public static void main(String[] args) {
        // infos sur la premiere ville
        String nomVille01 = "Amiens";
        String cpVille01 = "80000";
        int populationVille01 = 294595;
        float surfaceVille01 = 49.46f;
        System.out.println("1) ville 01 :");
        String chaineTmp = decrire(nomVille01, cpVille01, populationVille01, surfaceVille01);
        System.out.println(chaineTmp);
        float densiteTmp = calculerDensite(surfaceVille01, populationVille01);
        System.out.println("sa densité au km² : " + densiteTmp);

        //infos sur une 2eme ville
        String nomVille02 = "Lyon";
        String cpVille02 = "69001";
        int populationVille02 = 2265375;
        float surfaceVille02 = 47.87f;
        chaineTmp = decrire(nomVille02, cpVille02, populationVille02, surfaceVille02);
        System.out.println("");
        System.out.println("2) ville 02 :");
        System.out.println(chaineTmp);
        densiteTmp = calculerDensite(surfaceVille02, populationVille02);
        System.out.println("sa densité au km² : " + densiteTmp);
    }

    public static String decrire(String nom, String cp,
            int population, float surface) {
        String s = nom.toUpperCase() + " - " + cp + " - nbHabitants= "
                + population + ", surface(km²) = " + surface;
        return s;
    }

    public static float calculerDensite(float surface, int population) {
//        float densite = population / surface;
//        return densite;     
        return population / surface;
    }

}
