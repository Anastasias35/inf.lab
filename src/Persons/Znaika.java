package Persons;
import  Exception.MassiveException;
import java.awt.*;
import java.util.ArrayList;

public class Znaika extends Person {
    Group1 group1=new Group1();
    Group2 group2=new Group2();
    public Znaika(String name, int currentheight,int groups, int weight){
        super(name, currentheight,groups, weight);
        System.out.println("Создан персонаж " +name);
    }
    public void Separate(Person person){
       System.out.println(name + "определяет группу у " + person.getName());
       group1.addgroup(person);
       group2.addgroup(person);
    }
    public static class Group1 {
        ArrayList<String> group1 = new ArrayList<>(8);
        public int Checkcount() throws  MassiveException{
            if (group1.size() >8 ) { throw new MassiveException(" В группе 1 персонажей больше,чем создано"); };
            return group1.size();
        }
        public void addgroup(Person person)  {
                try {
                     Checkcount();
                } catch (MassiveException e){
                    System.err.println(e.getMessage()  + "на какого-то персонажа увеличили работу");
                }finally {
                    if (person.group != null && person.group == 1) {
                        group1.add(person.name);
                        System.out.println(person.getName() + " в группе 1");
                        workgroup(person);
                }

            }

       }
        public void workgroup(Person person) {
            System.out.println(person.getName() + " идет проверять ракету ");
        }
    }
    public static class Group2 {
        ArrayList<String> group2 = new ArrayList<>(8);

        public void addgroup(Person person) {
            if (person.group != null && person.group == 1) {
                group2.add(person.name);
                System.out.println(person.getName() + " в группе 2");
                workgroup(person);
            }
        }
        public void workgroup(Person person) {
            System.out.println(person.getName() + " идет собирать металлы ");
        }
    }


}
