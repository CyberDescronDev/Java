package OOP.Abstraction;

abstract class Human {
    public abstract void cry();
    public abstract void laugh();
    public void eat(){
        System.out.println("You got any cheese?");
    }
    public void sleep(){
        System.out.println("ZzZ ZzZ ZzZ");
    }
}
