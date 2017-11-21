package app;
import java.util.ArrayList;

import obj.TriParCPNomPrenom;
import java.util.List;
import obj.*;

public class AppMainTests01 {
    public static void main(String[] args) {
        
        //creation de l'arraylist 
        List<Connaissance> contacts = new ArrayList();
        
        contacts.add(new Connaissance(1,"Skywalker", "Luke", "12 rue des jawas", "75000","Mos Eisley","01 52 45 63 52", "Luke01@wanadoo.fr"));
        contacts.add(new Connaissance(2, "Skywalker", "Anakin", "17 rue des jawas", "75000","Mos Eisley","01 52 45 21 49", "Anakin.Sky@wanadoo.fr"));
        contacts.add(new Famille("06 52 14 52 36","22 Mars 1979",3, "Kenobi", "ObiWan", "11 rue des tuskens", "75010","Mos Espa","01 52 12 63 44", "OB1@wanadoo.fr"));
        contacts.add(new Connaissance(4,"Jin", "QiGon", "12 rue des jawas", "75000","Mos Eisley","01 52 45 63 52", "QGJ@wanadoo.fr"));
        contacts.add(new Ami("06 52 14 52 36",5, "Koon", "Plo", "17 rue des jawas", "75000","Mos Eisley","01 52 45 21 49", "PlK@wanadoo.fr"));
        contacts.add(new Famille( "06 52 14 52 36","22 Mars 1979",6,"Organa", "Leia", "11 rue des tuskens", "75010","Mos Espa","01 52 12 63 44", "princessL@wanadoo.fr"));
        contacts.add(new Connaissance(7,"Solo", "Han", "12 rue des jawas", "75000","Mos Eisley","01 52 45 63 52", "Shot1st@wanadoo.fr"));
        contacts.add(new Ami("06 52 14 52 36",8, "Ren", "Kylo", "17 rue des jawas", "75000","Mos Eisley","01 52 45 21 49", "KyloSolo@wanadoo.fr"));
        contacts.add(new Famille( "06 56 46 45 26","22 Mars 1981",9, "Amidala", "Padme", "11 rue des tuskens", "75010","Mos Espa","01 52 12 63 44", "padme@wanadoo.fr"));
        //Collections.sort(contacts);
        TriParTypeNomPrenom tr02 = new TriParTypeNomPrenom();
        contacts.sort(tr02);
        System.out.println(contacts);
        
    }
    
}
