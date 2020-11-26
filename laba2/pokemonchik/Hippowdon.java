package pokemonchik;
import attacks.*;
import ru.ifmo.se.pokemon.*;
public class Hippowdon extends Hippopotas {
    public Hippowdon(String name, int level){
        super(name, level);
        setStats(108, 112, 118, 68, 72, 47);
        setType(Type.GROUND);
        setMove(new Rock_Slide(), new Swagger(), new Take_Down(), new Fire_Fang());
    }

}
