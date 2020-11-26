package pokemonchik;
import attacks.*;
import ru.ifmo.se.pokemon.*;
public class Rayquazza extends Pokemon{
    public Rayquazza(String name, int level){
        super(name, level);
        setStats(105,150,90,150,90,95);
        setType(Type.DRAGON, Type.FLYING);
        setMove(new Extreme_Speed(), new Dragon_Pulse(),new  Fire_Blast(),new Dragon_Claw());
    }
}
