import pokemonchik.*;
import attacks.*;
import ru.ifmo.se.pokemon.*;
public class Main{
    public static void main(String args[]){
        Battle b = new Battle();
        Pokemon Hippopotas = new Pokemon("my hippopotas", 1);
        Pokemon Hippowdon = new Pokemon("my Hippowdon", 1);
        Pokemon Rayquazza = new Pokemon("my Rayquazza",1);
        Pokemon Togekiss = new Pokemon ("my Togekiss",1);
        Pokemon Togepi= new Pokemon("my Togepi",1);
        Pokemon Togetic = new Pokemon ("my Togetic",1);
        b.addAlly(Hippopotas);
        b.addFoe(Hippowdon);
        b.addAlly(Togepi);
        b.addAlly(Togekiss);
        b.addFoe(Rayquazza);
        b.addFoe(Togetic);
        b.go();
    }
}
