import java.util.Scanner;

public class Main{

    static int varsum(int ...arr){ //use (int x, int ...arr) if one element is compulsory
        //available as int array;
        int sum=0;
        for(int a:arr){
            sum += a;
        }
        return sum;

    }
    public static void main(String[] args) {

       int c= varsum(1,2,3);
        System.out.println(c);

    }
}