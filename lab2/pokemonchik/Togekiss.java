package pokemonchik;
import attacks.*;
import ru.ifmo.se.pokemon.*;
public class Togekiss extends Togetic {
    public Togekiss(String name, int level){
        super(name , level);
        setStats(85,50,95,120,115,80);
        setType(Type.FAIRY, Type.FLYING);
        setMove(new Fire_Blast(), new Rest(), new Magical_Leaf(), new Confide());
    }
}
