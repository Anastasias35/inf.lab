package Place;

public class Cave extends Location {
    public Cave(String name, int height, boolean lowpressure,boolean exit){
        super(name,height,lowpressure,exit);
        System.out.println("Создана локация " + name +", находящаяся на высоте " + height);
    }
}
