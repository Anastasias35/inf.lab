package Persons;
import Enum.Speed;
import Enum.Equipment;
import  java.util.ArrayList;
public class Cosmonaut extends Person {
    ArrayList<Equipment> equipment = new ArrayList<Equipment>();
    protected boolean MoveUp=true;
    public Cosmonaut(String name, int currentheight, int weight){
              super(name,currentheight,weight);
              System.out.println("Создан персонаж " + name);
    }
    //движение
    @Override
    public void  Move(){
              if (this.currentheight>0) {
                  System.out.println(getName() +" " + Speed.Fast.getword() + " " +"поднимались" );
              }
              else {
                  System.out.println(getName() +  " стояли на месте");
              }
    }
    //фиксация техники с локальным классом обозначающим то,к чему крепится все
    public void Fix(){
           class Belt {
               public  final String translate;
               public Belt(String translate) {
                   this.translate=translate;
               }

           }
           class Fastener{
               public final String translate;
               public Fastener(String  translate){
                   this.translate=translate;
               }
               public void Connect(Belt belt, Equipment equipment) {
                   System.out.println( name + "к "+ belt.translate + "прикрепили" + equipment.getthing());
               }
           }
           Belt belt=new Belt(" пояс ");
           Fastener fastener =new Fastener("крепеж");

            Equipment[] allequipment = Equipment.values();
                for(Equipment nowequipment:allequipment){
                    if (equipment.contains(nowequipment) !=true){
                        fastener.Connect(belt, nowequipment);
                        equipment.add(nowequipment);
                    }
                }
    }
}

