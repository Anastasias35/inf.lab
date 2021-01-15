package Persons;
import Interface.Waiting;
import Persons.Cosmonaut;
public class Alien extends Person{
           public Alien(String name, int currentheight){
               super(name,currentheight);
               System.out.println("Создан персонаж " + name);
           }
           public void Move(){
               if (this.currentheight>0) {
                   System.out.println(getName() + " двигались");
               }
               else{ System.out.println(getName() + " стояли на месте");}
           }
}
