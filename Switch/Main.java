package Switch;

public class Main {
    public static void main(String[] args) {
        char letter = 'C';

        switch(letter){
            case 'A' : System.out.println("It is A");
            break;
            case 'B' : System.out.println("It is B");
            break;
            case 'c' : System.out.println("It is c");
            break;
            case 'C' : System.out.println("It is C");
            break;
            default : System.out.println("Enter valid character");
            break;
        }
    }
}
