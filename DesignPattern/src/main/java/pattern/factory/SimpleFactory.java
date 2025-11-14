package pattern.factory;

abstract class Burger{
    abstract void prepare();
}

class simpleBurger extends Burger{
    @Override
    void prepare() {
        System.out.println("Prepare Simple Burger");
    }
}

class CheeseBurger extends Burger{
    @Override
    void prepare() {
        System.out.println("Prepare Cheese Burger");
    }
}

class BurgerFactory{
    Burger createBurger(String type){
        if(type.equals("simple")){
            return new simpleBurger();
        }
        else{
            return new CheeseBurger();
        }
    }
}

public class SimpleFactory {
    public static void main(String[] args) {
        String type = "simple";
        BurgerFactory burgerFactory = new BurgerFactory();
        Burger burger = burgerFactory.createBurger(type);
        burger.prepare();
    }


}
