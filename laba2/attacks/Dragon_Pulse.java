package attacks;
import ru.ifmo.se.pokemon.*;
public class Dragon_Pulse extends SpecialMove{
    public Dragon_Pulse(){
            super(Type.DRAGON, 85, 100);
    }
    @Override
    protected void applyOppDamage (Pokemon p , double damage){
        p.setMod(Stat.HP, (int) Math.round(damage));
    }
    @Override
    protected String describe() {
        return "наносит урон";
    }

}
