import Persons.*;
import Place.*;
public class Main {
    public static void main(String[] args) {
        Alien alien= new Alien("Лунатики",0);
        Cosmonaut cosmonaut=new Cosmonaut("Космонавты",1);
        cosmonaut.Move();
        alien.Move();
        alien.presence(cosmonaut);
        alien.printwaiting();
        NowLocation nowLocation=new NowLocation();
        nowLocation.setNowLocation(cosmonaut);
    }
}