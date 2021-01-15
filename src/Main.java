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
        int currentlocation=cosmonaut.getCurrentheigh();
        while (currentlocation <= surfaceofMoon.getHeight()){
            if (currentlocation == grot.getHeight()) {
                grot.Sneak(cosmonaut);
                grot.printCondition();
                cosmonaut.barrier(grot);
                grot.output(cosmonaut);
                currentlocation +=1;
            }
            else if (currentlocation == cave.getHeight()) {
                cave.Sneak(cosmonaut);
                cave.printCondition();
                cosmonaut.barrier(cave);
                cave.output(cosmonaut);
                currentlocation +=1;
            }
            else if (currentlocation == tunnel.getHeight()) {
                tunnel.Sneak(cosmonaut);
                tunnel.printCondition();
                cosmonaut.barrier(tunnel);
                cave.output(cosmonaut);
                currentlocation +=1;
            }
            else if (currentlocation == surfaceofMoon.getHeight()) {
                surfaceofMoon.Sneak(cosmonaut);
                surfaceofMoon.printCondition();
                cosmonaut.barrier(surfaceofMoon);
                surfaceofMoon.output(cosmonaut);
                currentlocation +=1;
            }
        }
    }
}