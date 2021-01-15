package Persons;
import Enum.Equipment;
import Enum.Speed;
import Place.Location;
public class Cosmonaut extends Person {
    protected boolean MoveUp=true;
    public Cosmonaut(String name, int currentheight){
              super(name,currentheight);
              System.out.println("Создан персонаж " + name);
    }
    public void  Move(){
              if (this.currentheight>0) {
                  System.out.println(getName() +" " + Speed.Fast.getword() + " " +"поднимались" );
              }
              else {
                  System.out.println(getName() +  " стояли на месте");
              }
    }
    public void barrier(Location location){
        if (location.condition()){
            System.out.println(name +" используют " + Equipment.IcePeak.getthing() + ",чтобы пройти дальше");
        }
        else{
            System.out.println(name + " беспрепятственно проходят дальше ");
        }
        currentheight +=1;
    }

}
