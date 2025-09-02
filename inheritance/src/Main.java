import com.sun.security.jgss.GSSUtil;

import  java.util.Scanner;

class worker{
    String name;
    int salary;
    Scanner sc = new Scanner(System.in);

    public worker (){
        System.out.println("Enter your name");
        String nam= sc.nextLine();
        System.out.println("enter your salary");
        int sal= sc.nextInt();
        name=nam;
        salary=sal;

    }
}

class employee extends worker{
    public employee(){
        System.out.println("the nme of employee is "+ name);
        System.out.println("the salary of employe is "+ salary);
    }
}

public class Main{
    public static void main(String[] args) {
        worker aman= new worker();
        employee kishan= new employee();

    }
}