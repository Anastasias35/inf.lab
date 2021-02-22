import Device.DeviceOfWieghlessness;
import Persons.*;
import Place.*;

public class Main {
    public static void main(String[] args) {
         Alien alien = new Alien("Лунатики", 0,13);
        Cosmonaut cosmonaut = new Cosmonaut("Космонавты", 1,23);
        Znaika znaika = new Znaika("Знайка", 0, 1,44);
        Fuchsia fuchsia = new Fuchsia("Фуксия", 0, 1,55);
        ProfessorZvezdochkin professorZvezdochkin = new ProfessorZvezdochkin("Профессор Звездочкин", 0, 1,50);
        Selyodochka selyodochka = new Selyodochka("Селедочка", 0, 1,50);
        Shpuntik shpuntik = new Shpuntik("Шпунтик", 3, 2,44);
        Vintik vintik = new Vintik("Винтик", 3, 2,43);
        DeviceOfWieghlessness deviceOfWieghlessness = new DeviceOfWieghlessness("Прибор невесомости", false);
        NowLocation nowLocation = new NowLocation();
        cosmonaut.Fix();
        deviceOfWieghlessness.turnon(znaika);
        deviceOfWieghlessness.Working(znaika);
        deviceOfWieghlessness.Working(cosmonaut);
        alien.Surprising(deviceOfWieghlessness, cosmonaut);
        Cave cave = new Cave("Пещера", 3, false, false);
        Grot grot = new Grot("Грот", 2, false, false);
        SurfaceofMoon surfaceofMoon = new SurfaceofMoon("Поверхность Луны", 4, false, true);
        Tunnel tunnel = new Tunnel("Туннель", 1, true, false);
        nowLocation.addDifferentplace(cave);
        nowLocation.addDifferentplace(grot);
        nowLocation.addDifferentplace(surfaceofMoon);
        nowLocation.addDifferentplace(tunnel);
        cosmonaut.Move();
        alien.Move();
        alien.presence(cosmonaut);
        alien.printwaiting();
        nowLocation.Detect(cosmonaut);
        znaika.Separate(professorZvezdochkin);
        znaika.Separate(alien);
        znaika.Separate(cosmonaut);
        znaika.Separate(fuchsia);
        znaika.Separate(vintik);
        znaika.Separate(shpuntik);
        znaika.Separate(selyodochka);
    }
}
