package IfElse;

public class Main {
    public static void main(String[] args) {
        int age = 24;

        if(age < 18){
            System.out.println("You are minor");
        }else if(age >= 18 && age < 30){
            System.out.println("Youngblood");
        }else if(age >=30 && age < 65){
            System.out.println("Adult");
        }else{
            System.out.println("Elderly");
        }
        // Short if-else statement
        String checkAge = (age >= 24) ? "Adult or Elder" : "Minor";
        System.out.println(checkAge);
        
        //Nested if-else
        if(age > 0 && age < 18){
            if(age < 6){
                System.out.println("baby");
            }else if(age >= 6 && age < 12){
                System.out.println("Child");
            }else{
                System.out.println("Waiting for 18");
            }
        }else if(age >= 18 && age < 30){
            if(age < 22){
                System.out.println("College student");
            }else if(age >= 22 && age < 26){
                System.out.println("Seeking job");
            }else{
                System.out.println("Married");
            }
        }else{
            System.out.println("Elder");
        }



    }
}
