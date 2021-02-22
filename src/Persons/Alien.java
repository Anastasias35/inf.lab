package Persons;
import Device.DeviceOfWieghlessness;

import java.util.ArrayList;

public class Alien extends Person {
           public Alien(String name, int currentheight, int weight){
               super(name,currentheight,weight);
               System.out.println("Создан персонаж " + name);
           }
    public void Surprising(DeviceOfWieghlessness deviceOfWieghlessness, Person person) {
               if (deviceOfWieghlessness.Working(person)) {
               System.out.println(name + " ахнули от изумления");
                   class Cap {
                       public  final String translate;
                       public Cap(String translate) {
                           this.translate=translate;
                       }
                       public void Toss() {
                           System.out.println(name + " подбрасывает " +translate);
                       }
                   }
                   Cap cap=new Cap(" Шапка ");
                   cap.Toss();
        }
        };
}
