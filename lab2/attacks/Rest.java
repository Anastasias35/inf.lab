package attacks;
import ru.ifmo.se.pokemon.*;
public class Rest extends StatusMove{
    public Rest(){
        super(Type.PSYCHIC , 0, 0);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        Effect e = new Effect().condition(Status.SLEEP).turns(2);
        p.setCondition(e);
        p.setMod(Stat.HP, (int)(p.getStat(Stat.HP)));
    }
    @Override
    protected String  describe(){
        return "полностью восстанавливается и  спит в течение двух ходов";
    }
}
