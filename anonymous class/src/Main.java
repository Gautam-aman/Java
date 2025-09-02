interface demo{
    void meth1();
    void meth2();
}
class aman implements demo{

    @Override
    public void meth1() {
        System.out.println("meth1");
    }

    public void meth2(){
        System.out.println("meth2");
    }

    public void aman(){
       System.out.println("aman iis great");
   }
}

   public class Main{
       public static void main(String[] args) {
           System.out.println("hello world");
           demo kishan = new demo() {
               @Override
               public void meth1() {
                   System.out.println("math1");
               }

               @Override
               public void meth2() {
                   System.out.println("math2");

               }
           };
       }
}
