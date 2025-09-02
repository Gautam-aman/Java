import java.util.Scanner;

class Employee{
    String name;
    int salary;
    Scanner sc= new Scanner(System.in);

    public void setdata(){

        System.out.println("Enter Your Name");
        name =sc.nextLine();
        System.out.println("Enter your salary");
        salary = sc.nextInt();




    }
    public void getdata(){
        System.out.println("The name of employee "+ name);
        System.out.println("The salary of employee "+ salary);
    }


}

public class Main {
    public static void main(String[] args) {
        System.out.println("This is out first Class");
        Employee aman = new Employee();
        Employee john = new Employee();
        aman.setdata();
        john.setdata();
        john.getdata();
        aman.getdata();
    }
}