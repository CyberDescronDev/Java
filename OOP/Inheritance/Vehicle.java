package OOP.Inheritance;

public class Vehicle {
    int wheels;
    String color;
    String modelYear;
    String name;


    public void speedUp(String name){
        this.name = name;
        System.out.println(name+" is speeding up");
    }
    public void slowDown(String name){
        this.name = name;
        System.out.println(name+" is slowing down");
    }

}
