import java.util.Scanner;

interface camera{
    void takephoto();
    void recordvideo();
    private void addtodefault(){
        System.out.println("okay");
    }
    default record4k(){
        addtodefault();
        System.out.println("recording in pk");
    }
}

interface wifi{
    String [ ] getnetworks();
    void connecttonetwork(String network);
}

class myphone{
    double number;
    void callnumber(double num){
        System.out.println("calling "+ num);
        number=num;
    }
    void pickcass(){
        System.out.println("you are talking to "+ number);

    }

}

class smartphone extends myphone implements camera,wifi{
    public void takephoto(){
        System.out.println("taking photo smile");
    }
    public void recordvideo(){
        System.out.println("recording video");
    }

    public String[] getnetworks(){
        System.out.println("getting networks");
        String [] network= {"aman","kishan","cool"};
        return network;

    }

    public void connecttonetwork(String netwrk){
        System.out.println("conecting to network");
    }


}

public class Main{
    public static void main(String[] args) {

        smartphone apple= new smartphone();
        apple.recordvideo();
        apple.callnumber(9118602006);

    }
}