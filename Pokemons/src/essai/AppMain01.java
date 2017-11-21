package essai;

import java.util.ArrayList;
import java.util.List;
import obj.*;

public class AppMain01 {
    public static void main(String[] args) {
       Pokemon p01 = new PokemonSportif(120, 2, 0.85f, "Pikachu", 18);
        System.out.println(p01);
        List<Pokemon> Pokedex = new ArrayList();
       Pokedex.add(p01);
       Pokedex.add(new PokemonCasanier(8, 2, 0.65f, "Salameche", 12));
    }
}
