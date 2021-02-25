package places;
import exceptions.InvalidParameterException;
import interfaces.Conditionchecker;
import persons.*;
import enums.Equipment;
import java.util.Objects;

public abstract class Location implements  Conditionchecker{
    protected String name; //не может быть пустой строкой
    protected int height ; //не может быть null
    protected Boolean lowpressure;
    protected Boolean exit;

    public Location(String name, int height){
        if(name==null) throw new InvalidParameterException("Поле name не может быть null");
        if(height<0) throw new InvalidParameterException("Поле height не может принимать значения меньше 0");
        this.name=name;
        this.height=height;
        this.lowpressure=null;
        this.exit=null;
        System.out.println("Создана локация " + name +", находящаяся на высоте " + height);
    }
    public Location(String name,int height, boolean lowpressure,boolean exit){
        if(name==null) throw new InvalidParameterException("Поле name не может быть null");
        if(height<0) throw new InvalidParameterException("Поле height не может меньше 0");
        this.name=name;
        this.height=height;
        this.lowpressure=lowpressure;
        this.exit=exit;
        System.out.println("Создана локация " + name +", находящаяся на высоте " + height);
    }

    public void output(Person person) {
        if (person==null) throw new InvalidParameterException("null передано в person");
        if (exit) {
            System.out.println(person.getName() + " добрались до выхода");
        } else {
            System.out.println(person.getName() + " еще не добрались до выхода");
        }
    }
    public void barrier(Person person){
        if (person==null) throw new InvalidParameterException("null передано в person");
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
    public void sneak(Person person) {
        if (person==null) throw new InvalidParameterException("null передано в person");
        System.out.println(person.getName() + " пробираются в " + name);
        if (lowpressure) {
            System.out.println("у" + person.getName() + " возникают проблемы");
        }
        printCondition();
        barrier(person);
        output(person);
    }

    @Override
    public boolean condition() {
        return lowpressure;
    }

    @Override
    public void printCondition() {
        System.out.println(condition() ? "Воздух разреженный в " + getName() : "Воздух неразреженный в " + getName());
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

    public void setName(){
        if(name==null) throw new InvalidParameterException("name не может быть null");
        this.name=name;
    }

    public void setHeight(){
        if(height<0) throw new InvalidParameterException("height не может принимать значения меньше 0");
        this.height=height;
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

