package Place;
import Interface.Conditionchecker;
import Persons.Person;
abstract public class Place implements Conditionchecker {
    private  static  boolean lowpressure=true;
    public abstract String getPlace() ;
    public void Sneak(Person person){
        if (lowpressure) {
            System.out.println(person.getName() + "пробираются в " + getPlace() + " и у них возникают проблемы " );
        }
        else {
            System.out.println(person.getName() + " пробираются через  " + getPlace());
        }
    }
    public void Exit(Person person){
        System.out.println(person.getName() + " выходят на " + getPlace());
    }
    @Override
    public boolean condition(){
        return lowpressure;
    }
    public void printCondition(){
        System.out.println(condition() ? "Воздух разреженный в " + getPlace() : "Воздух неразреженный в " + getPlace());
        lowpressure=false;
    }
    @Override
    public String toString() {
        return getPlace();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Place place = (Place) o;
        return lowpressure == place.condition() ;
    }
    @Override
    public int hashCode() {
        return this.toString().length();
    }
}

