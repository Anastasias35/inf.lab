package Place;

public class Grot extends Location{
    public Grot(String name, int height, boolean lowpressure,boolean exit){
        super(name,height,lowpressure,exit);
        System.out.println("Создана локация " + name +", находящаяся на высоте " + height);
    }
}
