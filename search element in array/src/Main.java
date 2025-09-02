import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int [] aman = {1,2,3,4,6,7,8,5};
        System.out.println("enter you want to search");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        for (int i=0; i<aman.length ; i++){
            if (target==aman[i]){
                System.out.println("Element is present at index "+ i);
                break;
            }

        }
    }
}