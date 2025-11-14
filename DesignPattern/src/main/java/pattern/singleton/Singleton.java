package pattern.singleton;


class Single{

    static Single Instance = null;
    private Single(){
        System.out.println("Object Created");
    }

    static Single getInstance(){
        if (Instance==null){
            Instance=new Single();
        }
        return Instance;
    }
}

public class Singleton {
    public static void main(String[] args) {
        Single single=Single.getInstance();
        Single single1=Single.getInstance();
        System.out.println(single==single1);
    }
}
