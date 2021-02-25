package persons;
import devices.DeviceOfWieghlessness;
import exceptions.InvalidParameterException;

public class Alien extends Person {
    public Alien(String name, int currentheight,int currentpositionofX, int currentpositionofY, int weight){
        super(name,currentheight,currentpositionofX,currentpositionofY,weight);
    }
    public void surprising(DeviceOfWieghlessness deviceOfWieghlessness, Person person) {
        if (deviceOfWieghlessness==null) throw new InvalidParameterException("null передано в deviceofWeighlessness");
        if (person==null) throw new InvalidParameterException("null передано в person");
        if (deviceOfWieghlessness.committing(person)) {
            System.out.println(name + " ахнули от изумления");
            class Cap {
                public  final String translate;
                public Cap(String translate) {
                    this.translate=translate;
                }
                public void toss() {
                    System.out.println(name + " подбрасывает " +translate);
                }
            }
            Cap cap=new Cap(" Шапка ");
            cap.toss();
        }
    };
}
