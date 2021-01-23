package Place;
import Interface.Conditionchecker;
import Persons.*;
import Place.Placetype;
import Enum.Equipment;
import java.util.Objects;
public abstract class Location implements  Conditionchecker{
    protected String name;
    protected int height ;
    protected boolean lowpressure;
    protected boolean exit;
    public Location(String name,int height, boolean lowpressure,boolean exit){
        this.name=name;
        this.height=height;
        this.lowpressure=lowpressure;
        this.exit=exit;
    }

    public void output(Person person) {
        if (exit) {
            System.out.println(person.getName() + " добрались до выхода");
        } else {
            System.out.println(person.getName() + " еще не добрались до выхода");
        }
    }
    public void barrier(Person person){
        if (!getExit()){
            if (condition()){
                System.out.println(person.getName() +" используют " + Equipment.IcePeak.getthing() + ",чтобы пройти дальше");
            }
            else{
                System.out.println(person.getName() + " беспрепятственно проходят дальше ");
            }

        }
        person.currentheight +=1;
        height +=1;
    }
    public void Sneak(Person person) {
        System.out.println(person.getName() + " пробираются в " + name);
        if (lowpressure) {
            System.out.println("у" + person.getName() + " возникают проблемы");
        }
        printCondition();
        barrier(person);
        output(person);
    }

    public String getName() {
        return name;
    }

    public boolean getExit() {
        return exit;
    }
    public int getHeight() {
        return height;
    }
    public boolean getLowpressure() {
        return lowpressure;
    }
    @Override
    public boolean condition() {
        return lowpressure;
    }
    @Override
    public void printCondition() {
        System.out.println(condition() ? "Воздух разреженный в " + getName() : "Воздух неразреженный в " + getName());
    }

    @Override
    public String toString() {
        return "Location{" + "name='" + name + '\'' + ", height=" + height + ", lowpressure=" + lowpressure + ", exit=" + exit + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location nowlocation = (Location) o;
        return height == nowlocation.height &&
                lowpressure == nowlocation.lowpressure &&
                exit == nowlocation.exit &&
                Objects.equals(name, nowlocation.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, height, lowpressure, exit);
    }
}

