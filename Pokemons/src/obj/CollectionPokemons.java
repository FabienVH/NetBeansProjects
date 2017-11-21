package obj;

import java.util.ArrayList;
import java.util.List;
import obj.*;


        
public class CollectionPokemons {
    public static void main(String[] args) {
       Pokemon p01 = new PokemonSportif(120, 2, 0.85f, "Pikachu", 18);
        System.out.println(p01);
        List<Pokemon> Pokedex = new ArrayList();
       Pokedex.add(p01);
    }
}
