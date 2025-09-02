import java.util.*;
import java.math.*;


public class Main{
    public static void main(String[] args) {
      //Arraylist
        //int []  aman= new int[4];  array
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2= new ArrayList<>();
        l2.add(41);
        l2.add(67);
        l2.add(69);
        l1.add(4);
        l1.add(6);
        l1.add(7);
        l1.add(3,4); //adding element
        l1.addAll(4,l2);
        for (int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(" ");
        }
        l2.clear(); //will clear everything
        System.out.println(l1.contains(3));
        for (int i =0 ; i<l2.size(); i++){
            System.out.println(l2.get(i));
        }


    }
}