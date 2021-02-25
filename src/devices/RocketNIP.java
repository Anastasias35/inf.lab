package devices;
import exceptions.InvalidParameterException;
import places.*;
import exceptions.HeightException;
import java.util.ArrayList;

public class RocketNIP extends Device {
    protected int height;
    public RocketNIP(String name,Boolean activation, int height){
        super(name, activation);
        if (height < 0) throw new InvalidParameterException("Поле height не может быть меньше 0");
        this.height=height;
        System.out.println("Создан аппарат " + name);
    }

    public void landing(Location location){
        if (location==null) throw new InvalidParameterException("null передается в location");
        System.out.println(name + " приземлилась на "+ location.getName());
        activation =false;
        height =location.getHeight();
    }
    public int sinking() throws HeightException{
        System.out.println(name + "опускается");
        height -=1;
        if (height <0) {
            throw new HeightException("Высота ракеты над землей меньше 0");
        }
        return height;
    }

    @Override
    public void working(){
        try {
            sinking();
        } catch (HeightException e){
            System.err.println(e.getMessage() + "она разбилась");
        }
    }

     public void check(ArrayList<String> group1) {
       for (int i=0;i<group1.size();i++){
           System.out.println(group1);
       }
       System.out.println();
    }

     public int getHeight(){
        return height;
    }

    public void setHeight(){
        if (height < 0) throw new InvalidParameterException("height не может быть меньше 0");
        this.height=height;
    }
}
