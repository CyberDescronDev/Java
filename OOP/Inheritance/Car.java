package OOP.Inheritance;

public class Car extends Vehicle{
    int horsePower;
    Car(int horsePower,String color,String modelYear){
        this.horsePower = horsePower;
        this.color = color;
        this.modelYear = modelYear;
    }
    public void honk(){
        System.out.println("Green light");
    }
    public String toString(){
        String print = ("Horsepower :"+horsePower+"\nColor :"+color+"\nModel year :"+modelYear);
        return print;
    }
}
