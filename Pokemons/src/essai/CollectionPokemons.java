package essai;

import java.util.ArrayList;
import java.util.List;
import obj.*;
import java.util.Iterator;

public class CollectionPokemons {
    public static void main(String[] args) {
       Pokemon p01 = new PokemonSportif(120, 2, 0.85f, "Pikachu", 18);
        List<Pokemon> Pokedex = new ArrayList();
       Pokedex.add(p01);
       Pokedex.add(new PokemonCasanier(8, 2, 0.65f, "Salameche", 12));
       Pokedex.add(new PokemonMer(2, "Rondoudou", 45));
       Pokedex.add(new PokemonCroisiere(3, "Bulbizarre", 15));
       //System.out.println(Pokedex);
    
    
        Iterator it = Pokedex.iterator();
 
        while(it.hasNext()) {
          PokemonSportif pok = (PokemonSportif)it.next();
          System.out.println(pok);
        }
    }
}
