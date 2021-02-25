import devices.DeviceOfWieghlessness;
import devices.RocketNIP;
import persons.*;
import places.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> allperson=new ArrayList<Person>();
        Alien alien = new Alien("Лунатики", 0,13,25,34);
        allperson.add(alien);
        Cosmonaut cosmonaut = new Cosmonaut("Космонавты", 0,22,22,46);
        allperson.add(cosmonaut);
        Znaika znaika = new Znaika("Знайка", 0, 22,22,30,1);
        allperson.add(znaika);
        Fuchsia fuchsia = new Fuchsia("Фуксия", 0, 1,3,25,1);
        allperson.add(fuchsia);
        ProfessorZvezdochkin professorZvezdochkin = new ProfessorZvezdochkin("Профессор Звездочкин", 0, 1,50,66,1);
        allperson.add(professorZvezdochkin);
        Selyodochka selyodochka = new Selyodochka("Селедочка", 0, 1,50,44,1);
        allperson.add(selyodochka);
        Shpuntik shpuntik = new Shpuntik("Шпунтик", 3, 2,44,33,2);
        allperson.add(shpuntik);
        Vintik vintik = new Vintik("Винтик", 3, 2,43,33,2);
        allperson.add(znaika);

        RocketNIP rocketNIP=new RocketNIP("Ракета НИП",true, 10);
        DeviceOfWieghlessness deviceOfWieghlessness = new DeviceOfWieghlessness("Прибор невесомости", false,0,0);

        NowLocation nowLocation = new NowLocation();

        cosmonaut.fix();
        deviceOfWieghlessness.turnon(znaika);
        for(Person person1:allperson){
            deviceOfWieghlessness.committing(person1);
        }
        alien.surprising(deviceOfWieghlessness, cosmonaut);


        Cave cave = new Cave("Пещера", 3, false, false);
        Grot grot = new Grot("Грот", 2, false, false);
        SurfaceofMoon surfaceofMoon = new SurfaceofMoon("Поверхность Луны", 4, false, true);
        Tunnel tunnel = new Tunnel("Туннель", 1, true, false);

        nowLocation.addDifferentplace(cave);
        nowLocation.addDifferentplace(grot);
        nowLocation.addDifferentplace(surfaceofMoon);
        nowLocation.addDifferentplace(tunnel);

        cosmonaut.move();
        alien.move();
        alien.presence(cosmonaut);
        alien.printwaiting();
        nowLocation.detect(cosmonaut);
        znaika.separate(professorZvezdochkin);
        znaika.separate(alien);
        znaika.separate(cosmonaut);
        znaika.separate(fuchsia);
        znaika.separate(vintik);
        znaika.separate(shpuntik);
        znaika.separate(selyodochka);
        Znaika.Group1 group1= new Znaika.Group1("группа 1");

    }
}
