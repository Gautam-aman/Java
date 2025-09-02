public interface Animal {
    void eat();
    void sound();
}

class Dog  implements Animal {
    @Override
    public void eat() {
        System.out.println("<Dog eat>");
    }

    @Override
    public void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Dog {
    @Override
    public void sound() {
        System.out.println("<Cat sound>");
    }

    @Override
    public void eat() {
        System.out.println("<Cat eat>");
    }

    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();
    }
}
