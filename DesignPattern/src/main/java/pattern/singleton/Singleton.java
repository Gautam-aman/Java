package pattern.singleton;


class Single{

    static Single instance = null;
    private Single(){
        System.out.println("Object Created");
    }

    static Single getInstance(){
        if (instance == null) { // 1st check (no locking)
            synchronized (Single.class) {
                if (instance == null) { // 2nd check (with locking)
                    instance = new Single();
                }
            }
        }
        return instance;
    }
}

public class Singleton {
    public static void main(String[] args) {
        Single single=Single.getInstance();
        Single single1=Single.getInstance();
        System.out.println(single==single1);
    }
}
