package devices;
import persons.Person;

import java.util.Objects;
import exceptions.InvalidParameterException;

public abstract  class Device {
    protected final String name;
    protected Boolean activation;

    public Device(String name, Boolean activation) {
        if (name ==null) throw new InvalidParameterException("Поле name не может быть null");
        if (activation ==null) throw new InvalidParameterException("Поле activate не может быть null");
        this.name = name;
        this.activation = activation;
        System.out.println("Создан аппарат" + name);
    }

    public void working() {
        if (activation) {
            System.out.println(name + "работает");
        }
    }

    // включение прибора
    public void turnon(Person person) {
        if (person==null) throw new InvalidParameterException("null передается в person");
        if(!activation){
            System.out.println(person.getName() + "включает" + name);
            activation = true;
        }
        else{
            System.out.println(name + "уже был включен");
            System.out.println(person.getName() + " не нужно включать ");
        }
    }

    //выключение прибора
    public void turnoff(Person person) {
        if (person==null) throw new InvalidParameterException("null передается в person");
        if(activation){
            System.out.println(person.getName() + " выключает " + name);
            activation = false;
        }
        else{
            System.out.println(name + "уже был выключен");
            System.out.println(person.getName() + "не нужно выключать");
        }
    }
    public void setActivation(){
        if (activation ==null) throw new InvalidParameterException("Поле activate не может быть null");
        this.activation=activation;
    }
    public String getName() {
        if (name ==null) throw new InvalidParameterException("Поле name не может быть null");
        return this.name;
    }

    public Boolean getActivation(){
        if (activation ==null) throw new InvalidParameterException("Поле activate не может быть null");
        return this.activation;
    }
    @Override
    public String toString() {
        return "Device{" +
                "name='" + name + '\'' +
                ", activation=" + activation +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return Objects.equals(name, device.name) &&
                Objects.equals(activation, device.activation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, activation);
    }
}
