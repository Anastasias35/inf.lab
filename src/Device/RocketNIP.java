package Device;
import Persons.Person;
import Place.*;
import Exception.HeightException;
import Exception.MassiveException;

import java.util.ArrayList;

public class RocketNIP extends Device {
    protected int height=10;
    public RocketNIP(String name,Boolean activation){
        super(name, activation);
        System.out.println("Создан аппарат " + name);
    }
    public void Working(Location location){
        System.out.println(name + " приземлилась на "+ location.getName());
        activation = true;
        height =location.getHeight();
    }
    public int Landing() throws HeightException{
        System.out.println(name + "опускается");
        height -=1;
        if (height <0) {
            throw new HeightException("Высота ракеты над землей меньше 0");
        }
        return height;
    }
    @Override
    public void Working(){
        try {
            Landing();
        } catch (HeightException e){
            System.err.println(e.getMessage() + "она разбилась");
        }
    }
     public void Check(ArrayList<String> group1) {
       for (int i=0;i<group1.size();i++){
           System.out.println(group1);
       }
       System.out.println();
    }
}
