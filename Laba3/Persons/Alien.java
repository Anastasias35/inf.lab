package Persons;
import Enum.Mood;
import Interface.Waiting;
import Interface.Vanishing;
public class Alien extends Person implements Vanishing,Waiting{
           protected boolean noshow=true;
           protected boolean moving=false;
           @Override
           public String getName(){
               return "Лунные коротышки";
            }
           public void Move(){
               if (moving) {
                   System.out.println(getName() + " двигались");
               }
               else{ System.out.println(getName() + " стояли на месте");}
           }
            @Override
            public boolean vanishing(){
                return noshow;
            }
            @Override
            public void printvanishing(){
                if (noshow){
                    System.out.println(getName() + " " + Mood.Sad.getword());
                }
                else{
                    System.out.println(getName() +" " + Mood.Happy.getword());
                }
           }
           @Override
           public boolean waiting(){
               return noshow;
           }
           @Override
           public void printwaiting(){
               if (noshow){
                   System.out.println(getName() + " ждут несколько часов");
               }
           }
}
