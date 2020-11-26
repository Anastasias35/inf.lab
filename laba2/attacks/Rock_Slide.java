package attacks;
import ru.ifmo.se.pokemon.*;
public class Rock_Slide extends PhysicalMove{
    public Rock_Slide(){
        super(Type.ROCK, 75, 90);
    }
    @Override
    protected void applyOppDamage(Pokemon p, double damage) {
        p.setMod(Stat.HP, (int) Math.round(damage));
        if (Math.random()<=0.3){
            Effect.flinch(p);
        }
    }
    @Override
    protected String describe(){
        return "наносит вред и имеет 30% шанс заставить цель вздрогнуть";
    }

}
