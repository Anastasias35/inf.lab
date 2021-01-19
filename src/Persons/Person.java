package Persons;

import Interface.Waiting;

public abstract  class Person implements Waiting {
    protected final  String name;
    protected  int currentheight;
    private  boolean near;
    public Person(String name,int currentheight){
         this.name=name;
         this.currentheight=currentheight;
    }
    public String getName(){
        return this.name;
    }
    public int getCurrentheight(){
        return this.currentheight;
    }
    public void setCurrentheight(){
        this.currentheight=currentheight;
    }
    public abstract void Move();
    public void presence(Person person){
             if(person.getCurrentheight()==currentheight){
                 System.out.println(getName() + " находятся вместе с " + person.getName());
                 near=true;
             }
             else{
                 System.out.println(getName() + " больше не видят " + person.getName());
                 System.out.println(person.getName() + " скрываются из виду");
                 near=false;
             }
    };
    @Override
    public boolean waiting(){
        return near ;
    }
    @Override
    public void printwaiting(){
        if (waiting()){
            System.out.println(getName() + " не ждут возвращения" );
        }
        else {
            System.out.println(getName() + " ждут возвращения" );
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return currentheight == person.currentheight &&
                near == person.near &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, currentheight, near);
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", currentheight=" + currentheight + ", near=" + near + '}';
    }
}
