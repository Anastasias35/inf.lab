package attacks;
import ru.ifmo.se.pokemon.*;
public class Magical_Leaf extends SpecialMove {
    public Magical_Leaf(){
        super( Type.GRASS, 60 ,999999999 );
    }
    @Override
    protected void applyOppDamage(Pokemon p, double damage){
        p.setMod(Stat.HP, (int) Math.round(damage));
        p.setMod(Stat.EVASION,0);
        p.setMod(Stat.ACCURACY,0);
    }
    @Override
    protected String describe(){
        return "наносит урон";
    }
}
