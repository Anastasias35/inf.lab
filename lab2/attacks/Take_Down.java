package attacks;
import ru.ifmo.se.pokemon.*;
public class Take_Down extends PhysicalMove {
    public Take_Down(){
        super(Type.NORMAL, 90,85);
    }
    @Override
    protected void applyOppDamage( Pokemon p, double damage){
        p.setMod(Stat.HP, (int)(Math.round(damage)/4));
    }
    @Override
    protected String  describe(){
        return "наносит 1/4 урона";
    }
}
