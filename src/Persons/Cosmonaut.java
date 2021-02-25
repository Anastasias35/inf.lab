package persons;
import enums.Speed;
import enums.Equipment;
import exceptions.InvalidParameterException;

import  java.util.ArrayList;
public class Cosmonaut extends Person {

    ArrayList<Equipment> equipment = new ArrayList<Equipment>();

    public Cosmonaut(String name, int currentheight,int currentpositionofX, int currentpositionofY, int weight){
        super(name,currentheight,currentpositionofX,currentpositionofY,weight);
    }

    //движение
    @Override
    public void  move(){
        if (this.currentheight>0) {
            System.out.println(getName() +" " + Speed.Fast.getword() + " " +"поднимались" );
        }
        else {
            System.out.println(getName() +  " стояли на месте");
        }
    }

    //фиксация техники с локальным классом обозначающим то,к чему крепится все
    public void fix(){
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
            public void connect(Belt belt, Equipment equipment) {
                if (belt==null) throw new InvalidParameterException("null передано в belt");
                if (equipment==null) throw new InvalidParameterException("null передано в equipment");
                System.out.println( name + "к "+ belt.translate + "прикрепили" + equipment.getthing());
            }
        }

        Belt belt=new Belt(" пояс ");
        Fastener fastener =new Fastener("крепеж");

        Equipment[] allequipment = Equipment.values();
        for(Equipment nowequipment:allequipment){
            if (!equipment.contains(nowequipment)){
                fastener.connect(belt, nowequipment);
                equipment.add(nowequipment);
            }
        }
    }
}

