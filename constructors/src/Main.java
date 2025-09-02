import java.util.Scanner;

class employee{
    int salary;
    String name;
    Scanner sc= new Scanner(System.in);

    public employee(){
        System.out.println("Enter your name");
        String name1= sc.nextLine();
        System.out.println("enter Your salary");
        int salary1= sc.nextInt();
        name=name1;
        salary=salary1;
    }

    void getdata(){
        System.out.println("Your name is "+ name);
        System.out.println("Your salary is "+ salary);
    }

}

public class Main{
    public static void main(String[] args) {
        employee aman= new employee();
        aman.getdata();

    }
}