import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array={1,2,3,8,5,6};

        int maximum = 0;

        for (int i=0; i<array.length; i++){
            if(array[i]>maximum){
                maximum=array[i];
            }
        }
        System.out.println(maximum);

    }
}