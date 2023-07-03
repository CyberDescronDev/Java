package OOP.Polymorphism;

public class Main {
    public static void main(String[] args) {
          Attackers attacker = new Attackers();
          Archer archer = new Archer();
          Warrior warrior = new Warrior();
          attacker.attack();
          archer.attack();
          warrior.attack();      
    }
}
