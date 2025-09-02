import java.util.ArrayDeque;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        ArrayDeque<Integer> a1 = new ArrayDeque<>();
        a1.add(23);
        a1.add(32);
        for (int i =0 ; i<a1.size();i++){
            System.out.println(a1.get(i));
        }
    }
}