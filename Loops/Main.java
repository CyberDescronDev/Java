package Loops;

public class Main {
    public static void main(String[] args) {

        for(int i=0;i<=10;i+=2){
            System.out.println(i);
        }
        int i=0;
        while(i<10){
            i+=2;
            System.out.println(i);
        }
        i = 0;
        do{
            i+=2;
            System.out.println(i);
        }while(i<10);

        for(int j = 0;j<=10;j++){
            if(j == 3 || j== 5){
                continue;
            }
            System.out.println(j);
        }


    }
}
