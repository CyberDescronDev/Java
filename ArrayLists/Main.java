package ArrayLists;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        // ArrayList is different than Arrays.
        // ArrayLists are resizable Arrays are not.
        // ArrayLists are good for data manipulation such as adding elements or removing elements from an array.

        ArrayList<String> strArr = new ArrayList<>();

        strArr.add("A");
        strArr.add("B");
        strArr.add("C");
        strArr.add("D");
        strArr.add("E");

        System.out.println(strArr);

        strArr.add(5, "F");

        System.out.println(strArr);
        System.out.println(strArr.contains("E"));
        strArr.remove("F");
        strArr.remove(4);
        System.out.println(strArr);

        System.out.println(strArr.get(0));

        strArr.set(1, "Z");
        
        System.out.println(strArr);

        System.out.println(strArr.size());
        
        

    

        
    }
}