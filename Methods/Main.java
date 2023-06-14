package Methods;

public class Main {
    public static void main(String[] args) {
        sayHi();
        sayHello("Tunc");
        sayHello("Dima");
        sayHello("Vlad");
        sayHello("Masha", 26);
        System.out.println(add(3,5));
        System.out.println(add(3.0, 5.6));
        Main myObj = new Main();
        System.out.println(myObj.add(1.2F,2.2F));
        
    }
    // static means method belongs to the class rather than object
    // void means method doesn't return anything
    static void sayHi(){
        System.out.println("Hello");
    }
    // methods with parameters
    static void sayHello(String name){
        System.out.println("Hello "+name);
    }
    // method overloading
    // method overloading is done by using different parameters
    static void sayHello(String name,int age){
        System.out.println("Hello "+name+" You are "+age);
    }
    // method return type
    // methods can return values
    static int add(int i,int j){
        return i+j;
    }
    static double add(double i,double j){
        double sum = i+j;
        return sum;
    }
    // non-static methods can be called by creating an object whereas static methods do not need an object to call it.
    float add(float i,float j){
        return i+j;
    }




}
