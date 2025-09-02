import java.util.Scanner;

class base{
    base(){
        System.out.println("I am base constructor");
    }
    base(int x){
        System.out.println("i am constructor with value "+ x);
    }


}

class derived extends base{
    derived(){
        super(0);  // for using value wala constructor of base class use super keyword
        System.out.println("I am derived constructor");
    }
    derived(int y){
        super(0);
        System.out.println("contructor of derived with value " + y);
    }
}

class childofderived extends derived {
    childofderived(){
        super(1);
        System.out.println("constructor of child of derived");
    }


}


public class constructors_in_inheritance {
    public static void main(String[] args) {

        //base aman = new base();
        //derived kishan = new derived();
        childofderived key = new childofderived();

    }
}
