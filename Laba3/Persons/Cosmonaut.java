package Persons;
import Interface.Vanishing;
import Enum.Speed;
public class Cosmonaut extends Person implements Vanishing{
          protected boolean noshow=true;
          protected boolean moving=true;
          @Override
          public String getName(){
              return "Космонавты";
          }
          public void  Move(){
              if (moving) {
                  System.out.println(getName() +" " + Speed.Fast.getword() + " " +"поднимались" ); //кверху добавить (сделать это с помощью добавления
              }
              else {
                  System.out.println(getName() +  "стояли на месте");
              }
          }
          @Override
          public boolean vanishing(){
              return noshow;
          }
          @Override
          public void printvanishing(){
              if (noshow){
                  System.out.println(getName() + " скрываются из виду");
              }
              else{
                  System.out.println(getName() + " прогуливаются" );
              }
          }

}
