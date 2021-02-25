package persons;

import exceptions.InvalidParameterException;
import interfaces.Waiting;
import java.util.Objects;

public abstract  class Person implements Waiting {
    protected final  String name;
    public  int currentheight;
    protected int currentpositionofX;
    protected int currentpositionofY;
    public int group;
    public int weight;
    private  boolean near;

    public Person(String name,int currentheight,int currentpositionofX, int currentpositionofY, int weight){
         if (name ==null) throw new InvalidParameterException("Поле name не может быть null ");
         if (currentheight<0) throw new InvalidParameterException("Поле currentheight не может быть меньше 0");
         if (weight <= 0 ) throw new InvalidParameterException("Вес не может быть равен 0 или быть меньше 0");
         this.name=name;
         this.currentheight=currentheight;
         this.currentpositionofX=currentpositionofX;
         this.currentpositionofY=currentpositionofY;
         this.group=0;
         this.weight=weight;
         System.out.println("Создан персонаж " + name);
    }
    public Person(String name,int currentheight,int currentpositionofX, int currentpositionofY, int weight, Integer group){
        if (name ==null) throw new InvalidParameterException("Поле name не может быть null ");
        if (currentheight<0) throw new InvalidParameterException("Currentheight не может быть меньше 0");
        if (group<0) throw new InvalidParameterException("Поле group не может быть меньше 0");
        if (weight <= 0 ) throw new InvalidParameterException("Вес не может быть равен 0 или быть меньше 0");
        this.name=name;
        this.currentheight=currentheight;
        this.currentpositionofX=currentpositionofX;
        this.currentpositionofY=currentpositionofY;
        this.group=group;
        this.weight=weight;
        System.out.println("Создан персонаж " + name);
    }

    //движение
    public void move(){
        if (currentheight > 0 ){
            System.out.println(name + " двигается");
        }
        else {
            System.out.println(name + " стоит на месте");
        }
    };
    //поднятие в воздух
    public void lift(){
        System.out.println(name + " поднялись в воздух");
        currentheight +=1;
    }
    // видимость
    public void presence(Person person){
        if (person==null) throw new InvalidParameterException("null передается в person");
        if(person.getCurrentheight()==currentheight){
            System.out.println(getName() + " находятся вместе с " + person.getName());
            near=true;
        }
        else{
            System.out.println(getName() + " больше не видят " + person.getName());
            System.out.println(person.getName() + " скрываются из виду");
            near=false;
        }
    };

    //ожидание возвращения
    @Override
    public boolean waiting() {
        return near;
    }
    @Override
    public void printwaiting(){
        if (waiting()){
            System.out.println(getName() + " не ждут возвращения" );
        }
        else {
            System.out.println(getName() + " ждут возвращения" );
        }
    }
    public void setCurrentheight(){
        if (currentheight<0) throw new InvalidParameterException("currentheight не может быть меньше 0");
        this.currentheight=currentheight;
    }

    public void setGroup(){
        if (group<0) throw new InvalidParameterException("group не может быть меньше 0");
        this.group=group;
    }
    public void setWeight(){
        if (weight <= 0 ) throw new InvalidParameterException("Вес не может быть равен 0 или быть меньше 0");
        this.weight=weight;
    }

    public String getName(){
        return this.name;
    }

    public int getCurrentheight(){
        return this.currentheight;
    }

    public int getCurrentpositionofX(){
        return this.currentpositionofX;
    }
    public int getCurrentpositionofY(){
        return this.currentpositionofY;
    }
    public int getGroup(){
        return this.group;
    }
    public int getWeight(){
        return this.weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", currentheight=" + currentheight +
                ", currentpositionofX=" + currentpositionofX +
                ", currentpositionofY=" + currentpositionofY +
                ", group=" + group +
                ", weight=" + weight +
                ", near=" + near +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return currentheight == person.currentheight &&
                currentpositionofX == person.currentpositionofX &&
                currentpositionofY == person.currentpositionofY &&
                group == person.group &&
                weight == person.weight &&
                near == person.near &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, currentheight, currentpositionofX, currentpositionofY, group, weight, near);
    }
}
