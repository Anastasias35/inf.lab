package Place;
import Persons.Person;

import java.util.ArrayList;
public class NowLocation{
      protected ArrayList<Location> differentplace=new ArrayList<>();
      public void addDifferentplace(Location location){
         this.differentplace.add(location);;
      }
     public void Detect(Person person){
            while (differentplace.size()>0) {
                for (int i = 0; i < differentplace.size(); i++) {
                    if (person.currentheight == differentplace.get(i).height) {
                        differentplace.get(i).Sneak(person);
                        differentplace.remove(i);
                    }
                   
                }
            }
       }
    @Override
    public String toString() {
        return "NowLocation{" +
                "differentplace=" + differentplace +
                '}';
    }
}
