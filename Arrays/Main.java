package Arrays;

public class Main {
    public static void main(String[] args) {
        String[] strArr = new String[3];
        strArr[0] = "Captain";
        strArr[1] = "Jack";
        strArr[2] = "Sparrow";
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        System.out.println(strArr[2]);
        System.out.println("------------------------------");

        for (String string : strArr) {
            System.out.println(string);
        }

        int[] intArr = {1,2,3,4,5};
        intArr[0] = 6;
        for (int i : intArr) {
            System.out.println(i);
        }
        System.out.println(intArr.length);

        double[][] doubleArr = {
                                {1,1.1,1.2},
                                {2,2.1,2.2},
                                {3,3.1,3.2}
                                };
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println(doubleArr[i][j]);
            }
        }
                                
    }
}
