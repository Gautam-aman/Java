import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       /* for (int i = 0 ; i<20; i++){
            System.out.println(i);
            if(i==4){
                continue;
            }
        } */

        int i =0;
        while(i<20){
            System.out.println(i);
            if (i==4){
                continue;

            }
            i++;
        }
    }
}