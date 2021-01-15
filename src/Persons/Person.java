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
    public int getCurrentheigh(){
        return this.currentheight;
    }
    public void setCurrentheight(){
        this.currentheight=currentheight;
    }
    public abstract void Move();
    public void presence(Person person){
             if(person.hashCode()==currentheight){
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
    public String toString(){
            return name+" на высоте " +currentheight;
    }
    @Override
    public int hashCode(){
        return this.currentheight;
    }
}
