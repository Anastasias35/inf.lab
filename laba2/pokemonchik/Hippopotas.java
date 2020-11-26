package pokemonchik;
import attacks.*;
import ru.ifmo.se.pokemon.*;
public class Hippopotas extends Pokemon {
    public Hippopotas(String name, int level){
        super(name, level);
        setStats(68, 72, 78, 38, 42, 32);
        setType(Type.GROUND);
        setMove(new Rock_Slide(), new Swagger(), new Take_Down());
    }
}
