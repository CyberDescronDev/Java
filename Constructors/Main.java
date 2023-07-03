package Constructors;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human();
        Human human2 = new Human("İvan", 24);
        Human human3 = new Human("Vika", 24, 55, 170);
        System.out.println(human1.print());
        System.out.println(human2.print());
        System.out.println(human3.printAll());
    }
}
