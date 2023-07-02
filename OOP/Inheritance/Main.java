package OOP.Inheritance;

public class Main{

    public static void main(String[] args) {
        Car car1 = new Car(650,"Blue","2020");
        Car car2 = new Car(220,"Red","1980");
        car1.speedUp("Ferrari");
        car2.slowDown("Lamborgini");
        
        System.out.println(car1.toString());
        System.out.println(car2.toString());

        
    }
}