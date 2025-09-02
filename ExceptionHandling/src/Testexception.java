public class Testexception {

    public static void main(String[] args) {

        try{
            int num = 10/0;
            System.out.println(num);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("completed");
        }
    }

}
