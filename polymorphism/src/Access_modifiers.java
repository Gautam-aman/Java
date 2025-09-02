import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

class c{
    public int x;
    protected int y = 49;
    private int pvt = 69;
}

class d extends c{
    void fncn(){
        System.out.println(x);
        System.out.println(y);
        //System.out.println(pvt);
       // System.out.println(pvt);
    }

}

public class Access_modifiers {
    public static void main(String[] args) {


        d aman= new d();
        c kishan3 =  new c();
        kishan3.x=78;
        kishan3.y=67;
        System.out.println(kishan3.x);
        System.out.println(kishan3.y);
        //System.out.println(kishan3.pvt);

        aman.fncn();

    }
}
