import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer > l1 = new ArrayList<>();
        l1.add(45);
        l1.add(46);
        for (int i =0 ;  i<l1.size() ; i++){
            System.out.println(l1.get(i));
        }
    }
}