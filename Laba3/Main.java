import Persons.*;
import Place.*;
public class Main {
    public static void main(String[] args) {
        Alien alien= new Alien();
        Cosmonaut cosmonaut=new Cosmonaut();
        Cave cave=new Cave();
        Grot grot=new Grot();
        SurfaceofMoon surfaceofMoon= new SurfaceofMoon();
        Tunnel tunnel=new Tunnel();
        cosmonaut.Move();
        cosmonaut.printvanishing();
        alien.Move();
        alien.exit(cosmonaut);
        alien.printvanishing();
        alien.printwaiting();
        cave.Sneak(cosmonaut);
        cave.printCondition();
        grot.Sneak(cosmonaut);
        tunnel.Sneak(cosmonaut);

        surfaceofMoon.Exit(cosmonaut);
    }

}