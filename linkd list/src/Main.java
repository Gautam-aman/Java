import java.util.*;

public class Main{
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(45);
        l1.add(67);
        l1.addLast(99);
        l1.add(77);
        l1.add(1,56);
        for (int i=0 ; i<l1.size(); i++){
            System.out.println(l1.get(i));
        }

    }
}