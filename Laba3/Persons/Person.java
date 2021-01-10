package Persons;

public abstract  class Person {
    private boolean near=false;
    public abstract String getName();
    public abstract void Move();
    public void exit(Person person){
             if(near){
                 System.out.println(getName() + "находятся вместе с " + person.getName());
             }
             else{
                 System.out.println(getName() + "больше не видят " + person.getName());
             }
    };
}
