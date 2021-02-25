package places;
import exceptions.InvalidParameterException;
import persons.Person;

import java.util.ArrayList;
public class NowLocation{

    //массив пройденных мест
      protected ArrayList<Location> differentplace=new ArrayList<>();
      public void addDifferentplace(Location location){
          if (location==null) throw new InvalidParameterException("null передано в location");
          this.differentplace.add(location);;
      }
     public void detect(Person person){
          if (person==null) throw new InvalidParameterException("null передано в person");
            for (int j=0;j<differentplace.size();j ++) {
                for (int i = 0; i < differentplace.size(); i++) {
                    if (person.currentheight == differentplace.get(i).height) {
                        differentplace.get(i).sneak(person);
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
