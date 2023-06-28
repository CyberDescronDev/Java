package HashMap;

import java.util.Collection;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> employees = new HashMap<>();
        employees.put("Keylane", 12_000);
        employees.put("Alex",20_000);
        employees.put("Xavier",7_000);
        
            for (Integer j : employees.values()) {
                if(j < 10_000){
                    System.out.println("You need a raise");
                    employees.put("Xavier", 10_000);
                    
                } 
            }
            System.out.println(employees.values());
           
        }
    }

