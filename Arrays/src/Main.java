import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int [] marks= new int[5];
        marks[0]=44;
        marks[1]=45;
        marks[2]=46;
        marks[3]=47;
        marks[4]=48;
        int [] marks1 = {1,2,3,4,5};
        System.out.println(marks[4]);
        System.out.println(marks1[2]);
        System.out.println(marks.length);


        for(int i=0 ; i < marks1.length; i++){
            System.out.print(marks1[i]+"-");

        }

        //dispay using for each loop
        System.out.println("\n");

        for(int element:marks){
            System.out.print(element+"  ");
        }


    }
}