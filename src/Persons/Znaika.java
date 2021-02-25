package persons;
import devices.RocketNIP;
import exceptions.InvalidParameterException;

import java.util.ArrayList;

public class Znaika extends Person {

    public Znaika(String name, int currentheight,int currentpositionofX, int currentpositionofY, int weight,int group){
        super(name,currentheight,currentpositionofX,currentpositionofY,weight,group);
    }
    public void separate(Person person){
       if (person==null) throw new InvalidParameterException("null передано в person");
       System.out.println(name + "определяет группу у " + person.getName());
       group1.addgroup(person);
       group2.addgroup(person);
    }
    public static class Group1 {
        public String tittle;

        public Group1(String tittle) {
            this.tittle = tittle;
        }
        ArrayList<String> groupofpersons1 = new ArrayList<>();

        public void addgroup(Person person) {
            if (person == null) throw new InvalidParameterException("null передано в person");
            if (person.group == 1) {
                groupofpersons1.add(person.name);
                System.out.println(person.getName() + " в группе 1");
                workgroup(person);
            }
        }

        public void workgroup(Person person) {
                System.out.println( person.getName()+ " идет на проверку");
        }
    }

    public static class Group2 {
        public String tittle;
        public Group2(String tittle){
            this.tittle=tittle;
        }
        ArrayList<String> groupofpersons2 = new ArrayList<>();
        public void addgroup(Person person) {
            if (person==null) throw new InvalidParameterException("null передано в person");
            if (person.group == 2) {
                groupofpersons2.add(person.name);
                System.out.println(person.getName() + " в группе 2");
                workgroup(person);
            }
        }
        public void workgroup(Person person) {
            if (person==null) throw new InvalidParameterException("null передано в person");
            System.out.println(person.getName() + " идет собирать металлы ");
        }
    }

    Group1 group1=new Group1("группа 1");
    Group2 group2=new Group2("группа 2");
}
