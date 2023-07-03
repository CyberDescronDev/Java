package Constructors;

public class Human {
    int age;
    String name;
    int height;
    int weight;

    Human(){

    }
    Human(String name,int age){
        this.name = name;
        this.age = age;
    }
    Human(String name,int age,int weight,int height){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    String print(){
        String print = "Name : "+name+"\nAge :"+age;
        return print;
    }
    String printAll(){
        String print = "Name : "+name+"\nAge :"+age+"\nWeight :"+weight+"\nHeight :"+height;
        return print;
    }
}
