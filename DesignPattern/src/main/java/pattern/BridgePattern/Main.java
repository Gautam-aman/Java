package pattern.BridgePattern;

interface Engine{
    public void start();
}

class PetrolEngine implements Engine{
    @Override
    public void start(){
        System.out.println("Petrol engine start");
    }
}

class DiselEngine implements Engine{
    @Override
    public void start(){
        System.out.println("Disel engine start");
    }
}

abstract class Car {
    protected Engine engine;            // <- changed to protected

    public Car(Engine engine) {
        this.engine = engine;
    }

    public abstract void run();
}

class Sedan extends Car {

    public Sedan(Engine engine) {
        super(engine);
    }

    @Override
    public void run() {
        engine.start();
        System.out.println("Sedan run");
    }
}

class Suv extends Car {

    public Suv(Engine engine) {
        super(engine);
    }

    @Override
    public void run() {
        engine.start();
        System.out.println("Suv run");
    }
}

public class Main {
    public static void main(String[] args) {

        Car car = new Suv(new DiselEngine());
        car.run();
        Car car2 = new Sedan(new PetrolEngine());
        car2.run();

    }
}
