package pattern.factory;

abstract class Burger1{
    abstract void prepare();
}

class SimpleBurger1 extends Burger1{
    @Override
    void prepare() {
        System.out.println("Preparing Simple Burger1");
    }
}

class PremiumBurger1 extends Burger1{
    @Override
    void prepare() {
        System.out.println("Premium Burger1");
    }
}

class SimpleWheatBurger1 extends Burger1{
    @Override
    void prepare() {
        System.out.println("Preparing Simple Wheat Burger1");
    }
}

class PremiumWheatBurger1 extends Burger1{
    @Override
    void prepare() {
        System.out.println("Premium Wheat Burger1");
    }
}

class SinghBurgerFactory{
    Burger1 createBurger1(String typ){
        if(typ.equals("simple")){
            return new SimpleBurger1();
        }
        else return new PremiumBurger1();
    }
}

class KingBurgerFactory{
    Burger1 createBurger1(String typ){
        if(typ.equals("simple")){
            return new SimpleWheatBurger1();
        }
        else return new PremiumWheatBurger1();
    }
}

public class FactoryMethod {

    public static void main(String[] args) {
        KingBurgerFactory burgerFactory = new KingBurgerFactory();
        Burger1 burger1 = burgerFactory.createBurger1("simple");
        burger1.prepare();
    }

}
