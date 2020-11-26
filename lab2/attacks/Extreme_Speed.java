package attacks;
import ru.ifmo.se.pokemon.*;
public class Extreme_Speed extends PhysicalMove{
       public Extreme_Speed(){
             super(Type.NORMAL , 80, 100);
       }
       @Override
       protected void applyOppDamage(Pokemon p, double damage){
              p.setMod(Stat.HP, (int) Math.round(damage));
       }
       @Override
       protected String describe(){
              return "наносит урон";
       }



}
