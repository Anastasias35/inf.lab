package Place;

public class SurfaceofMoon extends Location{
    public SurfaceofMoon(String name, int height, boolean lowpressure, boolean exit){
        super(name,height,lowpressure,exit);
        System.out.println("Создана локация " + name +", находящаяся на высоте " + height);
    }
}

