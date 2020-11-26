package pokemonchik;
import attacks.*;
import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.Type;
public class Togepi extends Pokemon{
    public Togepi(String name, int level){
        super(name, level);
        setStats(35, 20, 65, 40, 65, 20);
        setType(Type.FAIRY);
        setMove(new Fire_Blast(), new Rest());
    }
}
