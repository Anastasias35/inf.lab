package attacks;
import ru.ifmo.se.pokemon.*;
public class Dragon_Claw extends PhysicalMove{
    public Dragon_Claw(){
        super(Type.DRAGON, 80, 100);
    }
    @Override
    protected void applyOppDamage (Pokemon p , double damage){
            p.setMod(Stat.HP, (int)Math.round(damage));
    }
    @Override
    protected String describe(){
           return "наносит урон";
    }
}
