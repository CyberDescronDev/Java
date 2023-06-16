package UserInput;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name :");
        String name = scanner.nextLine();
        System.out.println("Enter your age :");
        int age = scanner.nextInt();
        System.out.println("Enter your profession :");
        scanner.nextLine();
        String job = scanner.nextLine();

        System.out.println("Welcome "+name+".You are "+age+" years old.You work as "+job);
        scanner.close();

    }
}