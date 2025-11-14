package pattern.singleton;


class Single {

    private Single() {
        System.out.println("Object Created");
    }

    private static class SingletonHelper {
        private static final Single INSTANCE = new Single();
    }

    public static Single getInstance() {
        return SingletonHelper.INSTANCE;
    }
}


public class Singleton {
    public static void main(String[] args) {
        Single single=Single.getInstance();
        Single single1=Single.getInstance();
        System.out.println(single==single1);
    }
}
