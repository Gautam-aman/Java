public abstract class Animal{
    abstract void bark();
}

class Dog extends Animal{
    void bark(){
        System.out.println("I'm Dog");
    }
}