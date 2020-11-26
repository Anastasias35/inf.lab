package pokemonchik;
import attacks.*;
import ru.ifmo.se.pokemon.*;
public class Togetic extends Togepi{
    public Togetic(String name, int level ){
        super(name, level);
        setStats(55, 40, 85, 80, 105, 40);
        setType(Type.FAIRY, Type.FLYING);
        setMove(new Fire_Blast(), new Rest(), new Magical_Leaf());
    }
}
