package attacks;
import ru.ifmo.se.pokemon.*;
import java.lang.Math;
public class Fire_Blast extends SpecialMove{
    public Fire_Blast(){
        super(Type.FIRE , 110 , 85);
    }
    @Override
    protected void applyOppDamage (Pokemon p, double damage){
        p.setMod(Stat.HP, (int) Math.round(damage));
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() <= 0.1) {
            Effect.burn(p);
        }
    }
    @Override
    protected String describe(){
        return "наносит удар и имеет шанс 10% поджечь цель";
    }

}
