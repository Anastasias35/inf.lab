package Device;
import Persons.*;
import Interface.Pressing;
public class DeviceOfWieghlessness extends Device {
    public DeviceOfWieghlessness(String name, Boolean activation){
        super(name,activation);
    }
    Pressing button=new Pressing() {
        @Override
        public boolean checkpress() {
            return activation;
        }

        @Override
        public void printpress() {
            if (checkpress())  System.out.println("нажал на кнопку");
        }
    };
    public boolean Working(Person person) {
        if (activation) {
            System.out.println(name + "поднимает в воздух" + person.getName());
            person.currentheight +=1;
            person.weight=0;
            return true;
        }
        else return false;
    }
    @Override
    // включение прибора
    public  void turnon(Person person){
        System.out.println(person.getName() + "включает" + name);
        activation=true;
        propeller.spin();
    }
    @Override
    //выключение прибора
    public void turnoff(Person person){
        System.out.println(person.getName() + " выключает "+name );
        activation=false;
        propeller.rotation=false;
    }
    Electricmotor electricmotor= new Electricmotor();
    Propeller propeller=new Propeller();
    class Electricmotor{
        final String name ;
        Boolean working;
        //состояние прибора соответствует рабочему состоянию двигателя
        public Electricmotor(){
            this.name="Электродвигатель";
            this.working=button.checkpress();
            button.printpress();

        }
        public Electricmotor(String name, Boolean working){
            this.working=DeviceOfWieghlessness.this.activation;
            this.name=name;
        }

    }
    class Propeller{
        Boolean rotation;
        final String name;
        public Propeller(){
            this.name="Пропеллер";
            this.rotation=null;
        }
        public Propeller(String name, Boolean rotation){
            this.name=name;
            this.rotation=rotation;
        }
        void spin(){
            rotation=true;
            System.out.println(name + " завертелся");
        }
    }

}
