import java.util.Scanner;

public class Main{

    static void pattern(int n){
        for(int i =0; i<n ; i++){
            for (int j=0 ; j <i ; j++ ){
                System.out.print("*");
            }System.out.println();
        }
    }

    static void fibseries(int n){
        int n1=0;
        int n2=1;
        int n3;
        System.out.print(n1+ " "+n2);
        for(int i =0 ; i<n ; i++){
            n3= n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }

    public static void main(String[] args) {

        //pattern(61);
        fibseries(7);

    }
}