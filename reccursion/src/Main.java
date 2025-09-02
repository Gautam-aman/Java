import java.util.Scanner;

public class Main{

    static int fact(int num){
        if (num ==0 || num ==1){
            return 1;
        }
        else{
            return num*fact(num-1);
        }
    }

    public static void main(String[] args) {

    int x= fact(5);
        System.out.println(x);
    }
}