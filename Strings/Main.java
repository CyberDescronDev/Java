package Strings;

public class Main {
    public static void main(String[] args) {


        String name = "Tunc";
        System.out.println(name.length()); // Prints the length of the string
        System.out.println(name.concat(" Welcome")); // Strings are immutable
        System.out.println(name); // Strings are immutable
        System.out.println(name.charAt(0)); // Prints the specified char index
        System.out.println(name.codePointAt(0)); // Returns unicode representation of specified index
        System.out.println(name.contains("nc")); // Returns true if string contains specified char values
        System.out.println(name.endsWith("u")); // Returns true if string ends with specified suffix.In this case it ends with c or nc or unc ..
        System.out.println(name.toUpperCase()); // Returns uppercase string
        System.out.println(name.toLowerCase()); // Returns lowercase string
        System.out.println(name.equalsIgnoreCase("tunc")); // Returns true because comparison ignores case
        System.out.println(name.equals("tunc")); // Returns false because Tunc is not equal to tunc
        System.out.println(10+20+name); // Code gets executed from left to right thus it first adds the values then prints the name.(Like a normal addition operation would do)
        System.out.println(name + 10+20); // Here string comes first so other integers gets treated as strings(Here addition operation gets treated as concatenation operation would do) 
        System.out.println(name + 10*20); // Here we have different scenario because Multiplation sign gets executed before the Addition sign so compiler first multiplies two integers and then concatenates them to string.

        String name2 = " Hello World ";
        System.out.println(name2.trim()); // Returns string with all leading and trailing white spaces removed
        System.out.println(name2.replace(name2, "Hell World")); // Returns replaced string 
        System.out.println(name2.isEmpty()); // Returns true if specified string is empty ("")
        System.out.println(name2.isBlank()); // Returns true if specified string is blank ("    ")
        String name3 = "  ";
        System.out.println(name3.isEmpty()); // name3 isn't empty it contains only whitespaces
        System.out.println(name3.isBlank()); // name3 is blank because it only contains whitespaces





    }
}
