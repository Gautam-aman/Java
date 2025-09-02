package org.aman;

public class Car {
    private Engine engine;
    public void drive(){
        int start = engine.start();
        if(start >= 1){
            System.out.println("run");
        }
        else{
            System.out.println("Dont run");
        }
    }
}
