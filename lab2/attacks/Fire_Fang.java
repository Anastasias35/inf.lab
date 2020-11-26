package attacks;
import ru.ifmo.se.pokemon.*;
public class Fire_Fang extends  PhysicalMove{
    public Fire_Fang(){
        super(Type.FIRE , 65, 95);
    }
    @Override
    protected void applyOppDamage(Pokemon p, double damage){
        p.setMod(Stat.HP, (int) Math.round(damage));
    }
    @Override
    protected void applyOppEffects(Pokemon p ){
        if (Math.random()<=0.1){
            Effect.burn(p);
        }
        if (Math.random()<=0.3){
            Effect.confuse(p);
        }
    }
    @Override
    protected String describe(){
        return "наносит урон, имеет 10% шанс сжечь цель и 30% шанс заставить цель вздрогнуть";
    }

}
