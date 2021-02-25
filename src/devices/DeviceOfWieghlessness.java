package devices;
import exceptions.InvalidParameterException;
import persons.*;
import interfaces.Pressing;

import java.util.Objects;

public class DeviceOfWieghlessness extends Device { //посмотреть насчет throw
    protected int positionX;
    protected int positionY;
    public DeviceOfWieghlessness(String name, Boolean activation,int positionX,int positionY) {
        super(name,activation);
        this.positionX=positionX;
        this.positionY=positionY;
    }
    //совершает работу над определенным персонажем
    public boolean committing(Person person) {
        if (positionY==person.getCurrentpositionofY() && positionY==person.getCurrentpositionofX()) {
            if (activation) {
                System.out.println(name + "поднимает в воздух" + person.getName());
                person.currentheight += 1;
                person.weight = 0;
                return true;
            } else return false;
        }else return false;
    }
    // включение прибора
    @Override
    public  void turnon(Person person){
        if (person==null) throw new InvalidParameterException("null передается в person");
        if(!activation){
            System.out.println(person.getName() + "включает" + name);
            activation = true;
            positionX=person.getCurrentpositionofX();
            positionY=person.getCurrentpositionofY();
        }
        else{
            System.out.println(name + "уже был включен");
            System.out.println(person.getName() + " не нужно включать ");
        }
        propeller.spin();
    }
    //выключение прибора
    @Override
    public void turnoff(Person person){
        if (person==null) throw new InvalidParameterException("null передается в person");
        if(!activation){
            System.out.println(person.getName() + "включает" + name);
            activation = true;
            positionX=person.getCurrentpositionofX();
            positionY=person.getCurrentpositionofY();
        }
        else{
            System.out.println(name + "уже был включен");
            System.out.println(person.getName() + " не нужно включать ");
        }
        propeller.rotation=false;
    }

    // класс кнопки,на которую нужно нажать
    Pressing button=new Pressing() {
        @Override
        public boolean checkpress() {
            return activation;
        }
        @Override
        public void printpress() {
            if (checkpress())  {
                System.out.println("нажал на кнопку");
            }
        }
    };

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
    Electricmotor electricmotor= new Electricmotor();

    class Propeller{
        Boolean rotation;
        final String name;
        public Propeller(){
            this.name="Пропеллер";
            this.rotation=false;
        }
        void spin(){
            rotation=true;
            System.out.println(name + " завертелся");
        }
    }
    Propeller propeller=new Propeller();

    public int getPositionX(){
       return this.positionX;
    }

    public int getPositionY(){
        return this.positionY;
    }

    @Override
    public String toString() {
        return "DeviceOfWieghlessness{" +
                "positionX=" + positionX +
                ", positionY=" + positionY +
                ", button=" + button +
                ", electricmotor=" + electricmotor +
                ", propeller=" + propeller +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DeviceOfWieghlessness that = (DeviceOfWieghlessness) o;
        return positionX == that.positionX &&
                positionY == that.positionY &&
                Objects.equals(button, that.button) &&
                Objects.equals(electricmotor, that.electricmotor) &&
                Objects.equals(propeller, that.propeller);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), positionX, positionY, button, electricmotor, propeller);
    }
}
