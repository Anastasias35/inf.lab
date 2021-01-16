import Persons.*;
import Place.*;
public class Main {
    public static void main(String[] args) {
        Alien alien= new Alien("Лунатики",0);
        Cosmonaut cosmonaut=new Cosmonaut("Космонавты",1);
        Tunnel tunnel=new Tunnel("Туннель",1,true,false);
        Grot grot=new Grot("Грот",2,false,false);
        Cave cave=new Cave("Пещера",3,false,false);
        SurfaceofMoon surfaceofMoon=new SurfaceofMoon("Поверхность Луны",4,false,true);
        cosmonaut.Move();
        alien.Move();
        alien.presence(cosmonaut);
        alien.printwaiting();
        while (cosmonaut.getCurrentheigh() <= surfaceofMoon.getHeight()){
            if (cosmonaut.getCurrentheigh() == grot.getHeight()) {
                grot.Sneak(cosmonaut);
                cosmonaut.barrier(grot);
            }
            else if (cosmonaut.getCurrentheigh() == cave.getHeight()) {
                cave.Sneak(cosmonaut);
                cosmonaut.barrier(cave);
            }
            else if (cosmonaut.getCurrentheigh() == tunnel.getHeight()) {
                tunnel.Sneak(cosmonaut);
                cosmonaut.barrier(tunnel);
            }
            else if (cosmonaut.getCurrentheigh() == surfaceofMoon.getHeight()) {
                surfaceofMoon.Sneak(cosmonaut);
                cosmonaut.barrier(surfaceofMoon);
            }
        }
    }
}
