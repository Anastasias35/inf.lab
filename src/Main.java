import Persons.*;
import Place.*;
public class Main {
    public static void main(String[] args) {
        Alien alien= new Alien("Лунатики",0);
        Cosmonaut cosmonaut=new Cosmonaut("Космонавты",1);
        Cave cave=new Cave("Пещера",3, false, false);
        Grot grot=new Grot("Грот",2,false,false);
        SurfaceofMoon surfaceofMoon=new SurfaceofMoon("Поверхность Луны",4,false,true);
        Tunnel tunnel= new Tunnel("Туннель",1,true,false);
        NowLocation nowLocation=new NowLocation();
        nowLocation.addDifferentplace(cave);
        nowLocation.addDifferentplace(grot);
        nowLocation.addDifferentplace(surfaceofMoon);
        nowLocation.addDifferentplace(tunnel);



        cosmonaut.Move();
        alien.Move();
        alien.presence(cosmonaut);
        alien.printwaiting();
        nowLocation.Detect(cosmonaut);
    }
}
