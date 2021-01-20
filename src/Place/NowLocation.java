package Place;

import Persons.Person;
import Place.Placetype;
public class NowLocation extends Location {
    public void setNowLocation(Person person) {
        while (!exit) {
            for (Placetype nowLocation : Placetype.values()) {
                if (person.currentheight == nowLocation.getHight()) {
                    name = nowLocation.getName();
                    exit = nowLocation.isExit();
                    lowpressure = nowLocation.isLowpressure();
                }
            }
            Sneak(person);
        }
    }
}
