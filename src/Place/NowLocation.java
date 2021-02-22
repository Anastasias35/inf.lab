package Place;
import Persons.Person;

import java.util.ArrayList;
public class NowLocation{

    //массив пройденных мест
      protected ArrayList<Location> differentplace=new ArrayList<>();
      public void addDifferentplace(Location location){
         this.differentplace.add(location);;
      }
     public void Detect(Person person){
            for (int j=0;j<differentplace.size();j ++) {
                for (int i = 0; i < differentplace.size(); i++) {
                    if (person.currentheight == differentplace.get(i).height) {
                        differentplace.get(i).Sneak(person);
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
