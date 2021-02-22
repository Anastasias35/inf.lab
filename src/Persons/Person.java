package Persons;

import Interface.Waiting;

import java.util.ArrayList;
import java.util.Objects;

public abstract  class Person implements Waiting {
    protected final  String name;
    public  int currentheight;
    private  boolean near;
    public final Integer group;
    public int weight;
    public Person(String name,int currentheight, int weight){
         this.name=name;
         this.currentheight=currentheight;
         this.group=null;
         this.weight=weight;
    }

    public Person(String name,int currentheight, Integer group, int weight){
        this.name=name;
        this.currentheight=currentheight;
        this.group=group;
        this.weight=weight;
    }
    public String getName(){
        return this.name;
    }
    public int getCurrentheigh(){
        return this.currentheight;
    }

    public void setCurrentheight(){
        this.currentheight=currentheight;
    }

    //движение
    public void Move(){
        if (currentheight > 0 ){
            System.out.println(name + " двигается");
        }
        else {
            System.out.println(name + " стоит на месте");
        }
    };
    //поднятие в воздух
    public void Lift(){
        System.out.println(name + " поднялись в воздух");
        currentheight +=1;
    }
    // видимость
    public void presence(Person person){
             if(person.getCurrentheigh()==currentheight){
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", currentheight=" + currentheight +
                ", near=" + near +
                ", group=" + group +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return currentheight == person.currentheight &&
                near == person.near &&
                Objects.equals(name, person.name) &&
                Objects.equals(group, person.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, currentheight, near, group);
    }
}
