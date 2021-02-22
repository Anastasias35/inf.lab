package Device;
import Persons.Person;

import java.util.Objects;

public abstract  class Device {
    protected final String name;
    protected Boolean activation;

    public Device(String name, Boolean activation) {
        this.name = name;
        this.activation = activation;
        System.out.println("Создан аппарат" + name);
    }
    public void Working() {
        if (activation) {
            System.out.println(name + "работает");
        }
    }
    public String getName() {
        return this.name;
    }
    // включение прибора
    public void turnon(Person person) {
        System.out.println(person.getName() + "включает" + name);
        activation = true;
    }
    //выключение прибора
    public void turnoff(Person person) {
        System.out.println(person.getName() + " выключает " + name);
        activation = false;
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
