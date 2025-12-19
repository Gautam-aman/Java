package pattern;

class demo{
   // public static demo instance = null;
    private static int count = 0;
    private demo(){};

    public static demo getInstance() {
        if (count <= 2){
            count++;
            return new demo();
        }
        else{
            throw new RuntimeException("<UNK>");
        }
    }

}

public class Test {
    public static void main(String[] args) {
       // demo demo2 = new demo();
          //demo demo1 = demo.insatnce.getInstance();
         demo demo2 = demo.getInstance();
        demo demo3 = demo.getInstance();
      //  demo demo4 = demo.getInstance();
       // demo demo5 = demo.getInstance();
        System.out.println(demo3);
       // System.out.println(demo4);
        System.out.println(demo2);
    }
}
