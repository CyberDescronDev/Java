package Operators;

public class Main {
    public static void main(String[] args) {
        
        /*
         * + --> Addition
         * - --> Subtraction
         * / --> Division
         * * --> Multiplication
         * % --> Modulus
         * ++ --> Increment
         * -- --> Decrement
         */

        int num = 3;
        int num2 = 3;
        System.out.println(num + num2);
        System.out.println(num - num2);
        System.out.println(num / num2);
        System.out.println(num * num2);
        System.out.println(num % num2);
        System.out.println(num++); // num++ First prints the number then increments
        System.out.println(num2--); // num2-- First prints the number then decrements

        System.out.println(num); // Num got incremented by 1 
        System.out.println(num2); // Num2 got decremented by 1

        System.out.println(++num); // ++num First increments the value by one and then prints the value
        System.out.println(--num2); // --num2 First decrements the value by one and then prints the value

        System.out.println(num);
        System.out.println(num2);

        System.out.println("-----------------------------------");

        double val = 5.5;
        double val2 = 2;
        val += val2; // += adds the value of val2 to val
        System.out.println(val);

        float fnum = 2.3F;
        float fnum2 = 1.3F;
        fnum -= fnum2; // -= subtracts fnum from fnum2 and assigns the value to fnum
        System.out.println(fnum);

        byte bnum = 12;
        byte bnum2 = 2;
        bnum *= bnum2; // *= multiplies bnum with bnum2 and assigns the value to bnum
        System.out.println(bnum);

        long lnum = 121;
        long lnum2 = 11;
        lnum /= lnum2; // /= divides lnum by lnum2 and assings the value to lnum
        System.out.println(lnum);






    }
}
