package Variables;



public class Main {
    public static void main(String[] args) {
        byte byteNum = 127; // range -128 - +127, Primitive type
        short shortNum = 32000; // range -32768 - +32767, Primitive type
        int intNum = 15; // range -2 bil - +2 bil, Primitive type
        long longNum = -20; // range -2 to the power of 63 - 2 to the power of 63, Primitive type
        float floatNum = 3.14F;// range very long stores decimals, Primitive type
        double doubleNum = 2.125123; // range very long stores decimals, Primitive type
        char character = 'T'; // stores single characters Primitive, type
        boolean isTrue = true; // stores true or false  Primitive, type

        String name = "Welcome"; // stores strings, Reference type

        System.out.println("Byte number : "+byteNum);
        System.out.println("Short number : "+shortNum);
        System.out.println("Int number : "+intNum);
        System.out.println("Long number : "+longNum);
        System.out.println("Float number : "+floatNum);
        System.out.println("Double number : "+doubleNum);
        System.out.println("Character : "+character);
        System.out.println("Boolean : "+isTrue);
        System.out.println("String : "+name);

        System.out.println("****************Type Checking***********************");

        System.out.println("Type of byteNum : "+((Object)byteNum).getClass().getSimpleName() );
        System.out.println("Type of shortNum : "+((Object)shortNum).getClass().getSimpleName() );
        System.out.println("Type of intNum : "+((Object)intNum).getClass().getSimpleName() );
        System.out.println("Type of longNum : "+((Object)longNum).getClass().getSimpleName());
        System.out.println("Type of floatNum : "+((Object)floatNum).getClass().getSimpleName() );
        System.out.println("Type of doubleNum : "+((Object)doubleNum).getClass().getSimpleName() );
        System.out.println("Type of character : "+((Object)character).getClass().getSimpleName() );
        System.out.println("Type of isTrue : "+((Object)isTrue).getClass().getSimpleName());
        System.out.println("Type of name : "+((Object)name).getClass().getSimpleName() );

        System.out.println("*****************Type Conversion********************");

        int num = 5;        
        System.out.println("Before Conversion num : "+num);
        double num2 = num;
        System.out.println("After Conversion num : "+num2);
        
        double num3 = 18.5;
        System.out.println("Before Conversion num3 : "+num3);
        int num4 = (int)num3;
        System.out.println("After Conversion num3 : "+num4);

        
       


        

    }
}
